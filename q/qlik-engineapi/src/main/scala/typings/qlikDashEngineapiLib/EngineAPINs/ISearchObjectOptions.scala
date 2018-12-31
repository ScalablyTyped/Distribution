package typings
package qlikDashEngineapiLib.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SearchObjectOptions...
  */
trait ISearchObjectOptions extends js.Object {
  /**
    * This array is either empty or contains qProperty.
    */
  var qAttributes: js.Array[java.lang.String]
  /* add new member  */
  /**
    * Encoding used to compute qRanges of type SearchCharRange.
    * Possible values:
    * - Utf8 (default)
    * - Utf16
    *
    * Note: Only affects the computation of the ranges. It does not impact the encoding of the text.
    */
  var qCharEncoding: java.lang.String
}


package typings
package qlikDashEngineapiLib.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SearchTermResult...
  */
trait ISearchTermResult extends js.Object {
  /**
    * Element number of the associated value.
    */
  var qElemNumber: scala.Double
  /**
    * List of ranges.
    * For example, if the user searches the term read and the associative value is Reading,
    * then the corresponding range would be Read in Reading.
    */
  var qRanges: js.Array[ISearchCharRange]
  /**
    * Text of the associated value.
    */
  var qText: java.lang.String
}


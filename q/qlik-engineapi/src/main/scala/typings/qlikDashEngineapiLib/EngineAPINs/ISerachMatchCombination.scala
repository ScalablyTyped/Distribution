package typings
package qlikDashEngineapiLib.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SerachMatchCombination...
  */
trait ISerachMatchCombination extends js.Object {
  /**
    * Information about the search matches.
    */
  var qFieldMatches: js.Array[ISerachFieldMatch]
  /**
    * Index of the search result, starting from 0.
    */
  var qId: scala.Double
}


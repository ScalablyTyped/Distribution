package typings
package qlikDashEngineapiLib.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SearchCharRange...
  */
trait ISearchCharRange extends js.Object {
  /**
    * Length of the match in the search result.
    */
  var qCharCount: scala.Double
  /**
    * Starting position of the match in the search result, starting from 0.
    */
  var qCharPos: scala.Double
  /**
    * Position of the term in the list of search terms, starting from 0.
    */
  var qTerm: scala.Double
}


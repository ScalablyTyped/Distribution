package typings
package qlikDashEngineapiLib.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NxStateCounts...
  */
trait INxStateCounts extends js.Object {
  /**
    * Number of values in alternative state.
    * Integer
    */
  var qAlternative: scala.Double
  /**
    * Number of values in deselected state.
    * Integer
    */
  var qDeselected: scala.Double
  /**
    * Number of values in excluded state
    * Integer
    */
  var qExcluded: scala.Double
  /**
    * Number of values in locked state.
    * Integer
    */
  var qLocked: scala.Double
  /**
    * Number of values in locked excluded state.
    * Integer
    */
  var qLockedExcluded: scala.Double
  /**
    * Number of values in optional state.
    * Integer
    */
  var qOption: js.UndefOr[scala.Double] = js.undefined
  /**
    * Number of values in selected state.
    * Integer
    */
  var qSelected: scala.Double
  /**
    * Number of values in selected excluded state.
    * Integer
    */
  var qSelectedExcluded: scala.Double
}


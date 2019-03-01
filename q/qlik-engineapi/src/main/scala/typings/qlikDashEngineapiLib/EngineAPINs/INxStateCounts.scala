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

object INxStateCounts {
  @scala.inline
  def apply(
    qAlternative: scala.Double,
    qDeselected: scala.Double,
    qExcluded: scala.Double,
    qLocked: scala.Double,
    qLockedExcluded: scala.Double,
    qSelected: scala.Double,
    qSelectedExcluded: scala.Double,
    qOption: scala.Int | scala.Double = null
  ): INxStateCounts = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("qAlternative")(qAlternative)
    __obj.updateDynamic("qDeselected")(qDeselected)
    __obj.updateDynamic("qExcluded")(qExcluded)
    __obj.updateDynamic("qLocked")(qLocked)
    __obj.updateDynamic("qLockedExcluded")(qLockedExcluded)
    __obj.updateDynamic("qSelected")(qSelected)
    __obj.updateDynamic("qSelectedExcluded")(qSelectedExcluded)
    if (qOption != null) __obj.updateDynamic("qOption")(qOption.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxStateCounts]
  }
}


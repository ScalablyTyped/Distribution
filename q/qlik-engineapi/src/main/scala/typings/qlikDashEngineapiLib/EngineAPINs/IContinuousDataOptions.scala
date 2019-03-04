package typings
package qlikDashEngineapiLib.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Container for the dynamic properties of an attribute expression.
  */
trait IContinuousDataOptions extends js.Object {
  /**
    * End value.
    */
  var qEnd: scala.Double
  /**
    * Maximum number of ticks.
    */
  var qMaxNbrTicks: scala.Double
  /**
    * Number of bins for binning.
    */
  var qNbrPoints: scala.Double
  /**
    * Start value.
    */
  var qStart: scala.Double
}

object IContinuousDataOptions {
  @scala.inline
  def apply(qEnd: scala.Double, qMaxNbrTicks: scala.Double, qNbrPoints: scala.Double, qStart: scala.Double): IContinuousDataOptions = {
    val __obj = js.Dynamic.literal(qEnd = qEnd, qMaxNbrTicks = qMaxNbrTicks, qNbrPoints = qNbrPoints, qStart = qStart)
  
    __obj.asInstanceOf[IContinuousDataOptions]
  }
}


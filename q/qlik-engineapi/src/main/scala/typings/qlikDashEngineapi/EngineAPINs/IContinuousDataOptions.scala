package typings.qlikDashEngineapi.EngineAPINs

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
  var qEnd: Double
  /**
    * Maximum number of ticks.
    */
  var qMaxNbrTicks: Double
  /**
    * Number of bins for binning.
    */
  var qNbrPoints: Double
  /**
    * Start value.
    */
  var qStart: Double
}

object IContinuousDataOptions {
  @scala.inline
  def apply(qEnd: Double, qMaxNbrTicks: Double, qNbrPoints: Double, qStart: Double): IContinuousDataOptions = {
    val __obj = js.Dynamic.literal(qEnd = qEnd, qMaxNbrTicks = qMaxNbrTicks, qNbrPoints = qNbrPoints, qStart = qStart)
  
    __obj.asInstanceOf[IContinuousDataOptions]
  }
}


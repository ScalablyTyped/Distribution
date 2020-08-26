package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Container for the dynamic properties of an attribute expression.
  */
@js.native
trait IContinuousDataOptions extends js.Object {
  /**
    * End value.
    */
  var qEnd: Double = js.native
  /**
    * Maximum number of ticks.
    */
  var qMaxNbrTicks: Double = js.native
  /**
    * Number of bins for binning.
    */
  var qNbrPoints: Double = js.native
  /**
    * Start value.
    */
  var qStart: Double = js.native
}

object IContinuousDataOptions {
  @scala.inline
  def apply(qEnd: Double, qMaxNbrTicks: Double, qNbrPoints: Double, qStart: Double): IContinuousDataOptions = {
    val __obj = js.Dynamic.literal(qEnd = qEnd.asInstanceOf[js.Any], qMaxNbrTicks = qMaxNbrTicks.asInstanceOf[js.Any], qNbrPoints = qNbrPoints.asInstanceOf[js.Any], qStart = qStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[IContinuousDataOptions]
  }
  @scala.inline
  implicit class IContinuousDataOptionsOps[Self <: IContinuousDataOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setQEnd(value: Double): Self = this.set("qEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def setQMaxNbrTicks(value: Double): Self = this.set("qMaxNbrTicks", value.asInstanceOf[js.Any])
    @scala.inline
    def setQNbrPoints(value: Double): Self = this.set("qNbrPoints", value.asInstanceOf[js.Any])
    @scala.inline
    def setQStart(value: Double): Self = this.set("qStart", value.asInstanceOf[js.Any])
  }
  
}


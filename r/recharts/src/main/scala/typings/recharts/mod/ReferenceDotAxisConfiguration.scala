package typings.recharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReferenceDotAxisConfiguration extends js.Object {
  var scale: ScaleCalculator = js.native
}

object ReferenceDotAxisConfiguration {
  @scala.inline
  def apply(scale: /* x */ Double | String => Double): ReferenceDotAxisConfiguration = {
    val __obj = js.Dynamic.literal(scale = js.Any.fromFunction1(scale))
    __obj.asInstanceOf[ReferenceDotAxisConfiguration]
  }
  @scala.inline
  implicit class ReferenceDotAxisConfigurationOps[Self <: ReferenceDotAxisConfiguration] (val x: Self) extends AnyVal {
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
    def setScale(value: /* x */ Double | String => Double): Self = this.set("scale", js.Any.fromFunction1(value))
  }
  
}


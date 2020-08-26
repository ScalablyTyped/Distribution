package typings.screeps.anon

import typings.screeps.PowerClassConstant
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassName extends js.Object {
  var className: PowerClassConstant = js.native
  var cooldown: Double = js.native
  var duration: js.UndefOr[Double | js.Array[Double]] = js.native
  var effect: js.UndefOr[js.Array[Double]] = js.native
  var level: js.Array[Double] = js.native
  var ops: js.UndefOr[Double | js.Array[Double]] = js.native
  var range: js.UndefOr[Double] = js.native
}

object ClassName {
  @scala.inline
  def apply(className: PowerClassConstant, cooldown: Double, level: js.Array[Double]): ClassName = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], cooldown = cooldown.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassName]
  }
  @scala.inline
  implicit class ClassNameOps[Self <: ClassName] (val x: Self) extends AnyVal {
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
    def setClassName(value: PowerClassConstant): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def setCooldown(value: Double): Self = this.set("cooldown", value.asInstanceOf[js.Any])
    @scala.inline
    def setLevelVarargs(value: Double*): Self = this.set("level", js.Array(value :_*))
    @scala.inline
    def setLevel(value: js.Array[Double]): Self = this.set("level", value.asInstanceOf[js.Any])
    @scala.inline
    def setDurationVarargs(value: Double*): Self = this.set("duration", js.Array(value :_*))
    @scala.inline
    def setDuration(value: Double | js.Array[Double]): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    @scala.inline
    def setEffectVarargs(value: Double*): Self = this.set("effect", js.Array(value :_*))
    @scala.inline
    def setEffect(value: js.Array[Double]): Self = this.set("effect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEffect: Self = this.set("effect", js.undefined)
    @scala.inline
    def setOpsVarargs(value: Double*): Self = this.set("ops", js.Array(value :_*))
    @scala.inline
    def setOps(value: Double | js.Array[Double]): Self = this.set("ops", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOps: Self = this.set("ops", js.undefined)
    @scala.inline
    def setRange(value: Double): Self = this.set("range", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
  }
  
}


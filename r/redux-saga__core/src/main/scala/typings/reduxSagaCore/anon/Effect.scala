package typings.reduxSagaCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Effect extends js.Object {
  var effect: js.Any = js.native
  var effectId: Double = js.native
  var label: js.UndefOr[String] = js.native
  var parentEffectId: Double = js.native
}

object Effect {
  @scala.inline
  def apply(effect: js.Any, effectId: Double, parentEffectId: Double): Effect = {
    val __obj = js.Dynamic.literal(effect = effect.asInstanceOf[js.Any], effectId = effectId.asInstanceOf[js.Any], parentEffectId = parentEffectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Effect]
  }
  @scala.inline
  implicit class EffectOps[Self <: Effect] (val x: Self) extends AnyVal {
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
    def setEffect(value: js.Any): Self = this.set("effect", value.asInstanceOf[js.Any])
    @scala.inline
    def setEffectId(value: Double): Self = this.set("effectId", value.asInstanceOf[js.Any])
    @scala.inline
    def setParentEffectId(value: Double): Self = this.set("parentEffectId", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
  }
  
}


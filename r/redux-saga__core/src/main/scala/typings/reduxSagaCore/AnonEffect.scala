package typings.reduxSagaCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEffect extends js.Object {
  var effect: js.Any
  var effectId: Double
  var label: js.UndefOr[String] = js.undefined
  var parentEffectId: Double
}

object AnonEffect {
  @scala.inline
  def apply(effect: js.Any, effectId: Double, parentEffectId: Double, label: String = null): AnonEffect = {
    val __obj = js.Dynamic.literal(effect = effect.asInstanceOf[js.Any], effectId = effectId.asInstanceOf[js.Any], parentEffectId = parentEffectId.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEffect]
  }
}


package typings
package atReduxDashSagaCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Effect extends js.Object {
  var effect: js.Any
  var effectId: scala.Double
  var label: js.UndefOr[java.lang.String] = js.undefined
  var parentEffectId: scala.Double
}

object Anon_Effect {
  @scala.inline
  def apply(
    effect: js.Any,
    effectId: scala.Double,
    parentEffectId: scala.Double,
    label: java.lang.String = null
  ): Anon_Effect = {
    val __obj = js.Dynamic.literal(effect = effect, effectId = effectId, parentEffectId = parentEffectId)
    if (label != null) __obj.updateDynamic("label")(label)
    __obj.asInstanceOf[Anon_Effect]
  }
}


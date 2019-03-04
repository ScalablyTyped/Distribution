package typings
package atReduxDashSagaCoreLib.effectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TakeEffectDescriptor extends js.Object {
  var maybe: js.UndefOr[scala.Boolean] = js.undefined
  var pattern: atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.ActionPattern[reduxLib.reduxMod.Action[_]]
}

object TakeEffectDescriptor {
  @scala.inline
  def apply(
    pattern: atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.ActionPattern[reduxLib.reduxMod.Action[_]],
    maybe: js.UndefOr[scala.Boolean] = js.undefined
  ): TakeEffectDescriptor = {
    val __obj = js.Dynamic.literal(pattern = pattern.asInstanceOf[js.Any])
    if (!js.isUndefined(maybe)) __obj.updateDynamic("maybe")(maybe)
    __obj.asInstanceOf[TakeEffectDescriptor]
  }
}


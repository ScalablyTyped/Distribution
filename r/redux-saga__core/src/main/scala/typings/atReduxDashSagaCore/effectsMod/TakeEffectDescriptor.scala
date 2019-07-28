package typings.atReduxDashSagaCore.effectsMod

import typings.atReduxDashSagaTypes.atReduxDashSagaTypesMod.ActionPattern
import typings.redux.reduxMod.Action
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TakeEffectDescriptor extends js.Object {
  var maybe: js.UndefOr[Boolean] = js.undefined
  var pattern: ActionPattern[Action[_]]
}

object TakeEffectDescriptor {
  @scala.inline
  def apply(pattern: ActionPattern[Action[_]], maybe: js.UndefOr[Boolean] = js.undefined): TakeEffectDescriptor = {
    val __obj = js.Dynamic.literal(pattern = pattern.asInstanceOf[js.Any])
    if (!js.isUndefined(maybe)) __obj.updateDynamic("maybe")(maybe)
    __obj.asInstanceOf[TakeEffectDescriptor]
  }
}


package typings.atReduxDashSagaCore.effectsMod

import typings.atReduxDashSagaTypes.atReduxDashSagaTypesMod.ActionPattern
import typings.atReduxDashSagaTypes.atReduxDashSagaTypesMod.Buffer
import typings.redux.reduxMod.Action
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionChannelEffectDescriptor extends js.Object {
  var buffer: js.UndefOr[Buffer[Action[_]]] = js.undefined
  var pattern: ActionPattern[Action[_]]
}

object ActionChannelEffectDescriptor {
  @scala.inline
  def apply(pattern: ActionPattern[Action[_]], buffer: Buffer[Action[_]] = null): ActionChannelEffectDescriptor = {
    val __obj = js.Dynamic.literal(pattern = pattern.asInstanceOf[js.Any])
    if (buffer != null) __obj.updateDynamic("buffer")(buffer)
    __obj.asInstanceOf[ActionChannelEffectDescriptor]
  }
}


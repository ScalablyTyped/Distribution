package typings
package atReduxDashSagaCoreLib.effectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionChannelEffectDescriptor extends js.Object {
  var buffer: js.UndefOr[
    atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.Buffer[reduxLib.reduxMod.Action[_]]
  ] = js.undefined
  var pattern: atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.ActionPattern[reduxLib.reduxMod.Action[_]]
}

object ActionChannelEffectDescriptor {
  @scala.inline
  def apply(
    pattern: atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.ActionPattern[reduxLib.reduxMod.Action[_]],
    buffer: atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.Buffer[reduxLib.reduxMod.Action[_]] = null
  ): ActionChannelEffectDescriptor = {
    val __obj = js.Dynamic.literal(pattern = pattern.asInstanceOf[js.Any])
    if (buffer != null) __obj.updateDynamic("buffer")(buffer)
    __obj.asInstanceOf[ActionChannelEffectDescriptor]
  }
}


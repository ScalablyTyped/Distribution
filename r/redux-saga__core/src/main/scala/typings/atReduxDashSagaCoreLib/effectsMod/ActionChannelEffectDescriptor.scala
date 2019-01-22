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


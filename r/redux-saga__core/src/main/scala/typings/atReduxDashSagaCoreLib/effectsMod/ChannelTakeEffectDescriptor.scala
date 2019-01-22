package typings
package atReduxDashSagaCoreLib.effectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelTakeEffectDescriptor[T] extends js.Object {
  var channel: atReduxDashSagaCoreLib.atReduxDashSagaCoreMod.TakeableChannel[T]
  var maybe: js.UndefOr[scala.Boolean] = js.undefined
  var pattern: js.UndefOr[atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.Pattern[T]] = js.undefined
}


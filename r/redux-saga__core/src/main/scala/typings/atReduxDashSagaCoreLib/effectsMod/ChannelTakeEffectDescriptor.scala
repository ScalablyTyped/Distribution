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

object ChannelTakeEffectDescriptor {
  @scala.inline
  def apply[T](
    channel: atReduxDashSagaCoreLib.atReduxDashSagaCoreMod.TakeableChannel[T],
    maybe: js.UndefOr[scala.Boolean] = js.undefined,
    pattern: atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.Pattern[T] = null
  ): ChannelTakeEffectDescriptor[T] = {
    val __obj = js.Dynamic.literal(channel = channel)
    if (!js.isUndefined(maybe)) __obj.updateDynamic("maybe")(maybe)
    if (pattern != null) __obj.updateDynamic("pattern")(pattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelTakeEffectDescriptor[T]]
  }
}


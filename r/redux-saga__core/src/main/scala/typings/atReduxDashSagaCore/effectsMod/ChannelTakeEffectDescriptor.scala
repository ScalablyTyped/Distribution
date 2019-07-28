package typings.atReduxDashSagaCore.effectsMod

import typings.atReduxDashSagaCore.atReduxDashSagaCoreMod.TakeableChannel
import typings.atReduxDashSagaTypes.atReduxDashSagaTypesMod.Pattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelTakeEffectDescriptor[T] extends js.Object {
  var channel: TakeableChannel[T]
  var maybe: js.UndefOr[Boolean] = js.undefined
  var pattern: js.UndefOr[Pattern[T]] = js.undefined
}

object ChannelTakeEffectDescriptor {
  @scala.inline
  def apply[T](channel: TakeableChannel[T], maybe: js.UndefOr[Boolean] = js.undefined, pattern: Pattern[T] = null): ChannelTakeEffectDescriptor[T] = {
    val __obj = js.Dynamic.literal(channel = channel)
    if (!js.isUndefined(maybe)) __obj.updateDynamic("maybe")(maybe)
    if (pattern != null) __obj.updateDynamic("pattern")(pattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelTakeEffectDescriptor[T]]
  }
}


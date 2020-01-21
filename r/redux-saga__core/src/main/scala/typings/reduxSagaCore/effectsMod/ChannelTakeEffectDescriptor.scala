package typings.reduxSagaCore.effectsMod

import typings.reduxSagaCore.typesMod.TakeableChannel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelTakeEffectDescriptor[T] extends js.Object {
  var channel: TakeableChannel[T]
  var maybe: js.UndefOr[Boolean] = js.undefined
  var pattern: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Pattern<T> */ js.Any
  ] = js.undefined
}

object ChannelTakeEffectDescriptor {
  @scala.inline
  def apply[T](
    channel: TakeableChannel[T],
    maybe: js.UndefOr[Boolean] = js.undefined,
    pattern: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Pattern<T> */ js.Any = null
  ): ChannelTakeEffectDescriptor[T] = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any])
    if (!js.isUndefined(maybe)) __obj.updateDynamic("maybe")(maybe.asInstanceOf[js.Any])
    if (pattern != null) __obj.updateDynamic("pattern")(pattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelTakeEffectDescriptor[T]]
  }
}


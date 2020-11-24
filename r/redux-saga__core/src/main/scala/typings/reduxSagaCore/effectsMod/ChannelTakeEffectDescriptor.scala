package typings.reduxSagaCore.effectsMod

import typings.reduxSagaCore.typesMod.TakeableChannel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChannelTakeEffectDescriptor[T] extends js.Object {
  
  var channel: TakeableChannel[T] = js.native
  
  var maybe: js.UndefOr[Boolean] = js.native
  
  var pattern: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Pattern<T> */ js.Any
  ] = js.native
}
object ChannelTakeEffectDescriptor {
  
  @scala.inline
  def apply[T](channel: TakeableChannel[T]): ChannelTakeEffectDescriptor[T] = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelTakeEffectDescriptor[T]]
  }
  
  @scala.inline
  implicit class ChannelTakeEffectDescriptorOps[Self <: ChannelTakeEffectDescriptor[_], T] (val x: Self with ChannelTakeEffectDescriptor[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setChannel(value: TakeableChannel[T]): Self = this.set("channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaybe(value: Boolean): Self = this.set("maybe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaybe: Self = this.set("maybe", js.undefined)
    
    @scala.inline
    def setPattern(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Pattern<T> */ js.Any
    ): Self = this.set("pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePattern: Self = this.set("pattern", js.undefined)
  }
}

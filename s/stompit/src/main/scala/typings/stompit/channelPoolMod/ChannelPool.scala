package typings.stompit.channelPoolMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChannelPool extends js.Object {
  
  def channel(callback: js.Function2[/* err */ Error | Null, /* channel */ typings.stompit.channelMod.^, Unit]): Unit = js.native
  
  def close(): Unit = js.native
}
object ChannelPool {
  
  @scala.inline
  def apply(
    channel: js.Function2[/* err */ Error | Null, /* channel */ typings.stompit.channelMod.^, Unit] => Unit,
    close: () => Unit
  ): ChannelPool = {
    val __obj = js.Dynamic.literal(channel = js.Any.fromFunction1(channel), close = js.Any.fromFunction0(close))
    __obj.asInstanceOf[ChannelPool]
  }
  
  @scala.inline
  implicit class ChannelPoolOps[Self <: ChannelPool] (val x: Self) extends AnyVal {
    
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
    def setChannel(
      value: js.Function2[/* err */ Error | Null, /* channel */ typings.stompit.channelMod.^, Unit] => Unit
    ): Self = this.set("channel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setClose(value: () => Unit): Self = this.set("close", js.Any.fromFunction0(value))
  }
}

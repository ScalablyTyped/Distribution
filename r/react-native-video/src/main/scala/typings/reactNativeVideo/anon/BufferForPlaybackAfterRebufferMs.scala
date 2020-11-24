package typings.reactNativeVideo.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BufferForPlaybackAfterRebufferMs extends js.Object {
  
  var bufferForPlaybackAfterRebufferMs: js.UndefOr[Double] = js.native
  
  var bufferForPlaybackMs: js.UndefOr[Double] = js.native
  
  var maxBufferMs: js.UndefOr[Double] = js.native
  
  var minBufferMs: js.UndefOr[Double] = js.native
}
object BufferForPlaybackAfterRebufferMs {
  
  @scala.inline
  def apply(): BufferForPlaybackAfterRebufferMs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BufferForPlaybackAfterRebufferMs]
  }
  
  @scala.inline
  implicit class BufferForPlaybackAfterRebufferMsOps[Self <: BufferForPlaybackAfterRebufferMs] (val x: Self) extends AnyVal {
    
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
    def setBufferForPlaybackAfterRebufferMs(value: Double): Self = this.set("bufferForPlaybackAfterRebufferMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBufferForPlaybackAfterRebufferMs: Self = this.set("bufferForPlaybackAfterRebufferMs", js.undefined)
    
    @scala.inline
    def setBufferForPlaybackMs(value: Double): Self = this.set("bufferForPlaybackMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBufferForPlaybackMs: Self = this.set("bufferForPlaybackMs", js.undefined)
    
    @scala.inline
    def setMaxBufferMs(value: Double): Self = this.set("maxBufferMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxBufferMs: Self = this.set("maxBufferMs", js.undefined)
    
    @scala.inline
    def setMinBufferMs(value: Double): Self = this.set("minBufferMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinBufferMs: Self = this.set("minBufferMs", js.undefined)
  }
}

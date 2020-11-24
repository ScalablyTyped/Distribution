package typings.std

import typings.std.stdStrings.bytes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnderlyingByteSource extends js.Object {
  
  var autoAllocateChunkSize: js.UndefOr[Double] = js.native
  
  var cancel: js.UndefOr[ReadableStreamErrorCallback] = js.native
  
  var pull: js.UndefOr[ReadableByteStreamControllerCallback] = js.native
  
  var start: js.UndefOr[ReadableByteStreamControllerCallback] = js.native
  
  var `type`: bytes = js.native
}
object UnderlyingByteSource {
  
  @scala.inline
  def apply(`type`: bytes): UnderlyingByteSource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnderlyingByteSource]
  }
  
  @scala.inline
  implicit class UnderlyingByteSourceOps[Self <: UnderlyingByteSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setType(value: bytes): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoAllocateChunkSize(value: Double): Self = this.set("autoAllocateChunkSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoAllocateChunkSize: Self = this.set("autoAllocateChunkSize", js.undefined)
    
    @scala.inline
    def setCancel(value: /* reason */ js.Any => Unit | js.Thenable[Unit]): Self = this.set("cancel", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCancel: Self = this.set("cancel", js.undefined)
    
    @scala.inline
    def setPull(value: /* controller */ ReadableByteStreamController => Unit | js.Thenable[Unit]): Self = this.set("pull", js.Any.fromFunction1(value))
    
    @scala.inline
    def deletePull: Self = this.set("pull", js.undefined)
    
    @scala.inline
    def setStart(value: /* controller */ ReadableByteStreamController => Unit | js.Thenable[Unit]): Self = this.set("start", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
  }
}

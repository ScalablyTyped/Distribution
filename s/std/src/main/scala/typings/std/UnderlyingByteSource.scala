package typings.std

import typings.std.stdStrings.bytes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnderlyingByteSource extends StObject {
  
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
  implicit class UnderlyingByteSourceMutableBuilder[Self <: UnderlyingByteSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoAllocateChunkSize(value: Double): Self = StObject.set(x, "autoAllocateChunkSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoAllocateChunkSizeUndefined: Self = StObject.set(x, "autoAllocateChunkSize", js.undefined)
    
    @scala.inline
    def setCancel(value: /* reason */ js.Any => Unit | js.Thenable[Unit]): Self = StObject.set(x, "cancel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
    
    @scala.inline
    def setPull(value: /* controller */ ReadableByteStreamController => Unit | js.Thenable[Unit]): Self = StObject.set(x, "pull", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPullUndefined: Self = StObject.set(x, "pull", js.undefined)
    
    @scala.inline
    def setStart(value: /* controller */ ReadableByteStreamController => Unit | js.Thenable[Unit]): Self = StObject.set(x, "start", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    @scala.inline
    def setType(value: bytes): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

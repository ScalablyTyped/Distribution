package typings.std

import typings.std.stdStrings.bytes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnderlyingByteSource extends StObject {
  
  /* standard dom */
  var autoAllocateChunkSize: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var cancel: js.UndefOr[UnderlyingSourceCancelCallback] = js.undefined
  
  /* standard dom */
  var pull: js.UndefOr[
    js.Function1[/* controller */ ReadableByteStreamController, Unit | PromiseLike[Unit]]
  ] = js.undefined
  
  /* standard dom */
  var start: js.UndefOr[js.Function1[/* controller */ ReadableByteStreamController, Any]] = js.undefined
  
  /* standard dom */
  var `type`: bytes
}
object UnderlyingByteSource {
  
  inline def apply(): UnderlyingByteSource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("bytes")
    __obj.asInstanceOf[UnderlyingByteSource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UnderlyingByteSource] (val x: Self) extends AnyVal {
    
    inline def setAutoAllocateChunkSize(value: Double): Self = StObject.set(x, "autoAllocateChunkSize", value.asInstanceOf[js.Any])
    
    inline def setAutoAllocateChunkSizeUndefined: Self = StObject.set(x, "autoAllocateChunkSize", js.undefined)
    
    inline def setCancel(value: /* reason */ js.UndefOr[Any] => Unit | PromiseLike[Unit]): Self = StObject.set(x, "cancel", js.Any.fromFunction1(value))
    
    inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
    
    inline def setPull(value: /* controller */ ReadableByteStreamController => Unit | PromiseLike[Unit]): Self = StObject.set(x, "pull", js.Any.fromFunction1(value))
    
    inline def setPullUndefined: Self = StObject.set(x, "pull", js.undefined)
    
    inline def setStart(value: /* controller */ ReadableByteStreamController => Any): Self = StObject.set(x, "start", js.Any.fromFunction1(value))
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    inline def setType(value: bytes): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AudioWorkletNodeEventMap extends StObject {
  
  /* standard dom */
  var processorerror: Event
}
object AudioWorkletNodeEventMap {
  
  inline def apply(processorerror: Event): AudioWorkletNodeEventMap = {
    val __obj = js.Dynamic.literal(processorerror = processorerror.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioWorkletNodeEventMap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AudioWorkletNodeEventMap] (val x: Self) extends AnyVal {
    
    inline def setProcessorerror(value: Event): Self = StObject.set(x, "processorerror", value.asInstanceOf[js.Any])
  }
}

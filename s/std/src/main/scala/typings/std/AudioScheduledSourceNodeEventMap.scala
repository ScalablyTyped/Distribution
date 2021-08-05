package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AudioScheduledSourceNodeEventMap extends StObject {
  
  var ended: Event
}
object AudioScheduledSourceNodeEventMap {
  
  inline def apply(ended: Event): AudioScheduledSourceNodeEventMap = {
    val __obj = js.Dynamic.literal(ended = ended.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioScheduledSourceNodeEventMap]
  }
  
  extension [Self <: AudioScheduledSourceNodeEventMap](x: Self) {
    
    inline def setEnded(value: Event): Self = StObject.set(x, "ended", value.asInstanceOf[js.Any])
  }
}

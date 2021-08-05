package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaSourceEventMap extends StObject {
  
  var sourceclose: Event
  
  var sourceended: Event
  
  var sourceopen: Event
}
object MediaSourceEventMap {
  
  inline def apply(sourceclose: Event, sourceended: Event, sourceopen: Event): MediaSourceEventMap = {
    val __obj = js.Dynamic.literal(sourceclose = sourceclose.asInstanceOf[js.Any], sourceended = sourceended.asInstanceOf[js.Any], sourceopen = sourceopen.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaSourceEventMap]
  }
  
  extension [Self <: MediaSourceEventMap](x: Self) {
    
    inline def setSourceclose(value: Event): Self = StObject.set(x, "sourceclose", value.asInstanceOf[js.Any])
    
    inline def setSourceended(value: Event): Self = StObject.set(x, "sourceended", value.asInstanceOf[js.Any])
    
    inline def setSourceopen(value: Event): Self = StObject.set(x, "sourceopen", value.asInstanceOf[js.Any])
  }
}

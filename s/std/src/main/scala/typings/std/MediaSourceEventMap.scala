package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaSourceEventMap extends StObject {
  
  /* standard dom */
  var sourceclose: Event
  
  /* standard dom */
  var sourceended: Event
  
  /* standard dom */
  var sourceopen: Event
}
object MediaSourceEventMap {
  
  inline def apply(sourceclose: Event, sourceended: Event, sourceopen: Event): MediaSourceEventMap = {
    val __obj = js.Dynamic.literal(sourceclose = sourceclose.asInstanceOf[js.Any], sourceended = sourceended.asInstanceOf[js.Any], sourceopen = sourceopen.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaSourceEventMap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MediaSourceEventMap] (val x: Self) extends AnyVal {
    
    inline def setSourceclose(value: Event): Self = StObject.set(x, "sourceclose", value.asInstanceOf[js.Any])
    
    inline def setSourceended(value: Event): Self = StObject.set(x, "sourceended", value.asInstanceOf[js.Any])
    
    inline def setSourceopen(value: Event): Self = StObject.set(x, "sourceopen", value.asInstanceOf[js.Any])
  }
}

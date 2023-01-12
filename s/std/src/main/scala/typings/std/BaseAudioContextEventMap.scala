package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseAudioContextEventMap extends StObject {
  
  /* standard dom */
  var statechange: Event
}
object BaseAudioContextEventMap {
  
  inline def apply(statechange: Event): BaseAudioContextEventMap = {
    val __obj = js.Dynamic.literal(statechange = statechange.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseAudioContextEventMap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BaseAudioContextEventMap] (val x: Self) extends AnyVal {
    
    inline def setStatechange(value: Event): Self = StObject.set(x, "statechange", value.asInstanceOf[js.Any])
  }
}

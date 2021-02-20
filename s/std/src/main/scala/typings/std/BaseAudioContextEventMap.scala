package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseAudioContextEventMap extends StObject {
  
  var statechange: Event = js.native
}
object BaseAudioContextEventMap {
  
  @scala.inline
  def apply(statechange: Event): BaseAudioContextEventMap = {
    val __obj = js.Dynamic.literal(statechange = statechange.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseAudioContextEventMap]
  }
  
  @scala.inline
  implicit class BaseAudioContextEventMapMutableBuilder[Self <: BaseAudioContextEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatechange(value: Event): Self = StObject.set(x, "statechange", value.asInstanceOf[js.Any])
  }
}

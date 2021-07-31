package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OfflineAudioContextEventMap
  extends StObject
     with BaseAudioContextEventMap {
  
  var complete: OfflineAudioCompletionEvent
}
object OfflineAudioContextEventMap {
  
  @scala.inline
  def apply(complete: OfflineAudioCompletionEvent, statechange: Event): OfflineAudioContextEventMap = {
    val __obj = js.Dynamic.literal(complete = complete.asInstanceOf[js.Any], statechange = statechange.asInstanceOf[js.Any])
    __obj.asInstanceOf[OfflineAudioContextEventMap]
  }
  
  @scala.inline
  implicit class OfflineAudioContextEventMapMutableBuilder[Self <: OfflineAudioContextEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: OfflineAudioCompletionEvent): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
  }
}

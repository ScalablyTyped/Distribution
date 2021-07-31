package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimationEventMap extends StObject {
  
  var cancel: AnimationPlaybackEvent
  
  var finish: AnimationPlaybackEvent
}
object AnimationEventMap {
  
  @scala.inline
  def apply(cancel: AnimationPlaybackEvent, finish: AnimationPlaybackEvent): AnimationEventMap = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], finish = finish.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationEventMap]
  }
  
  @scala.inline
  implicit class AnimationEventMapMutableBuilder[Self <: AnimationEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancel(value: AnimationPlaybackEvent): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFinish(value: AnimationPlaybackEvent): Self = StObject.set(x, "finish", value.asInstanceOf[js.Any])
  }
}

package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimationPlaybackEventInit
  extends StObject
     with EventInit {
  
  /* standard dom */
  var currentTime: js.UndefOr[CSSNumberish | Null] = js.undefined
  
  /* standard dom */
  var timelineTime: js.UndefOr[CSSNumberish | Null] = js.undefined
}
object AnimationPlaybackEventInit {
  
  inline def apply(): AnimationPlaybackEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnimationPlaybackEventInit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnimationPlaybackEventInit] (val x: Self) extends AnyVal {
    
    inline def setCurrentTime(value: CSSNumberish): Self = StObject.set(x, "currentTime", value.asInstanceOf[js.Any])
    
    inline def setCurrentTimeNull: Self = StObject.set(x, "currentTime", null)
    
    inline def setCurrentTimeUndefined: Self = StObject.set(x, "currentTime", js.undefined)
    
    inline def setTimelineTime(value: CSSNumberish): Self = StObject.set(x, "timelineTime", value.asInstanceOf[js.Any])
    
    inline def setTimelineTimeNull: Self = StObject.set(x, "timelineTime", null)
    
    inline def setTimelineTimeUndefined: Self = StObject.set(x, "timelineTime", js.undefined)
  }
}

package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AnimationTimeline) */
trait AnimationTimeline extends StObject {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AnimationTimeline/currentTime) */
  /* standard dom */
  val currentTime: CSSNumberish | Null
}
object AnimationTimeline {
  
  inline def apply(): AnimationTimeline = {
    val __obj = js.Dynamic.literal(currentTime = null)
    __obj.asInstanceOf[AnimationTimeline]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnimationTimeline] (val x: Self) extends AnyVal {
    
    inline def setCurrentTime(value: CSSNumberish): Self = StObject.set(x, "currentTime", value.asInstanceOf[js.Any])
    
    inline def setCurrentTimeNull: Self = StObject.set(x, "currentTime", null)
  }
}

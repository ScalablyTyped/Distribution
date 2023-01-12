package typings.snapchatLensStudio

import typings.snapchatLensStudio.snapchatLensStudioStrings.enabled
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TouchEvent
  extends StObject
     with SceneObjectEvent {
  
  /** Returns the ID of this specific touch. Useful for distinguishing between touches when multiple are occurring simultaneously. */
  def getTouchId(): Double
  
  /** Returns the normalized 2D screen position of the user’s touch. The normalized coordinates range from ([0-1], [0-1]), (0,0) being top-left and (1,1) being bottom-right. */
  def getTouchPosition(): vec2
}
object TouchEvent {
  
  inline def apply(
    bind: js.Function1[/* eventData */ Omit[SceneObjectEvent, enabled], Unit] => Unit,
    enabled: Boolean,
    getSceneObject: () => SceneObject,
    getTouchId: () => Double,
    getTouchPosition: () => vec2,
    getTypeName: () => String,
    isOfType: String => Boolean
  ): TouchEvent = {
    val __obj = js.Dynamic.literal(bind = js.Any.fromFunction1(bind), enabled = enabled.asInstanceOf[js.Any], getSceneObject = js.Any.fromFunction0(getSceneObject), getTouchId = js.Any.fromFunction0(getTouchId), getTouchPosition = js.Any.fromFunction0(getTouchPosition), getTypeName = js.Any.fromFunction0(getTypeName), isOfType = js.Any.fromFunction1(isOfType))
    __obj.asInstanceOf[TouchEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TouchEvent] (val x: Self) extends AnyVal {
    
    inline def setGetTouchId(value: () => Double): Self = StObject.set(x, "getTouchId", js.Any.fromFunction0(value))
    
    inline def setGetTouchPosition(value: () => vec2): Self = StObject.set(x, "getTouchPosition", js.Any.fromFunction0(value))
  }
}

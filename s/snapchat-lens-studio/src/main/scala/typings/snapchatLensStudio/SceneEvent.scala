package typings.snapchatLensStudio

import typings.snapchatLensStudio.snapchatLensStudioStrings.enabled
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The base class for scenewide events. SceneEvents can be created using ScriptComponent’s createEvent method. */
trait SceneEvent[T /* <: SceneEvent[Any] */]
  extends StObject
     with ScriptObject {
  
  /** Binds a callback function to this event. */
  @JSName("bind")
  def bind_enabled(evCallback: js.Function1[/* eventData */ Omit[T, enabled], Unit]): Unit
  
  /** If true, the event is able to trigger. If false, the event will not trigger. */
  var enabled: Boolean
}
object SceneEvent {
  
  inline def apply[T /* <: SceneEvent[Any] */](
    bind: js.Function1[/* eventData */ Omit[T, enabled], Unit] => Unit,
    enabled: Boolean,
    getTypeName: () => String,
    isOfType: String => Boolean
  ): SceneEvent[T] = {
    val __obj = js.Dynamic.literal(bind = js.Any.fromFunction1(bind), enabled = enabled.asInstanceOf[js.Any], getTypeName = js.Any.fromFunction0(getTypeName), isOfType = js.Any.fromFunction1(isOfType))
    __obj.asInstanceOf[SceneEvent[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SceneEvent[?], T /* <: SceneEvent[Any] */] (val x: Self & SceneEvent[T]) extends AnyVal {
    
    inline def setBind(value: js.Function1[/* eventData */ Omit[T, enabled], Unit] => Unit): Self = StObject.set(x, "bind", js.Any.fromFunction1(value))
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
  }
}

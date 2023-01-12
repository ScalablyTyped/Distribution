package typings.scrollmagic.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SceneProgressEvent[T]
  extends StObject
     with Event[T] {
  
  val progress: Double
  
  val scrollDirection: ScrollDirection
  
  val state: SceneState
}
object SceneProgressEvent {
  
  inline def apply[T](
    currentTarget: Scene,
    namespace: String,
    progress: Double,
    scrollDirection: ScrollDirection,
    state: SceneState,
    target: Scene,
    timeStamp: js.Date,
    timestamp: js.Date,
    `type`: T
  ): SceneProgressEvent[T] = {
    val __obj = js.Dynamic.literal(currentTarget = currentTarget.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], scrollDirection = scrollDirection.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SceneProgressEvent[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SceneProgressEvent[?], T] (val x: Self & SceneProgressEvent[T]) extends AnyVal {
    
    inline def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    inline def setScrollDirection(value: ScrollDirection): Self = StObject.set(x, "scrollDirection", value.asInstanceOf[js.Any])
    
    inline def setState(value: SceneState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}

package typings.scrollmagic.mod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SceneProgressEvent[T] extends Event[T] {
  
  val progress: Double = js.native
  
  val scrollDirection: ScrollDirection = js.native
  
  val state: SceneState = js.native
}
object SceneProgressEvent {
  
  @scala.inline
  def apply[T](
    currentTarget: Scene,
    namespace: String,
    progress: Double,
    scrollDirection: ScrollDirection,
    state: SceneState,
    target: Scene,
    timeStamp: Date,
    timestamp: Date,
    `type`: T
  ): SceneProgressEvent[T] = {
    val __obj = js.Dynamic.literal(currentTarget = currentTarget.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], scrollDirection = scrollDirection.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SceneProgressEvent[T]]
  }
  
  @scala.inline
  implicit class SceneProgressEventMutableBuilder[Self <: SceneProgressEvent[_], T] (val x: Self with SceneProgressEvent[T]) extends AnyVal {
    
    @scala.inline
    def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollDirection(value: ScrollDirection): Self = StObject.set(x, "scrollDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: SceneState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}

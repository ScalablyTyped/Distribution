package typings.scrollmagic.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SceneProgressEvent[T] extends Event[T] {
  val progress: Double
  val scrollDirection: ScrollDirection
  val state: SceneState
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
}


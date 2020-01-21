package typings.reactNavigationStack.getSceneIndicesForInterpolationInputRangeMod

import typings.reactNavigationStack.typesMod.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var scene: Scene
  var scenes: js.Array[Scene]
}

object Props {
  @scala.inline
  def apply(scene: Scene, scenes: js.Array[Scene]): Props = {
    val __obj = js.Dynamic.literal(scene = scene.asInstanceOf[js.Any], scenes = scenes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Props]
  }
}


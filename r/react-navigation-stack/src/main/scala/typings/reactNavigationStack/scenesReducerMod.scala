package typings.reactNavigationStack

import typings.reactNavigationStack.typesMod.NavigationStackState
import typings.reactNavigationStack.typesMod.Scene
import typings.reactNavigationStack.typesMod.SceneDescriptorMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-navigation-stack/lib/typescript/views/ScenesReducer", JSImport.Namespace)
@js.native
object scenesReducerMod extends js.Object {
  def default(
    scenes: js.Array[Scene],
    nextState: NavigationStackState,
    prevState: Null,
    descriptors: SceneDescriptorMap
  ): js.Array[Scene] = js.native
  def default(
    scenes: js.Array[Scene],
    nextState: NavigationStackState,
    prevState: NavigationStackState,
    descriptors: SceneDescriptorMap
  ): js.Array[Scene] = js.native
}


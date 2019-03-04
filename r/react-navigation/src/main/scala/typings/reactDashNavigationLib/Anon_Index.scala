package typings
package reactDashNavigationLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Index extends js.Object {
  var previousScene: reactDashNavigationLib.reactDashNavigationMod.TabScene
  var scene: reactDashNavigationLib.reactDashNavigationMod.TabScene
  def jumpToIndex(index: scala.Double): scala.Unit
}

object Anon_Index {
  @scala.inline
  def apply(
    jumpToIndex: js.Function1[scala.Double, scala.Unit],
    previousScene: reactDashNavigationLib.reactDashNavigationMod.TabScene,
    scene: reactDashNavigationLib.reactDashNavigationMod.TabScene
  ): Anon_Index = {
    val __obj = js.Dynamic.literal(jumpToIndex = jumpToIndex, previousScene = previousScene, scene = scene)
  
    __obj.asInstanceOf[Anon_Index]
  }
}


package typings
package reactDashNavigationLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IndexJumpToIndex extends js.Object {
  var previousScene: reactDashNavigationLib.reactDashNavigationMod.NavigationRoute[reactDashNavigationLib.reactDashNavigationMod.NavigationParams]
  var scene: reactDashNavigationLib.reactDashNavigationMod.TabScene
  def jumpToIndex(index: scala.Double): scala.Unit
}

object Anon_IndexJumpToIndex {
  @scala.inline
  def apply(
    jumpToIndex: scala.Double => scala.Unit,
    previousScene: reactDashNavigationLib.reactDashNavigationMod.NavigationRoute[reactDashNavigationLib.reactDashNavigationMod.NavigationParams],
    scene: reactDashNavigationLib.reactDashNavigationMod.TabScene
  ): Anon_IndexJumpToIndex = {
    val __obj = js.Dynamic.literal(jumpToIndex = js.Any.fromFunction1(jumpToIndex), previousScene = previousScene.asInstanceOf[js.Any], scene = scene)
  
    __obj.asInstanceOf[Anon_IndexJumpToIndex]
  }
}


package typings.reactDashNavigation

import typings.reactDashNavigation.reactDashNavigationMod.NavigationParams
import typings.reactDashNavigation.reactDashNavigationMod.NavigationRoute
import typings.reactDashNavigation.reactDashNavigationMod.TabScene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IndexJumpToIndex extends js.Object {
  var previousScene: NavigationRoute[NavigationParams]
  var scene: TabScene
  def jumpToIndex(index: Double): Unit
}

object Anon_IndexJumpToIndex {
  @scala.inline
  def apply(jumpToIndex: Double => Unit, previousScene: NavigationRoute[NavigationParams], scene: TabScene): Anon_IndexJumpToIndex = {
    val __obj = js.Dynamic.literal(jumpToIndex = js.Any.fromFunction1(jumpToIndex), previousScene = previousScene.asInstanceOf[js.Any], scene = scene)
  
    __obj.asInstanceOf[Anon_IndexJumpToIndex]
  }
}


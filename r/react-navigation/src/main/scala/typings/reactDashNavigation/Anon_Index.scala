package typings.reactDashNavigation

import typings.reactDashNavigation.reactDashNavigationMod.TabScene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Index extends js.Object {
  var previousScene: TabScene
  var scene: TabScene
  def jumpToIndex(index: Double): Unit
}

object Anon_Index {
  @scala.inline
  def apply(jumpToIndex: Double => Unit, previousScene: TabScene, scene: TabScene): Anon_Index = {
    val __obj = js.Dynamic.literal(jumpToIndex = js.Any.fromFunction1(jumpToIndex), previousScene = previousScene, scene = scene)
  
    __obj.asInstanceOf[Anon_Index]
  }
}


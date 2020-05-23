package typings.reactNativeSideMenu.mod

import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SideMenu
  extends Component[ReactNativeSideMenuProps, js.Object, js.Any] {
  def moveLeft(offset: Double): Unit = js.native
  def openMenu(isOpen: Boolean): Unit = js.native
}


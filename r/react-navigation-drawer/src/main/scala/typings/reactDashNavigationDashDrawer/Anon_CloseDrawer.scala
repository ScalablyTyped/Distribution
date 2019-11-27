package typings.reactDashNavigationDashDrawer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CloseDrawer extends js.Object {
  def closeDrawer(): js.Any
  def openDrawer(): js.Any
  def toggleDrawer(): js.Any
}

object Anon_CloseDrawer {
  @scala.inline
  def apply(closeDrawer: () => js.Any, openDrawer: () => js.Any, toggleDrawer: () => js.Any): Anon_CloseDrawer = {
    val __obj = js.Dynamic.literal(closeDrawer = js.Any.fromFunction0(closeDrawer), openDrawer = js.Any.fromFunction0(openDrawer), toggleDrawer = js.Any.fromFunction0(toggleDrawer))
  
    __obj.asInstanceOf[Anon_CloseDrawer]
  }
}


package typings.reactNavigationDrawer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCloseDrawer extends js.Object {
  def closeDrawer(): js.Any
  def openDrawer(): js.Any
  def toggleDrawer(): js.Any
}

object AnonCloseDrawer {
  @scala.inline
  def apply(closeDrawer: () => js.Any, openDrawer: () => js.Any, toggleDrawer: () => js.Any): AnonCloseDrawer = {
    val __obj = js.Dynamic.literal(closeDrawer = js.Any.fromFunction0(closeDrawer), openDrawer = js.Any.fromFunction0(openDrawer), toggleDrawer = js.Any.fromFunction0(toggleDrawer))
    __obj.asInstanceOf[AnonCloseDrawer]
  }
}


package typings.reactNavigation.mod

import typings.reactNavigation.reactNavigationStrings.NavigationSlashDRAWER_CLOSED
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationDrawerClosedAction extends NavigationDrawerAction {
  var key: js.UndefOr[String] = js.undefined
  var `type`: NavigationSlashDRAWER_CLOSED
}

object NavigationDrawerClosedAction {
  @scala.inline
  def apply(`type`: NavigationSlashDRAWER_CLOSED, key: String = null): NavigationDrawerClosedAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationDrawerClosedAction]
  }
}


package typings.reactNavigation.mod

import typings.reactNavigation.reactNavigationStrings.NavigationSlashDRAWER_OPENED
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationDrawerOpenedAction extends NavigationDrawerAction {
  var key: js.UndefOr[String] = js.undefined
  var `type`: NavigationSlashDRAWER_OPENED
}

object NavigationDrawerOpenedAction {
  @scala.inline
  def apply(`type`: NavigationSlashDRAWER_OPENED, key: String = null): NavigationDrawerOpenedAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationDrawerOpenedAction]
  }
}


package typings.reactDashNavigationDashDrawer

import typings.reactDashNavigationDashDrawer.reactDashNavigationDashDrawerStrings.CHILD_ACTION
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CHILDACTION extends js.Object {
  var key: js.UndefOr[String] = js.undefined
  var `type`: CHILD_ACTION
}

object Anon_CHILDACTION {
  @scala.inline
  def apply(`type`: CHILD_ACTION, key: String = null): Anon_CHILDACTION = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CHILDACTION]
  }
}


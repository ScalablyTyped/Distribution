package typings.reactNavigationDrawer.anon

import typings.reactNavigationDrawer.reactNavigationDrawerStrings.CHILD_ACTION
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Key extends js.Object {
  var key: js.UndefOr[String] = js.undefined
  var `type`: CHILD_ACTION
}

object Key {
  @scala.inline
  def apply(`type`: CHILD_ACTION, key: String = null): Key = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[Key]
  }
}


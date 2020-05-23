package typings.storybookAddonA11y.tabsMod

import typings.storybookAddonA11y.anon.Items
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabsProps extends js.Object {
  var tabs: js.Array[Items]
}

object TabsProps {
  @scala.inline
  def apply(tabs: js.Array[Items]): TabsProps = {
    val __obj = js.Dynamic.literal(tabs = tabs.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabsProps]
  }
}


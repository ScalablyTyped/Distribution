package typings.rcTabs.tabContextMod

import typings.rcTabs.interfaceMod.Tab
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabContextProps extends js.Object {
  var prefixCls: String
  var tabs: js.Array[Tab]
}

object TabContextProps {
  @scala.inline
  def apply(prefixCls: String, tabs: js.Array[Tab]): TabContextProps = {
    val __obj = js.Dynamic.literal(prefixCls = prefixCls.asInstanceOf[js.Any], tabs = tabs.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabContextProps]
  }
}


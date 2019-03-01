package typings
package reactDashBootstrapLib.libTabContainerMod.TabContainerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabContainerProps
  extends reactLib.reactMod.ReactNs.HTMLAttributes[reactDashBootstrapLib.libTabContainerMod.TabContainer] {
  var activeKey: js.UndefOr[js.Any] = js.undefined
  var defaultActiveKey: js.UndefOr[js.Any] = js.undefined
  var generateChildId: js.UndefOr[js.Function2[/* eventKey */ js.Any, /* type */ js.Any, java.lang.String]] = js.undefined
}

object TabContainerProps {
  @scala.inline
  def apply(
    HTMLAttributes: reactLib.reactMod.ReactNs.HTMLAttributes[reactDashBootstrapLib.libTabContainerMod.TabContainer] = null,
    activeKey: js.Any = null,
    defaultActiveKey: js.Any = null,
    generateChildId: js.Function2[/* eventKey */ js.Any, /* type */ js.Any, java.lang.String] = null
  ): TabContainerProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (activeKey != null) __obj.updateDynamic("activeKey")(activeKey)
    if (defaultActiveKey != null) __obj.updateDynamic("defaultActiveKey")(defaultActiveKey)
    if (generateChildId != null) __obj.updateDynamic("generateChildId")(generateChildId)
    __obj.asInstanceOf[TabContainerProps]
  }
}


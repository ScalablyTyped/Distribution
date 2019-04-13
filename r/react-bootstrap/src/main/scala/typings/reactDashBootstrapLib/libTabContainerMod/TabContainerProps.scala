package typings
package reactDashBootstrapLib.libTabContainerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabContainerProps
  extends reactLib.reactMod.HTMLAttributes[TabContainer] {
  var activeKey: js.UndefOr[js.Any] = js.undefined
  var defaultActiveKey: js.UndefOr[js.Any] = js.undefined
  var generateChildId: js.UndefOr[js.Function2[/* eventKey */ js.Any, /* type */ js.Any, java.lang.String]] = js.undefined
}

object TabContainerProps {
  @scala.inline
  def apply(
    HTMLAttributes: reactLib.reactMod.HTMLAttributes[TabContainer] = null,
    activeKey: js.Any = null,
    defaultActiveKey: js.Any = null,
    generateChildId: (/* eventKey */ js.Any, /* type */ js.Any) => java.lang.String = null
  ): TabContainerProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (activeKey != null) __obj.updateDynamic("activeKey")(activeKey)
    if (defaultActiveKey != null) __obj.updateDynamic("defaultActiveKey")(defaultActiveKey)
    if (generateChildId != null) __obj.updateDynamic("generateChildId")(js.Any.fromFunction2(generateChildId))
    __obj.asInstanceOf[TabContainerProps]
  }
}


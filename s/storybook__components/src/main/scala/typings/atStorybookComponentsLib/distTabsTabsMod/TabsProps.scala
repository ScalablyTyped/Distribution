package typings
package atStorybookComponentsLib.distTabsTabsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabsProps extends js.Object {
  var absolute: js.UndefOr[scala.Boolean] = js.undefined
  var actions: js.UndefOr[atStorybookComponentsLib.Anon_Id] = js.undefined
  var bordered: js.UndefOr[scala.Boolean] = js.undefined
  var children: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var selected: js.UndefOr[java.lang.String] = js.undefined
  var tools: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
}

object TabsProps {
  @scala.inline
  def apply(
    absolute: js.UndefOr[scala.Boolean] = js.undefined,
    actions: atStorybookComponentsLib.Anon_Id = null,
    bordered: js.UndefOr[scala.Boolean] = js.undefined,
    children: reactLib.reactMod.ReactNode = null,
    id: java.lang.String = null,
    selected: java.lang.String = null,
    tools: reactLib.reactMod.ReactNode = null
  ): TabsProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(absolute)) __obj.updateDynamic("absolute")(absolute)
    if (actions != null) __obj.updateDynamic("actions")(actions)
    if (!js.isUndefined(bordered)) __obj.updateDynamic("bordered")(bordered)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    if (selected != null) __obj.updateDynamic("selected")(selected)
    if (tools != null) __obj.updateDynamic("tools")(tools.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabsProps]
  }
}


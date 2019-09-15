package typings.atStorybookComponents.distTabsTabsMod

import typings.atStorybookComponents.Anon_Id
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabsProps extends js.Object {
  var absolute: js.UndefOr[Boolean] = js.undefined
  var actions: js.UndefOr[Anon_Id] = js.undefined
  var backgroundColor: js.UndefOr[String] = js.undefined
  var bordered: js.UndefOr[Boolean] = js.undefined
  var children: js.UndefOr[ReactNode] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var selected: js.UndefOr[String] = js.undefined
  var tools: js.UndefOr[ReactNode] = js.undefined
}

object TabsProps {
  @scala.inline
  def apply(
    absolute: js.UndefOr[Boolean] = js.undefined,
    actions: Anon_Id = null,
    backgroundColor: String = null,
    bordered: js.UndefOr[Boolean] = js.undefined,
    children: ReactNode = null,
    id: String = null,
    selected: String = null,
    tools: ReactNode = null
  ): TabsProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(absolute)) __obj.updateDynamic("absolute")(absolute)
    if (actions != null) __obj.updateDynamic("actions")(actions)
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (!js.isUndefined(bordered)) __obj.updateDynamic("bordered")(bordered)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    if (selected != null) __obj.updateDynamic("selected")(selected)
    if (tools != null) __obj.updateDynamic("tools")(tools.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabsProps]
  }
}


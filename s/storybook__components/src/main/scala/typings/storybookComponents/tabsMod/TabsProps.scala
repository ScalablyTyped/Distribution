package typings.storybookComponents.tabsMod

import typings.react.mod.ReactNode
import typings.storybookComponents.AnonOnSelect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabsProps extends js.Object {
  var absolute: js.UndefOr[Boolean] = js.native
  var actions: js.UndefOr[AnonOnSelect] = js.native
  var backgroundColor: js.UndefOr[String] = js.native
  var bordered: js.UndefOr[Boolean] = js.native
  var id: js.UndefOr[String] = js.native
  var selected: js.UndefOr[String] = js.native
  var tools: js.UndefOr[ReactNode] = js.native
}

object TabsProps {
  @scala.inline
  def apply(
    absolute: js.UndefOr[Boolean] = js.undefined,
    actions: AnonOnSelect = null,
    backgroundColor: String = null,
    bordered: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    selected: String = null,
    tools: ReactNode = null
  ): TabsProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(absolute)) __obj.updateDynamic("absolute")(absolute.asInstanceOf[js.Any])
    if (actions != null) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (!js.isUndefined(bordered)) __obj.updateDynamic("bordered")(bordered.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (selected != null) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    if (tools != null) __obj.updateDynamic("tools")(tools.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabsProps]
  }
}


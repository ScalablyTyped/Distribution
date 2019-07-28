package typings.semanticDashUiDashReact.distCommonjsModulesTabTabMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.NativeMouseEvent
import typings.react.reactMod.MouseEvent
import typings.semanticDashUiDashReact.Anon_MenuItem
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.left
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.right
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabProps
  extends StrictTabProps
     with /* key */ StringDictionary[js.Any]

object TabProps {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    activeIndex: Double | String = null,
    as: js.Any = null,
    defaultActiveIndex: Double | String = null,
    grid: js.Any = null,
    menu: js.Any = null,
    menuPosition: left | right = null,
    onTabChange: (/* event */ MouseEvent[HTMLDivElement, NativeMouseEvent], /* data */ TabProps) => Unit = null,
    panes: js.Array[Anon_MenuItem] = null,
    renderActiveOnly: js.UndefOr[Boolean] = js.undefined
  ): TabProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (activeIndex != null) __obj.updateDynamic("activeIndex")(activeIndex.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as)
    if (defaultActiveIndex != null) __obj.updateDynamic("defaultActiveIndex")(defaultActiveIndex.asInstanceOf[js.Any])
    if (grid != null) __obj.updateDynamic("grid")(grid)
    if (menu != null) __obj.updateDynamic("menu")(menu)
    if (menuPosition != null) __obj.updateDynamic("menuPosition")(menuPosition.asInstanceOf[js.Any])
    if (onTabChange != null) __obj.updateDynamic("onTabChange")(js.Any.fromFunction2(onTabChange))
    if (panes != null) __obj.updateDynamic("panes")(panes)
    if (!js.isUndefined(renderActiveOnly)) __obj.updateDynamic("renderActiveOnly")(renderActiveOnly)
    __obj.asInstanceOf[TabProps]
  }
}


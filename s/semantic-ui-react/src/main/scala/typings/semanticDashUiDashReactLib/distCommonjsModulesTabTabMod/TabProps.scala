package typings
package semanticDashUiDashReactLib.distCommonjsModulesTabTabMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabProps
  extends StrictTabProps
     with /* key */ org.scalablytyped.runtime.StringDictionary[js.Any]

object TabProps {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    activeIndex: scala.Double | java.lang.String = null,
    as: js.Any = null,
    defaultActiveIndex: scala.Double | java.lang.String = null,
    grid: js.Any = null,
    menu: js.Any = null,
    menuPosition: semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.left | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.right = null,
    onTabChange: js.Function2[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLDivElement, reactLib.NativeMouseEvent], 
      /* data */ TabProps, 
      scala.Unit
    ] = null,
    panes: js.Array[semanticDashUiDashReactLib.Anon_Content] = null,
    renderActiveOnly: js.UndefOr[scala.Boolean] = js.undefined
  ): TabProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (activeIndex != null) __obj.updateDynamic("activeIndex")(activeIndex.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as)
    if (defaultActiveIndex != null) __obj.updateDynamic("defaultActiveIndex")(defaultActiveIndex.asInstanceOf[js.Any])
    if (grid != null) __obj.updateDynamic("grid")(grid)
    if (menu != null) __obj.updateDynamic("menu")(menu)
    if (menuPosition != null) __obj.updateDynamic("menuPosition")(menuPosition.asInstanceOf[js.Any])
    if (onTabChange != null) __obj.updateDynamic("onTabChange")(onTabChange)
    if (panes != null) __obj.updateDynamic("panes")(panes)
    if (!js.isUndefined(renderActiveOnly)) __obj.updateDynamic("renderActiveOnly")(renderActiveOnly)
    __obj.asInstanceOf[TabProps]
  }
}


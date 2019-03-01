package typings
package semanticDashUiDashReactLib.distCommonjsAddonsPaginationPaginationItemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginationItemProps
  extends StrictPaginationItemProps
     with /* key */ org.scalablytyped.runtime.StringDictionary[js.Any]

object PaginationItemProps {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    active: js.UndefOr[scala.Boolean] = js.undefined,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    onClick: js.Function2[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLAnchorElement, reactLib.NativeMouseEvent], 
      /* data */ PaginationItemProps, 
      scala.Unit
    ] = null,
    onKeyDown: js.Function2[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLAnchorElement, reactLib.NativeMouseEvent], 
      /* data */ PaginationItemProps, 
      scala.Unit
    ] = null,
    `type`: semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.ellipsisItem | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.firstItem | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.prevItem | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.pageItem | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.nextItem | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.lastItem = null
  ): PaginationItemProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(onKeyDown)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginationItemProps]
  }
}


package typings
package semanticDashUiDashReactLib.distCommonjsElementsRailRailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RailProps
  extends StrictRailProps
     with /* key */ org.scalablytyped.runtime.StringDictionary[js.Any]

object RailProps {
  @scala.inline
  def apply(
    position: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticFLOATS,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    as: js.Any = null,
    attached: js.UndefOr[scala.Boolean] = js.undefined,
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    className: java.lang.String = null,
    close: scala.Boolean | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.very = null,
    content: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandContent = null,
    dividing: js.UndefOr[scala.Boolean] = js.undefined,
    internal: js.UndefOr[scala.Boolean] = js.undefined,
    size: semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.mini | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.tiny | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.small | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.large | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.big | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.huge | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.massive = null
  ): RailProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("position")(position)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (as != null) __obj.updateDynamic("as")(as)
    if (!js.isUndefined(attached)) __obj.updateDynamic("attached")(attached)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (close != null) __obj.updateDynamic("close")(close.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(dividing)) __obj.updateDynamic("dividing")(dividing)
    if (!js.isUndefined(internal)) __obj.updateDynamic("internal")(internal)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[RailProps]
  }
}


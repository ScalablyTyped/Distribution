package typings
package semanticDashUiDashReactLib.distCommonjsCollectionsMessageMessageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageProps
  extends StrictMessageProps
     with /* key */ org.scalablytyped.runtime.StringDictionary[js.Any]

object MessageProps {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    as: js.Any = null,
    attached: scala.Boolean | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.bottom | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.top = null,
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    className: java.lang.String = null,
    color: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticCOLORS = null,
    compact: js.UndefOr[scala.Boolean] = js.undefined,
    content: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandContent = null,
    error: js.UndefOr[scala.Boolean] = js.undefined,
    floating: js.UndefOr[scala.Boolean] = js.undefined,
    header: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandItem[
      semanticDashUiDashReactLib.distCommonjsCollectionsMessageMessageHeaderMod.MessageHeaderProps
    ] = null,
    hidden: js.UndefOr[scala.Boolean] = js.undefined,
    icon: js.Any | scala.Boolean = null,
    info: js.UndefOr[scala.Boolean] = js.undefined,
    list: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandCollection[
      semanticDashUiDashReactLib.distCommonjsCollectionsMessageMessageItemMod.MessageItemProps
    ] = null,
    negative: js.UndefOr[scala.Boolean] = js.undefined,
    onDismiss: js.Function2[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent], 
      /* data */ MessageProps, 
      scala.Unit
    ] = null,
    positive: js.UndefOr[scala.Boolean] = js.undefined,
    size: MessageSizeProp = null,
    success: js.UndefOr[scala.Boolean] = js.undefined,
    visible: js.UndefOr[scala.Boolean] = js.undefined,
    warning: js.UndefOr[scala.Boolean] = js.undefined
  ): MessageProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (as != null) __obj.updateDynamic("as")(as)
    if (attached != null) __obj.updateDynamic("attached")(attached.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (color != null) __obj.updateDynamic("color")(color)
    if (!js.isUndefined(compact)) __obj.updateDynamic("compact")(compact)
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error)
    if (!js.isUndefined(floating)) __obj.updateDynamic("floating")(floating)
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden)
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (!js.isUndefined(info)) __obj.updateDynamic("info")(info)
    if (list != null) __obj.updateDynamic("list")(list)
    if (!js.isUndefined(negative)) __obj.updateDynamic("negative")(negative)
    if (onDismiss != null) __obj.updateDynamic("onDismiss")(onDismiss)
    if (!js.isUndefined(positive)) __obj.updateDynamic("positive")(positive)
    if (size != null) __obj.updateDynamic("size")(size)
    if (!js.isUndefined(success)) __obj.updateDynamic("success")(success)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (!js.isUndefined(warning)) __obj.updateDynamic("warning")(warning)
    __obj.asInstanceOf[MessageProps]
  }
}


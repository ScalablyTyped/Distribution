package typings.semanticDashUiDashReact.distCommonjsModulesEmbedEmbedMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.NativeMouseEvent
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.ReactNode
import typings.semanticDashUiDashReact.distCommonjsElementsIconIconMod.IconProps
import typings.semanticDashUiDashReact.distCommonjsGenericMod.HtmlIframeProps
import typings.semanticDashUiDashReact.distCommonjsGenericMod.SemanticShorthandContent
import typings.semanticDashUiDashReact.distCommonjsGenericMod.SemanticShorthandItem
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.`16:9`
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.`21:9`
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.`4:3`
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.vimeo
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.youtube
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmbedProps
  extends StrictEmbedProps
     with /* key */ StringDictionary[js.Any]

object EmbedProps {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    active: js.UndefOr[Boolean] = js.undefined,
    as: js.Any = null,
    aspectRatio: `4:3` | `16:9` | `21:9` = null,
    autoplay: js.UndefOr[Boolean] = js.undefined,
    brandedUI: js.UndefOr[Boolean] = js.undefined,
    children: ReactNode = null,
    className: String = null,
    color: String = null,
    content: SemanticShorthandContent = null,
    defaultActive: js.UndefOr[Boolean] = js.undefined,
    hd: js.UndefOr[Boolean] = js.undefined,
    icon: SemanticShorthandItem[IconProps] = null,
    id: String = null,
    iframe: SemanticShorthandItem[HtmlIframeProps] = null,
    onClick: (/* event */ MouseEvent[HTMLDivElement, NativeMouseEvent], /* data */ EmbedProps) => Unit = null,
    placeholder: String = null,
    source: youtube | vimeo = null,
    url: String = null
  ): EmbedProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (as != null) __obj.updateDynamic("as")(as)
    if (aspectRatio != null) __obj.updateDynamic("aspectRatio")(aspectRatio.asInstanceOf[js.Any])
    if (!js.isUndefined(autoplay)) __obj.updateDynamic("autoplay")(autoplay)
    if (!js.isUndefined(brandedUI)) __obj.updateDynamic("brandedUI")(brandedUI)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (color != null) __obj.updateDynamic("color")(color)
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultActive)) __obj.updateDynamic("defaultActive")(defaultActive)
    if (!js.isUndefined(hd)) __obj.updateDynamic("hd")(hd)
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    if (iframe != null) __obj.updateDynamic("iframe")(iframe.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2(onClick))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[EmbedProps]
  }
}


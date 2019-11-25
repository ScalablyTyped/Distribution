package typings.semanticDashUiDashReact.distCommonjsModulesEmbedEmbedMod

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

trait StrictEmbedProps extends js.Object {
  /** An embed can be active. */
  var active: js.UndefOr[Boolean] = js.undefined
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.undefined
  /** An embed can specify an alternative aspect ratio. */
  var aspectRatio: js.UndefOr[`4:3` | `16:9` | `21:9`] = js.undefined
  /** Setting to true or false will force autoplay. */
  var autoplay: js.UndefOr[Boolean] = js.undefined
  /** Whether to show networks branded UI like title cards, or after video calls to action. */
  var brandedUI: js.UndefOr[Boolean] = js.undefined
  /** Primary content. */
  var children: js.UndefOr[ReactNode] = js.undefined
  /** Additional classes. */
  var className: js.UndefOr[String] = js.undefined
  /** Specifies a default chrome color with Vimeo or YouTube. */
  var color: js.UndefOr[String] = js.undefined
  /** Shorthand for primary content. */
  var content: js.UndefOr[SemanticShorthandContent] = js.undefined
  /** Initial value of active. */
  var defaultActive: js.UndefOr[Boolean] = js.undefined
  /** Whether to prefer HD content. */
  var hd: js.UndefOr[Boolean] = js.undefined
  /** Specifies an icon to use with placeholder content. */
  var icon: js.UndefOr[SemanticShorthandItem[IconProps]] = js.undefined
  /** Specifies an id for source. */
  var id: js.UndefOr[String] = js.undefined
  /** Shorthand for HTML iframe. */
  var iframe: js.UndefOr[SemanticShorthandItem[HtmlIframeProps]] = js.undefined
  /**
    * Сalled on click.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props and proposed value.
    */
  var onClick: js.UndefOr[
    js.Function2[
      /* event */ MouseEvent[HTMLDivElement, NativeMouseEvent], 
      /* data */ EmbedProps, 
      Unit
    ]
  ] = js.undefined
  /** A placeholder image for embed. */
  var placeholder: js.UndefOr[String] = js.undefined
  /** Specifies a source to use. */
  var source: js.UndefOr[youtube | vimeo] = js.undefined
  /** Specifies a url to use for embed. */
  var url: js.UndefOr[String] = js.undefined
}

object StrictEmbedProps {
  @scala.inline
  def apply(
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
  ): StrictEmbedProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (aspectRatio != null) __obj.updateDynamic("aspectRatio")(aspectRatio.asInstanceOf[js.Any])
    if (!js.isUndefined(autoplay)) __obj.updateDynamic("autoplay")(autoplay.asInstanceOf[js.Any])
    if (!js.isUndefined(brandedUI)) __obj.updateDynamic("brandedUI")(brandedUI.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultActive)) __obj.updateDynamic("defaultActive")(defaultActive.asInstanceOf[js.Any])
    if (!js.isUndefined(hd)) __obj.updateDynamic("hd")(hd.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (iframe != null) __obj.updateDynamic("iframe")(iframe.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2(onClick))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrictEmbedProps]
  }
}


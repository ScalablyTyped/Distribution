package typings
package semanticDashUiDashReactLib.distCommonjsModulesEmbedEmbedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictEmbedProps extends js.Object {
  /** An embed can be active. */
  var active: js.UndefOr[scala.Boolean] = js.undefined
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.undefined
  /** An embed can specify an alternative aspect ratio. */
  var aspectRatio: js.UndefOr[
    semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.`4:3` | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.`16:9` | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.`21:9`
  ] = js.undefined
  /** Setting to true or false will force autoplay. */
  var autoplay: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether to show networks branded UI like title cards, or after video calls to action. */
  var brandedUI: js.UndefOr[scala.Boolean] = js.undefined
  /** Primary content. */
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /** Additional classes. */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies a default chrome color with Vimeo or YouTube. */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /** Shorthand for primary content. */
  var content: js.UndefOr[semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandContent] = js.undefined
  /** Initial value of active. */
  var defaultActive: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether to prefer HD content. */
  var hd: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies an icon to use with placeholder content. */
  var icon: js.UndefOr[
    semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandItem[semanticDashUiDashReactLib.distCommonjsElementsIconIconMod.IconProps]
  ] = js.undefined
  /** Specifies an id for source. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Shorthand for HTML iframe. */
  var iframe: js.UndefOr[
    semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandItem[semanticDashUiDashReactLib.distCommonjsGenericMod.HtmlIframeProps]
  ] = js.undefined
  /**
    * Сalled on click.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props and proposed value.
    */
  var onClick: js.UndefOr[
    js.Function2[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLDivElement, reactLib.NativeMouseEvent], 
      /* data */ EmbedProps, 
      scala.Unit
    ]
  ] = js.undefined
  /** A placeholder image for embed. */
  var placeholder: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies a source to use. */
  var source: js.UndefOr[
    semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.youtube | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.vimeo
  ] = js.undefined
  /** Specifies a url to use for embed. */
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object StrictEmbedProps {
  @scala.inline
  def apply(
    active: js.UndefOr[scala.Boolean] = js.undefined,
    as: js.Any = null,
    aspectRatio: semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.`4:3` | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.`16:9` | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.`21:9` = null,
    autoplay: js.UndefOr[scala.Boolean] = js.undefined,
    brandedUI: js.UndefOr[scala.Boolean] = js.undefined,
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    className: java.lang.String = null,
    color: java.lang.String = null,
    content: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandContent = null,
    defaultActive: js.UndefOr[scala.Boolean] = js.undefined,
    hd: js.UndefOr[scala.Boolean] = js.undefined,
    icon: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandItem[semanticDashUiDashReactLib.distCommonjsElementsIconIconMod.IconProps] = null,
    id: java.lang.String = null,
    iframe: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandItem[semanticDashUiDashReactLib.distCommonjsGenericMod.HtmlIframeProps] = null,
    onClick: js.Function2[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLDivElement, reactLib.NativeMouseEvent], 
      /* data */ EmbedProps, 
      scala.Unit
    ] = null,
    placeholder: java.lang.String = null,
    source: semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.youtube | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.vimeo = null,
    url: java.lang.String = null
  ): StrictEmbedProps = {
    val __obj = js.Dynamic.literal()
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
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[StrictEmbedProps]
  }
}


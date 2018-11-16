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
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLDivElement], 
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


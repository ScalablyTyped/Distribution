package typings
package semanticDashUiDashReactLib.distCommonjsCollectionsBreadcrumbBreadcrumbSectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait StrictBreadcrumbSectionProps extends js.Object {
  /** Style as the currently active section. */
  var active: js.UndefOr[scala.Boolean] = js.undefined
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.undefined
  /** Primary content. */
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /** Additional classes. */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /** Shorthand for primary content. */
  var content: js.UndefOr[semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandContent] = js.undefined
  /** Render as an `a` tag instead of a `div` and adds the href attribute. */
  var href: js.UndefOr[java.lang.String] = js.undefined
  /** Render as an `a` tag instead of a `div`. */
  var link: js.UndefOr[scala.Boolean] = js.undefined
  /**
     * Called on click. When passed, the component will render as an `a`
     * tag by default instead of a `div`.
     *
     * @param {SyntheticEvent} event - React's original SyntheticEvent.
     * @param {object} data - All props.
     */
  var onClick: js.UndefOr[
    js.Function2[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLAnchorElement], 
      /* data */ BreadcrumbSectionProps, 
      scala.Unit
    ]
  ] = js.undefined
}


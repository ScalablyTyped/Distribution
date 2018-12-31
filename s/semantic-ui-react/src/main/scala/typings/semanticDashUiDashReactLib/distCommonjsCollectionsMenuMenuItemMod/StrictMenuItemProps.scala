package typings
package semanticDashUiDashReactLib.distCommonjsCollectionsMenuMenuItemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictMenuItemProps extends js.Object {
  /** A menu item can be active. */
  var active: js.UndefOr[scala.Boolean] = js.undefined
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.undefined
  /** Primary content. */
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /** Additional classes. */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /** Additional colors can be specified. */
  var color: js.UndefOr[semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticCOLORS] = js.undefined
  /** Shorthand for primary content. */
  var content: js.UndefOr[semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandContent] = js.undefined
  /** A menu item can be disabled. */
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  /** A menu item or menu can remove element padding, vertically or horizontally. */
  var fitted: js.UndefOr[
    scala.Boolean | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.horizontally | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.vertically
  ] = js.undefined
  /** A menu item may include a header or may itself be a header. */
  var header: js.UndefOr[scala.Boolean] = js.undefined
  /** MenuItem can be only icon. */
  var icon: js.UndefOr[
    scala.Boolean | semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandItem[semanticDashUiDashReactLib.distCommonjsElementsIconIconMod.IconProps]
  ] = js.undefined
  /** MenuItem index inside Menu. */
  var index: js.UndefOr[scala.Double] = js.undefined
  /** A menu item can be link. */
  var link: js.UndefOr[scala.Boolean] = js.undefined
  /** Internal name of the MenuItem. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Called on click. When passed, the component will render as an `a`
    * tag by default instead of a `div`.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props.
    */
  var onClick: js.UndefOr[
    js.Function2[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLAnchorElement, reactLib.NativeMouseEvent], 
      /* data */ MenuItemProps, 
      scala.Unit
    ]
  ] = js.undefined
  /** A menu item can take left or right position. */
  var position: js.UndefOr[
    semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.left | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.right
  ] = js.undefined
}


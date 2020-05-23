package typings.semanticUiReact.iconIconMod

import typings.semanticUiReact.genericMod.SemanticCOLORS
import typings.semanticUiReact.genericMod.SemanticICONS
import typings.semanticUiReact.semanticUiReactStrings.clockwise
import typings.semanticUiReact.semanticUiReactStrings.counterclockwise
import typings.semanticUiReact.semanticUiReactStrings.horizontally
import typings.semanticUiReact.semanticUiReactStrings.vertically
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictIconProps extends js.Object {
  /** Icon can have an aria hidden. */
  var `aria-hidden`: js.UndefOr[String] = js.undefined
  /** Icon can have an aria label. */
  var `aria-label`: js.UndefOr[String] = js.undefined
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.undefined
  /** Formatted to appear bordered */
  var bordered: js.UndefOr[Boolean] = js.undefined
  /** Icon can formatted to appear circular. */
  var circular: js.UndefOr[Boolean] = js.undefined
  /** Additional classes. */
  var className: js.UndefOr[String] = js.undefined
  /** Color of the icon. */
  var color: js.UndefOr[SemanticCOLORS] = js.undefined
  /** Icons can display a smaller corner icon. */
  var corner: js.UndefOr[Boolean | IconCorner] = js.undefined
  /** Show that the icon is inactive. */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /** Fitted, without space to left or right of Icon. */
  var fitted: js.UndefOr[Boolean] = js.undefined
  /** Icon can be flipped. */
  var flipped: js.UndefOr[horizontally | vertically] = js.undefined
  /** Formatted to have its colors inverted for contrast. */
  var inverted: js.UndefOr[Boolean] = js.undefined
  /** Icon can be formatted as a link. */
  var link: js.UndefOr[Boolean] = js.undefined
  /** Icon can be used as a simple loader. */
  var loading: js.UndefOr[Boolean] = js.undefined
  /** Name of the icon. */
  var name: js.UndefOr[SemanticICONS] = js.undefined
  /** Icon can rotated. */
  var rotated: js.UndefOr[clockwise | counterclockwise] = js.undefined
  /** Size of the icon. */
  var size: js.UndefOr[IconSizeProp] = js.undefined
}


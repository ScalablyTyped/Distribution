package typings
package semanticDashUiDashReactLib.distCommonjsCollectionsFormFormGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictFormGroupProps extends js.Object {
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.undefined
  /** Primary content. */
  var children: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  /** Additional classes. */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /** Fields can show related choices. */
  var grouped: js.UndefOr[scala.Boolean] = js.undefined
  /** Multiple fields may be inline in a row. */
  var `inline`: js.UndefOr[scala.Boolean] = js.undefined
  /** A form group can prevent itself from stacking on mobile. */
  var unstackable: js.UndefOr[scala.Boolean] = js.undefined
  /** Fields Groups can specify their width in grid columns or automatically divide fields to be equal width. */
  var widths: js.UndefOr[
    semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticWIDTHS | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.equal
  ] = js.undefined
}

object StrictFormGroupProps {
  @scala.inline
  def apply(
    as: js.Any = null,
    children: reactLib.reactMod.ReactNode = null,
    className: java.lang.String = null,
    grouped: js.UndefOr[scala.Boolean] = js.undefined,
    `inline`: js.UndefOr[scala.Boolean] = js.undefined,
    unstackable: js.UndefOr[scala.Boolean] = js.undefined,
    widths: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticWIDTHS | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.equal = null
  ): StrictFormGroupProps = {
    val __obj = js.Dynamic.literal()
    if (as != null) __obj.updateDynamic("as")(as)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(grouped)) __obj.updateDynamic("grouped")(grouped)
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`)
    if (!js.isUndefined(unstackable)) __obj.updateDynamic("unstackable")(unstackable)
    if (widths != null) __obj.updateDynamic("widths")(widths.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrictFormGroupProps]
  }
}


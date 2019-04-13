package typings
package semanticDashUiDashReactLib.distCommonjsCollectionsGridGridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictGridProps extends js.Object {
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.undefined
  /** A grid can have rows divided into cells. */
  var celled: js.UndefOr[
    scala.Boolean | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.internally
  ] = js.undefined
  /** A grid can have its columns centered. */
  var centered: js.UndefOr[scala.Boolean] = js.undefined
  /** Primary content. */
  var children: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  /** Additional classes. */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /** Represents column count per row in Grid. */
  var columns: js.UndefOr[
    semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticWIDTHS | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.equal
  ] = js.undefined
  /** A grid can be combined with a container to use avaiable layout and alignment. */
  var container: js.UndefOr[scala.Boolean] = js.undefined
  /** A grid can have dividers between its columns. */
  var divided: js.UndefOr[
    scala.Boolean | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.vertically
  ] = js.undefined
  /** A grid can double its column width on tablet and mobile sizes. */
  var doubling: js.UndefOr[scala.Boolean] = js.undefined
  /** A grid's colors can be inverted. */
  var inverted: js.UndefOr[scala.Boolean] = js.undefined
  /** A grid can preserve its vertical and horizontal gutters on first and last columns. */
  var padded: js.UndefOr[
    scala.Boolean | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.horizontally | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.vertically
  ] = js.undefined
  /** A grid can increase its gutters to allow for more negative space. */
  var relaxed: js.UndefOr[
    scala.Boolean | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.very
  ] = js.undefined
  /** A grid can specify that its columns should reverse order at different device sizes. */
  var reversed: js.UndefOr[GridReversedProp] = js.undefined
  /** A grid can have its columns stack on-top of each other after reaching mobile breakpoints. */
  var stackable: js.UndefOr[scala.Boolean] = js.undefined
  /** An can stretch its contents to take up the entire grid height. */
  var stretched: js.UndefOr[scala.Boolean] = js.undefined
  /** A grid can specify its text alignment. */
  var textAlign: js.UndefOr[semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticTEXTALIGNMENTS] = js.undefined
  /** A grid can specify its vertical alignment to have all its columns vertically centered. */
  var verticalAlign: js.UndefOr[semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticVERTICALALIGNMENTS] = js.undefined
}

object StrictGridProps {
  @scala.inline
  def apply(
    as: js.Any = null,
    celled: scala.Boolean | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.internally = null,
    centered: js.UndefOr[scala.Boolean] = js.undefined,
    children: reactLib.reactMod.ReactNode = null,
    className: java.lang.String = null,
    columns: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticWIDTHS | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.equal = null,
    container: js.UndefOr[scala.Boolean] = js.undefined,
    divided: scala.Boolean | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.vertically = null,
    doubling: js.UndefOr[scala.Boolean] = js.undefined,
    inverted: js.UndefOr[scala.Boolean] = js.undefined,
    padded: scala.Boolean | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.horizontally | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.vertically = null,
    relaxed: scala.Boolean | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.very = null,
    reversed: GridReversedProp = null,
    stackable: js.UndefOr[scala.Boolean] = js.undefined,
    stretched: js.UndefOr[scala.Boolean] = js.undefined,
    textAlign: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticTEXTALIGNMENTS = null,
    verticalAlign: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticVERTICALALIGNMENTS = null
  ): StrictGridProps = {
    val __obj = js.Dynamic.literal()
    if (as != null) __obj.updateDynamic("as")(as)
    if (celled != null) __obj.updateDynamic("celled")(celled.asInstanceOf[js.Any])
    if (!js.isUndefined(centered)) __obj.updateDynamic("centered")(centered)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (!js.isUndefined(container)) __obj.updateDynamic("container")(container)
    if (divided != null) __obj.updateDynamic("divided")(divided.asInstanceOf[js.Any])
    if (!js.isUndefined(doubling)) __obj.updateDynamic("doubling")(doubling)
    if (!js.isUndefined(inverted)) __obj.updateDynamic("inverted")(inverted)
    if (padded != null) __obj.updateDynamic("padded")(padded.asInstanceOf[js.Any])
    if (relaxed != null) __obj.updateDynamic("relaxed")(relaxed.asInstanceOf[js.Any])
    if (reversed != null) __obj.updateDynamic("reversed")(reversed.asInstanceOf[js.Any])
    if (!js.isUndefined(stackable)) __obj.updateDynamic("stackable")(stackable)
    if (!js.isUndefined(stretched)) __obj.updateDynamic("stretched")(stretched)
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign)
    if (verticalAlign != null) __obj.updateDynamic("verticalAlign")(verticalAlign)
    __obj.asInstanceOf[StrictGridProps]
  }
}


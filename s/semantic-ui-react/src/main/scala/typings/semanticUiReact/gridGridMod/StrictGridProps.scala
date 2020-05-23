package typings.semanticUiReact.gridGridMod

import typings.react.mod.ReactNode
import typings.semanticUiReact.genericMod.SemanticTEXTALIGNMENTS
import typings.semanticUiReact.genericMod.SemanticVERTICALALIGNMENTS
import typings.semanticUiReact.genericMod.SemanticWIDTHS
import typings.semanticUiReact.semanticUiReactStrings.equal
import typings.semanticUiReact.semanticUiReactStrings.horizontally
import typings.semanticUiReact.semanticUiReactStrings.internally
import typings.semanticUiReact.semanticUiReactStrings.vertically
import typings.semanticUiReact.semanticUiReactStrings.very
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictGridProps extends js.Object {
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.undefined
  /** A grid can have rows divided into cells. */
  var celled: js.UndefOr[Boolean | internally] = js.undefined
  /** A grid can have its columns centered. */
  var centered: js.UndefOr[Boolean] = js.undefined
  /** Primary content. */
  var children: js.UndefOr[ReactNode] = js.undefined
  /** Additional classes. */
  var className: js.UndefOr[String] = js.undefined
  /** Represents column count per row in Grid. */
  var columns: js.UndefOr[SemanticWIDTHS | equal] = js.undefined
  /** A grid can be combined with a container to use avaiable layout and alignment. */
  var container: js.UndefOr[Boolean] = js.undefined
  /** A grid can have dividers between its columns. */
  var divided: js.UndefOr[Boolean | vertically] = js.undefined
  /** A grid can double its column width on tablet and mobile sizes. */
  var doubling: js.UndefOr[Boolean] = js.undefined
  /** A grid's colors can be inverted. */
  var inverted: js.UndefOr[Boolean] = js.undefined
  /** A grid can preserve its vertical and horizontal gutters on first and last columns. */
  var padded: js.UndefOr[Boolean | horizontally | vertically] = js.undefined
  /** A grid can increase its gutters to allow for more negative space. */
  var relaxed: js.UndefOr[Boolean | very] = js.undefined
  /** A grid can specify that its columns should reverse order at different device sizes. */
  var reversed: js.UndefOr[GridReversedProp] = js.undefined
  /** A grid can have its columns stack on-top of each other after reaching mobile breakpoints. */
  var stackable: js.UndefOr[Boolean] = js.undefined
  /** An can stretch its contents to take up the entire grid height. */
  var stretched: js.UndefOr[Boolean] = js.undefined
  /** A grid can specify its text alignment. */
  var textAlign: js.UndefOr[SemanticTEXTALIGNMENTS] = js.undefined
  /** A grid can specify its vertical alignment to have all its columns vertically centered. */
  var verticalAlign: js.UndefOr[SemanticVERTICALALIGNMENTS] = js.undefined
}

object StrictGridProps {
  @scala.inline
  def apply(
    as: js.Any = null,
    celled: Boolean | internally = null,
    centered: js.UndefOr[Boolean] = js.undefined,
    children: ReactNode = null,
    className: String = null,
    columns: SemanticWIDTHS | equal = null,
    container: js.UndefOr[Boolean] = js.undefined,
    divided: Boolean | vertically = null,
    doubling: js.UndefOr[Boolean] = js.undefined,
    inverted: js.UndefOr[Boolean] = js.undefined,
    padded: Boolean | horizontally | vertically = null,
    relaxed: Boolean | very = null,
    reversed: GridReversedProp = null,
    stackable: js.UndefOr[Boolean] = js.undefined,
    stretched: js.UndefOr[Boolean] = js.undefined,
    textAlign: SemanticTEXTALIGNMENTS = null,
    verticalAlign: SemanticVERTICALALIGNMENTS = null
  ): StrictGridProps = {
    val __obj = js.Dynamic.literal()
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (celled != null) __obj.updateDynamic("celled")(celled.asInstanceOf[js.Any])
    if (!js.isUndefined(centered)) __obj.updateDynamic("centered")(centered.get.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (!js.isUndefined(container)) __obj.updateDynamic("container")(container.get.asInstanceOf[js.Any])
    if (divided != null) __obj.updateDynamic("divided")(divided.asInstanceOf[js.Any])
    if (!js.isUndefined(doubling)) __obj.updateDynamic("doubling")(doubling.get.asInstanceOf[js.Any])
    if (!js.isUndefined(inverted)) __obj.updateDynamic("inverted")(inverted.get.asInstanceOf[js.Any])
    if (padded != null) __obj.updateDynamic("padded")(padded.asInstanceOf[js.Any])
    if (relaxed != null) __obj.updateDynamic("relaxed")(relaxed.asInstanceOf[js.Any])
    if (reversed != null) __obj.updateDynamic("reversed")(reversed.asInstanceOf[js.Any])
    if (!js.isUndefined(stackable)) __obj.updateDynamic("stackable")(stackable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stretched)) __obj.updateDynamic("stretched")(stretched.get.asInstanceOf[js.Any])
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign.asInstanceOf[js.Any])
    if (verticalAlign != null) __obj.updateDynamic("verticalAlign")(verticalAlign.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrictGridProps]
  }
}


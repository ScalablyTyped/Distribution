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

@js.native
trait StrictGridProps extends js.Object {
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.native
  /** A grid can have rows divided into cells. */
  var celled: js.UndefOr[Boolean | internally] = js.native
  /** A grid can have its columns centered. */
  var centered: js.UndefOr[Boolean] = js.native
  /** Primary content. */
  var children: js.UndefOr[ReactNode] = js.native
  /** Additional classes. */
  var className: js.UndefOr[String] = js.native
  /** Represents column count per row in Grid. */
  var columns: js.UndefOr[SemanticWIDTHS | equal] = js.native
  /** A grid can be combined with a container to use avaiable layout and alignment. */
  var container: js.UndefOr[Boolean] = js.native
  /** A grid can have dividers between its columns. */
  var divided: js.UndefOr[Boolean | vertically] = js.native
  /** A grid can double its column width on tablet and mobile sizes. */
  var doubling: js.UndefOr[Boolean] = js.native
  /** A grid's colors can be inverted. */
  var inverted: js.UndefOr[Boolean] = js.native
  /** A grid can preserve its vertical and horizontal gutters on first and last columns. */
  var padded: js.UndefOr[Boolean | horizontally | vertically] = js.native
  /** A grid can increase its gutters to allow for more negative space. */
  var relaxed: js.UndefOr[Boolean | very] = js.native
  /** A grid can specify that its columns should reverse order at different device sizes. */
  var reversed: js.UndefOr[GridReversedProp] = js.native
  /** A grid can have its columns stack on-top of each other after reaching mobile breakpoints. */
  var stackable: js.UndefOr[Boolean] = js.native
  /** An can stretch its contents to take up the entire grid height. */
  var stretched: js.UndefOr[Boolean] = js.native
  /** A grid can specify its text alignment. */
  var textAlign: js.UndefOr[SemanticTEXTALIGNMENTS] = js.native
  /** A grid can specify its vertical alignment to have all its columns vertically centered. */
  var verticalAlign: js.UndefOr[SemanticVERTICALALIGNMENTS] = js.native
}

object StrictGridProps {
  @scala.inline
  def apply(): StrictGridProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StrictGridProps]
  }
  @scala.inline
  implicit class StrictGridPropsOps[Self <: StrictGridProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAs(value: js.Any): Self = this.set("as", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAs: Self = this.set("as", js.undefined)
    @scala.inline
    def setCelled(value: Boolean | internally): Self = this.set("celled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCelled: Self = this.set("celled", js.undefined)
    @scala.inline
    def setCentered(value: Boolean): Self = this.set("centered", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCentered: Self = this.set("centered", js.undefined)
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setColumns(value: SemanticWIDTHS | equal): Self = this.set("columns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    @scala.inline
    def setContainer(value: Boolean): Self = this.set("container", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    @scala.inline
    def setDivided(value: Boolean | vertically): Self = this.set("divided", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDivided: Self = this.set("divided", js.undefined)
    @scala.inline
    def setDoubling(value: Boolean): Self = this.set("doubling", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDoubling: Self = this.set("doubling", js.undefined)
    @scala.inline
    def setInverted(value: Boolean): Self = this.set("inverted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInverted: Self = this.set("inverted", js.undefined)
    @scala.inline
    def setPadded(value: Boolean | horizontally | vertically): Self = this.set("padded", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePadded: Self = this.set("padded", js.undefined)
    @scala.inline
    def setRelaxed(value: Boolean | very): Self = this.set("relaxed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelaxed: Self = this.set("relaxed", js.undefined)
    @scala.inline
    def setReversed(value: GridReversedProp): Self = this.set("reversed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReversed: Self = this.set("reversed", js.undefined)
    @scala.inline
    def setStackable(value: Boolean): Self = this.set("stackable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStackable: Self = this.set("stackable", js.undefined)
    @scala.inline
    def setStretched(value: Boolean): Self = this.set("stretched", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStretched: Self = this.set("stretched", js.undefined)
    @scala.inline
    def setTextAlign(value: SemanticTEXTALIGNMENTS): Self = this.set("textAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextAlign: Self = this.set("textAlign", js.undefined)
    @scala.inline
    def setVerticalAlign(value: SemanticVERTICALALIGNMENTS): Self = this.set("verticalAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerticalAlign: Self = this.set("verticalAlign", js.undefined)
  }
  
}


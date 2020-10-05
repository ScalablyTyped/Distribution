package typings.semanticUiReact.gridRowMod

import typings.react.mod.ReactNode
import typings.semanticUiReact.genericMod.SemanticCOLORS
import typings.semanticUiReact.genericMod.SemanticTEXTALIGNMENTS
import typings.semanticUiReact.genericMod.SemanticVERTICALALIGNMENTS
import typings.semanticUiReact.genericMod.SemanticWIDTHS
import typings.semanticUiReact.gridColumnMod.GridOnlyProp
import typings.semanticUiReact.gridGridMod.GridReversedProp
import typings.semanticUiReact.semanticUiReactStrings.equal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StrictGridRowProps extends js.Object {
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.native
  /** A row can have its columns centered. */
  var centered: js.UndefOr[Boolean] = js.native
  /** Primary content. */
  var children: js.UndefOr[ReactNode] = js.native
  /** Additional classes. */
  var className: js.UndefOr[String] = js.native
  /** A grid row can be colored. */
  var color: js.UndefOr[SemanticCOLORS] = js.native
  /** Represents column count per line in Row. */
  var columns: js.UndefOr[SemanticWIDTHS | equal] = js.native
  /** A row can have dividers between its columns. */
  var divided: js.UndefOr[Boolean] = js.native
  /** A row can appear only for a specific device, or screen sizes. */
  var only: js.UndefOr[GridOnlyProp] = js.native
  /** A  row can specify that its columns should reverse order at different device sizes. */
  var reversed: js.UndefOr[GridReversedProp] = js.native
  /** An can stretch its contents to take up the entire column height. */
  var stretched: js.UndefOr[Boolean] = js.native
  /** A row can specify its text alignment. */
  var textAlign: js.UndefOr[SemanticTEXTALIGNMENTS] = js.native
  /** A row can specify its vertical alignment to have all its columns vertically centered. */
  var verticalAlign: js.UndefOr[SemanticVERTICALALIGNMENTS] = js.native
}

object StrictGridRowProps {
  @scala.inline
  def apply(): StrictGridRowProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StrictGridRowProps]
  }
  @scala.inline
  implicit class StrictGridRowPropsOps[Self <: StrictGridRowProps] (val x: Self) extends AnyVal {
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
    def setColor(value: SemanticCOLORS): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setColumns(value: SemanticWIDTHS | equal): Self = this.set("columns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    @scala.inline
    def setDivided(value: Boolean): Self = this.set("divided", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDivided: Self = this.set("divided", js.undefined)
    @scala.inline
    def setOnly(value: GridOnlyProp): Self = this.set("only", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnly: Self = this.set("only", js.undefined)
    @scala.inline
    def setReversed(value: GridReversedProp): Self = this.set("reversed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReversed: Self = this.set("reversed", js.undefined)
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


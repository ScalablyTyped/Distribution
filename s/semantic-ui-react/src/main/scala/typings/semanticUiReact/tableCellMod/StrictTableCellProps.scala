package typings.semanticUiReact.tableCellMod

import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.ReactNodeArray
import typings.react.mod.ReactType
import typings.react.mod.TdHTMLAttributes
import typings.semanticUiReact.genericMod.SemanticShorthandContent
import typings.semanticUiReact.genericMod.SemanticShorthandItem
import typings.semanticUiReact.genericMod.SemanticVERTICALALIGNMENTS
import typings.semanticUiReact.genericMod.SemanticWIDTHS
import typings.semanticUiReact.iconIconMod.IconProps
import typings.semanticUiReact.semanticUiReactStrings.center
import typings.semanticUiReact.semanticUiReactStrings.left
import typings.semanticUiReact.semanticUiReactStrings.right
import typings.std.HTMLTableCellElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StrictTableCellProps extends TdHTMLAttributes[HTMLTableCellElement] {
  /** A cell can be active or selected by a user. */
  var active: js.UndefOr[Boolean] = js.native
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.native
  /** A table can be collapsing, taking up only as much space as its rows. */
  var collapsing: js.UndefOr[Boolean] = js.native
  /** Shorthand for primary content. */
  var content: js.UndefOr[SemanticShorthandContent] = js.native
  /** A cell can be disabled. */
  var disabled: js.UndefOr[Boolean] = js.native
  /** A cell may call attention to an error or a negative value. */
  var error: js.UndefOr[Boolean] = js.native
  /** Add an Icon by name, props object, or pass an <Icon /> */
  var icon: js.UndefOr[SemanticShorthandItem[IconProps]] = js.native
  /** A cell may let a user know whether a value is bad. */
  var negative: js.UndefOr[Boolean] = js.native
  /** A cell may let a user know whether a value is good. */
  var positive: js.UndefOr[Boolean] = js.native
  /** A cell can be selectable. */
  var selectable: js.UndefOr[Boolean] = js.native
  /** A cell can specify that its contents should remain on a single line and not wrap. */
  var singleLine: js.UndefOr[Boolean] = js.native
  /** A table cell can adjust its text alignment. */
  var textAlign: js.UndefOr[center | left | right] = js.native
  /** A table cell can adjust its text alignment. */
  var verticalAlign: js.UndefOr[SemanticVERTICALALIGNMENTS] = js.native
  /** A cell may warn a user. */
  var warning: js.UndefOr[Boolean] = js.native
  /** A table can specify the width of individual columns independently. */
  @JSName("width")
  var width_StrictTableCellProps: js.UndefOr[SemanticWIDTHS] = js.native
}

object StrictTableCellProps {
  @scala.inline
  def apply(): StrictTableCellProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StrictTableCellProps]
  }
  @scala.inline
  implicit class StrictTableCellPropsOps[Self <: StrictTableCellProps] (val x: Self) extends AnyVal {
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
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    @scala.inline
    def setAs(value: js.Any): Self = this.set("as", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAs: Self = this.set("as", js.undefined)
    @scala.inline
    def setCollapsing(value: Boolean): Self = this.set("collapsing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollapsing: Self = this.set("collapsing", js.undefined)
    @scala.inline
    def setContent(value: SemanticShorthandContent): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setError(value: Boolean): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setIconFunction3(
      value: (/* component */ ReactType[IconProps], IconProps, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
    ): Self = this.set("icon", js.Any.fromFunction3(value))
    @scala.inline
    def setIcon(value: SemanticShorthandItem[IconProps]): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setNegative(value: Boolean): Self = this.set("negative", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNegative: Self = this.set("negative", js.undefined)
    @scala.inline
    def setPositive(value: Boolean): Self = this.set("positive", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePositive: Self = this.set("positive", js.undefined)
    @scala.inline
    def setSelectable(value: Boolean): Self = this.set("selectable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectable: Self = this.set("selectable", js.undefined)
    @scala.inline
    def setSingleLine(value: Boolean): Self = this.set("singleLine", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSingleLine: Self = this.set("singleLine", js.undefined)
    @scala.inline
    def setTextAlign(value: center | left | right): Self = this.set("textAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextAlign: Self = this.set("textAlign", js.undefined)
    @scala.inline
    def setVerticalAlign(value: SemanticVERTICALALIGNMENTS): Self = this.set("verticalAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerticalAlign: Self = this.set("verticalAlign", js.undefined)
    @scala.inline
    def setWarning(value: Boolean): Self = this.set("warning", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWarning: Self = this.set("warning", js.undefined)
    @scala.inline
    def setWidth(value: SemanticWIDTHS): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}


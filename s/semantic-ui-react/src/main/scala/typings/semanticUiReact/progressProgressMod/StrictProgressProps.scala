package typings.semanticUiReact.progressProgressMod

import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.ReactNodeArray
import typings.react.mod.ReactType
import typings.semanticUiReact.genericMod.HtmlLabelProps
import typings.semanticUiReact.genericMod.SemanticCOLORS
import typings.semanticUiReact.genericMod.SemanticShorthandContent
import typings.semanticUiReact.genericMod.SemanticShorthandItem
import typings.semanticUiReact.semanticUiReactStrings.big
import typings.semanticUiReact.semanticUiReactStrings.bottom
import typings.semanticUiReact.semanticUiReactStrings.large
import typings.semanticUiReact.semanticUiReactStrings.medium
import typings.semanticUiReact.semanticUiReactStrings.percent
import typings.semanticUiReact.semanticUiReactStrings.ratio
import typings.semanticUiReact.semanticUiReactStrings.small
import typings.semanticUiReact.semanticUiReactStrings.tiny
import typings.semanticUiReact.semanticUiReactStrings.top
import typings.semanticUiReact.semanticUiReactStrings.value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StrictProgressProps extends js.Object {
  /** A progress bar can show activity. */
  var active: js.UndefOr[Boolean] = js.native
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.native
  /** A progress bar can attach to and show the progress of an element (i.e. Card or Segment). */
  var attached: js.UndefOr[top | bottom] = js.native
  /** Whether success state should automatically trigger when progress completes. */
  var autoSuccess: js.UndefOr[Boolean] = js.native
  /** Primary content. */
  var children: js.UndefOr[ReactNode] = js.native
  /** Additional classes. */
  var className: js.UndefOr[String] = js.native
  /** A progress bar can have different colors. */
  var color: js.UndefOr[SemanticCOLORS] = js.native
  /** Shorthand for primary content. */
  var content: js.UndefOr[SemanticShorthandContent] = js.native
  /** A progress bar be disabled. */
  var disabled: js.UndefOr[Boolean] = js.native
  /** A progress bar can show a error state. */
  var error: js.UndefOr[Boolean] = js.native
  /** An indicating progress bar visually indicates the current level of progress of a task. */
  var indicating: js.UndefOr[Boolean] = js.native
  /** A progress bar can have its colors inverted. */
  var inverted: js.UndefOr[Boolean] = js.native
  /** Can be set to either to display progress as percent or ratio. */
  var label: js.UndefOr[SemanticShorthandItem[HtmlLabelProps]] = js.native
  /** Current percent complete. */
  var percent: js.UndefOr[Double | String] = js.native
  /** Decimal point precision for calculated progress. */
  var precision: js.UndefOr[Double] = js.native
  /** A progress bar can contain a text value indicating current progress. */
  var progress: js.UndefOr[Boolean | percent | ratio | value] = js.native
  /** A progress bar can vary in size. */
  var size: js.UndefOr[tiny | small | medium | large | big] = js.native
  /** A progress bar can show a success state. */
  var success: js.UndefOr[Boolean] = js.native
  /** For use with value. Together, these will calculate the percent. Mutually excludes percent. */
  var total: js.UndefOr[Double | String] = js.native
  /** For use with total. Together, these will calculate the percent. Mutually excludes percent. */
  var value: js.UndefOr[Double | String] = js.native
  /** A progress bar can show a warning state. */
  var warning: js.UndefOr[Boolean] = js.native
}

object StrictProgressProps {
  @scala.inline
  def apply(): StrictProgressProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StrictProgressProps]
  }
  @scala.inline
  implicit class StrictProgressPropsOps[Self <: StrictProgressProps] (val x: Self) extends AnyVal {
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
    def setAttached(value: top | bottom): Self = this.set("attached", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttached: Self = this.set("attached", js.undefined)
    @scala.inline
    def setAutoSuccess(value: Boolean): Self = this.set("autoSuccess", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoSuccess: Self = this.set("autoSuccess", js.undefined)
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
    def setIndicating(value: Boolean): Self = this.set("indicating", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndicating: Self = this.set("indicating", js.undefined)
    @scala.inline
    def setInverted(value: Boolean): Self = this.set("inverted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInverted: Self = this.set("inverted", js.undefined)
    @scala.inline
    def setLabelFunction3(
      value: (/* component */ ReactType[HtmlLabelProps], HtmlLabelProps, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
    ): Self = this.set("label", js.Any.fromFunction3(value))
    @scala.inline
    def setLabel(value: SemanticShorthandItem[HtmlLabelProps]): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setPercent(value: Double | String): Self = this.set("percent", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePercent: Self = this.set("percent", js.undefined)
    @scala.inline
    def setPrecision(value: Double): Self = this.set("precision", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrecision: Self = this.set("precision", js.undefined)
    @scala.inline
    def setProgress(value: Boolean | percent | ratio | value): Self = this.set("progress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProgress: Self = this.set("progress", js.undefined)
    @scala.inline
    def setSize(value: tiny | small | medium | large | big): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setSuccess(value: Boolean): Self = this.set("success", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
    @scala.inline
    def setTotal(value: Double | String): Self = this.set("total", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotal: Self = this.set("total", js.undefined)
    @scala.inline
    def setValue(value: Double | String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    @scala.inline
    def setWarning(value: Boolean): Self = this.set("warning", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWarning: Self = this.set("warning", js.undefined)
  }
  
}


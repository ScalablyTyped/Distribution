package typings.semanticDashUiDashReact.distCommonjsModulesProgressProgressMod

import typings.react.reactMod.ReactNode
import typings.semanticDashUiDashReact.distCommonjsGenericMod.HtmlLabelProps
import typings.semanticDashUiDashReact.distCommonjsGenericMod.SemanticCOLORS
import typings.semanticDashUiDashReact.distCommonjsGenericMod.SemanticShorthandContent
import typings.semanticDashUiDashReact.distCommonjsGenericMod.SemanticShorthandItem
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.big
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.bottom
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.large
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.medium
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.percent
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.ratio
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.small
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.tiny
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.top
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictProgressProps extends js.Object {
  /** A progress bar can show activity. */
  var active: js.UndefOr[Boolean] = js.undefined
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.undefined
  /** A progress bar can attach to and show the progress of an element (i.e. Card or Segment). */
  var attached: js.UndefOr[top | bottom] = js.undefined
  /** Whether success state should automatically trigger when progress completes. */
  var autoSuccess: js.UndefOr[Boolean] = js.undefined
  /** Primary content. */
  var children: js.UndefOr[ReactNode] = js.undefined
  /** Additional classes. */
  var className: js.UndefOr[String] = js.undefined
  /** A progress bar can have different colors. */
  var color: js.UndefOr[SemanticCOLORS] = js.undefined
  /** Shorthand for primary content. */
  var content: js.UndefOr[SemanticShorthandContent] = js.undefined
  /** A progress bar be disabled. */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /** A progress bar can show a error state. */
  var error: js.UndefOr[Boolean] = js.undefined
  /** An indicating progress bar visually indicates the current level of progress of a task. */
  var indicating: js.UndefOr[Boolean] = js.undefined
  /** A progress bar can have its colors inverted. */
  var inverted: js.UndefOr[Boolean] = js.undefined
  /** Can be set to either to display progress as percent or ratio. */
  var label: js.UndefOr[SemanticShorthandItem[HtmlLabelProps]] = js.undefined
  /** Current percent complete. */
  var percent: js.UndefOr[Double | String] = js.undefined
  /** Decimal point precision for calculated progress. */
  var precision: js.UndefOr[Double] = js.undefined
  /** A progress bar can contain a text value indicating current progress. */
  var progress: js.UndefOr[Boolean | percent | ratio | value] = js.undefined
  /** A progress bar can vary in size. */
  var size: js.UndefOr[tiny | small | medium | large | big] = js.undefined
  /** A progress bar can show a success state. */
  var success: js.UndefOr[Boolean] = js.undefined
  /** For use with value. Together, these will calculate the percent. Mutually excludes percent. */
  var total: js.UndefOr[Double | String] = js.undefined
  /** For use with total. Together, these will calculate the percent. Mutually excludes percent. */
  var value: js.UndefOr[Double | String] = js.undefined
  /** A progress bar can show a warning state. */
  var warning: js.UndefOr[Boolean] = js.undefined
}

object StrictProgressProps {
  @scala.inline
  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    as: js.Any = null,
    attached: top | bottom = null,
    autoSuccess: js.UndefOr[Boolean] = js.undefined,
    children: ReactNode = null,
    className: String = null,
    color: SemanticCOLORS = null,
    content: SemanticShorthandContent = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    error: js.UndefOr[Boolean] = js.undefined,
    indicating: js.UndefOr[Boolean] = js.undefined,
    inverted: js.UndefOr[Boolean] = js.undefined,
    label: SemanticShorthandItem[HtmlLabelProps] = null,
    percent: Double | String = null,
    precision: Int | Double = null,
    progress: Boolean | percent | ratio | value = null,
    size: tiny | small | medium | large | big = null,
    success: js.UndefOr[Boolean] = js.undefined,
    total: Double | String = null,
    value: Double | String = null,
    warning: js.UndefOr[Boolean] = js.undefined
  ): StrictProgressProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (as != null) __obj.updateDynamic("as")(as)
    if (attached != null) __obj.updateDynamic("attached")(attached.asInstanceOf[js.Any])
    if (!js.isUndefined(autoSuccess)) __obj.updateDynamic("autoSuccess")(autoSuccess)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (color != null) __obj.updateDynamic("color")(color)
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error)
    if (!js.isUndefined(indicating)) __obj.updateDynamic("indicating")(indicating)
    if (!js.isUndefined(inverted)) __obj.updateDynamic("inverted")(inverted)
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (percent != null) __obj.updateDynamic("percent")(percent.asInstanceOf[js.Any])
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (progress != null) __obj.updateDynamic("progress")(progress.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(success)) __obj.updateDynamic("success")(success)
    if (total != null) __obj.updateDynamic("total")(total.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (!js.isUndefined(warning)) __obj.updateDynamic("warning")(warning)
    __obj.asInstanceOf[StrictProgressProps]
  }
}


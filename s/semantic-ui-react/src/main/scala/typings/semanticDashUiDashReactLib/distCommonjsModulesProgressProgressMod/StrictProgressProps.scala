package typings
package semanticDashUiDashReactLib.distCommonjsModulesProgressProgressMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictProgressProps extends js.Object {
  /** A progress bar can show activity. */
  var active: js.UndefOr[scala.Boolean] = js.undefined
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.undefined
  /** A progress bar can attach to and show the progress of an element (i.e. Card or Segment). */
  var attached: js.UndefOr[
    semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.top | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.bottom
  ] = js.undefined
  /** Whether success state should automatically trigger when progress completes. */
  var autoSuccess: js.UndefOr[scala.Boolean] = js.undefined
  /** Primary content. */
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /** Additional classes. */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /** A progress bar can have different colors. */
  var color: js.UndefOr[semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticCOLORS] = js.undefined
  /** Shorthand for primary content. */
  var content: js.UndefOr[semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandContent] = js.undefined
  /** A progress bar be disabled. */
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  /** A progress bar can show a error state. */
  var error: js.UndefOr[scala.Boolean] = js.undefined
  /** An indicating progress bar visually indicates the current level of progress of a task. */
  var indicating: js.UndefOr[scala.Boolean] = js.undefined
  /** A progress bar can have its colors inverted. */
  var inverted: js.UndefOr[scala.Boolean] = js.undefined
  /** Can be set to either to display progress as percent or ratio. */
  var label: js.UndefOr[
    semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandItem[semanticDashUiDashReactLib.distCommonjsGenericMod.HtmlLabelProps]
  ] = js.undefined
  /** Current percent complete. */
  var percent: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /** Decimal point precision for calculated progress. */
  var precision: js.UndefOr[scala.Double] = js.undefined
  /** A progress bar can contain a text value indicating current progress. */
  var progress: js.UndefOr[
    scala.Boolean | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.percent | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.ratio | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.value
  ] = js.undefined
  /** A progress bar can vary in size. */
  var size: js.UndefOr[
    semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.tiny | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.small | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.medium | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.large | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.big
  ] = js.undefined
  /** A progress bar can show a success state. */
  var success: js.UndefOr[scala.Boolean] = js.undefined
  /** For use with value. Together, these will calculate the percent. Mutually excludes percent. */
  var total: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /** For use with total. Together, these will calculate the percent. Mutually excludes percent. */
  var value: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /** A progress bar can show a warning state. */
  var warning: js.UndefOr[scala.Boolean] = js.undefined
}


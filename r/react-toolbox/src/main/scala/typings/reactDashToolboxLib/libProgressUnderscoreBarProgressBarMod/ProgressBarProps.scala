package typings
package reactDashToolboxLib.libProgressUnderscoreBarProgressBarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProgressBarProps
  extends reactDashToolboxLib.libMod.ReactToolboxNs.Props {
  /**
    * Value of a secondary progress bar useful for buffering.
    * @default 0
    */
  var buffer: js.UndefOr[scala.Double] = js.undefined
  /**
    * If true, component will be disabled.
    * @default false
    */
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Maximum value permitted.
    * @default 100
    */
  var max: js.UndefOr[scala.Double] = js.undefined
  /**
    * Minimum value permitted.
    * @default 0
    */
  var min: js.UndefOr[scala.Double] = js.undefined
  /**
    * Mode of the progress bar, it can be determinate or indeterminate.
    * @default indeterminate
    */
  var mode: js.UndefOr[
    reactDashToolboxLib.reactDashToolboxLibStrings.determinate | reactDashToolboxLib.reactDashToolboxLibStrings.indeterminate
  ] = js.undefined
  /**
    * If true, the circular progress bar will be changing its color.
    * @default false
    */
  var multicolor: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Classnames object defining the component style.
    */
  var theme: js.UndefOr[ProgressBarTheme] = js.undefined
  /**
    * Type of the progress bar, it can be circular or linear.
    * @default linear
    */
  var `type`: js.UndefOr[
    reactDashToolboxLib.reactDashToolboxLibStrings.linear | reactDashToolboxLib.reactDashToolboxLibStrings.circular
  ] = js.undefined
  /**
    * Value of the current progress.
    * @default 0
    */
  var value: js.UndefOr[scala.Double] = js.undefined
}


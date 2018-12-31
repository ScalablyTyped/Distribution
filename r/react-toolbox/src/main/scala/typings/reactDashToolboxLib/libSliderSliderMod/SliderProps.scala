package typings
package reactDashToolboxLib.libSliderSliderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SliderProps
  extends reactDashToolboxLib.libMod.ReactToolboxNs.Props {
  /**
    * Used to style the ProgressBar element
    */
  var buffer: js.UndefOr[scala.Double] = js.undefined
  /**
    * If true, component will be disabled.
    * @default false
    */
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If true, an input is shown and the user can set the slider from keyboard value.
    * @default false
    */
  var editable: js.UndefOr[scala.Boolean] = js.undefined
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
    * Callback function that will be invoked when the slider value changes.
    */
  var onChange: js.UndefOr[coreDashJsLib.Function] = js.undefined
  /**
    * Callback function that will be invoked when the slider stops being dragged.
    */
  var onDragStop: js.UndefOr[coreDashJsLib.Function] = js.undefined
  /**
    * If true, a pin with numeric value label is shown when the slider thumb is pressed. Use for settings for which users need to know the exact value of the setting.
    * @default false
    */
  var pinned: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If true, the slider thumb snaps to tick marks evenly spaced based on the step property value.
    * @default false
    */
  var snaps: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Amount to vary the value when the knob is moved or increase/decrease is called.
    * @default 0.01
    */
  var step: js.UndefOr[scala.Double] = js.undefined
  /**
    * Classnames object defining the component style.
    */
  var theme: js.UndefOr[SliderTheme] = js.undefined
  /**
    * Current value of the slider.
    * @default 0
    */
  var value: js.UndefOr[scala.Double] = js.undefined
}


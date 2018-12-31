package typings
package reactDashWidgetsLib.libNumberPickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NumberPickerProps
  extends reactDashWidgetsLib.libCommonPropsMod.ReactWidgetsCommonProps[NumberPickerClass]
     with reactDashWidgetsLib.libCommonPropsMod.AutoFocus {
  /**
    * Set the culture of the NumberPicker, passed to the configured localizer.
    */
  var culture: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Default Value.
    */
  var defaultValue: js.UndefOr[scala.Double] = js.undefined
  /**
    * A format string used to display the number value. Localizer dependent, read localization
    * for more info.
    * @see http://jquense.github.io/react-widgets/docs/#i18n
    */
  var format: js.UndefOr[js.Any] = js.undefined
  /**
    * An object of props that is passed directly to the underlying input component.
    */
  var inputProps: js.UndefOr[js.Object] = js.undefined
  /**
    * The maximum number that the NumberPicker value.
    * @default Infinity
    */
  var max: js.UndefOr[scala.Double] = js.undefined
  /**
    * Object hash containing display text and/or text for screen readers. Use the messages
    * object to localize widget text and increase accessibility.
    */
  var messages: js.UndefOr[NumberPickerMessages] = js.undefined
  /**
    * The minimum number that the NumberPicker value.
    * @default -Infinity
    */
  var min: js.UndefOr[scala.Double] = js.undefined
  /**
    * The HTML name attribute, passed directly to the input element.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Change event Handler that is called when the value is changed. The handler is called with
    * the current numeric value or null.
    */
  var onChange: js.UndefOr[js.Function1[/* value */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /**
    * The native onKeyDown event, called preventDefault will prevent any custom behavior, included keyboard shortcuts.
    */
  var onKeyDown: js.UndefOr[js.Function1[/* event */ reactLib.KeyboardEvent, scala.Unit]] = js.undefined
  /**
    * The native onKeyPress event, called preventDefault will stop any custom behavior.
    */
  var onKeyPress: js.UndefOr[js.Function1[/* event */ reactLib.KeyboardEvent, scala.Unit]] = js.undefined
  /**
    * Controls the visibility of the NumberPicker popup. Use defaultOpen to set an initial value for uncontrolled widgets.
    * @default false
    */
  var open: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Determines how the NumberPicker parses a number from the localized string representation.
    * You can also provide a parser Function to pair with a custom format.
    */
  var parse: js.UndefOr[
    js.Array[java.lang.String] | (js.Function2[/* str */ java.lang.String, /* culture */ java.lang.String, scala.Double])
  ] = js.undefined
  /**
    * Text to display in the input when the value is empty.
    */
  var placeholder: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Specify how precise the value should be when typing, incrementing, or decrementing the
    * value. When empty, precision is parsed from the current format and culture.
    */
  var precision: js.UndefOr[scala.Double] = js.undefined
  /**
    * Amount to increase or decrease value when using the spinner buttons.
    * @default 1
    */
  var step: js.UndefOr[scala.Double] = js.undefined
  /**
    * The current value of the NumberPicker.
    */
  var value: js.UndefOr[scala.Double] = js.undefined
}


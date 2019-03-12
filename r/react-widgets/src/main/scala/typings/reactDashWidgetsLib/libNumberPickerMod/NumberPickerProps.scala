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
  var onKeyDown: js.UndefOr[js.Function1[/* event */ stdLib.KeyboardEvent, scala.Unit]] = js.undefined
  /**
    * The native onKeyPress event, called preventDefault will stop any custom behavior.
    */
  var onKeyPress: js.UndefOr[js.Function1[/* event */ stdLib.KeyboardEvent, scala.Unit]] = js.undefined
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

object NumberPickerProps {
  @scala.inline
  def apply(
    autoFocus: js.UndefOr[scala.Boolean] = js.undefined,
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    culture: java.lang.String = null,
    defaultValue: scala.Int | scala.Double = null,
    disabled: scala.Boolean | js.Array[_] = null,
    format: js.Any = null,
    id: java.lang.String = null,
    inputProps: js.Object = null,
    isRtl: js.UndefOr[scala.Boolean] = js.undefined,
    key: reactLib.reactMod.ReactNs.Key = null,
    max: scala.Int | scala.Double = null,
    messages: NumberPickerMessages = null,
    min: scala.Int | scala.Double = null,
    name: java.lang.String = null,
    onChange: /* value */ js.UndefOr[scala.Double] => scala.Unit = null,
    onKeyDown: /* event */ stdLib.KeyboardEvent => scala.Unit = null,
    onKeyPress: /* event */ stdLib.KeyboardEvent => scala.Unit = null,
    open: js.UndefOr[scala.Boolean] = js.undefined,
    parse: js.Array[java.lang.String] | (js.Function2[/* str */ java.lang.String, /* culture */ java.lang.String, scala.Double]) = null,
    placeholder: java.lang.String = null,
    precision: scala.Int | scala.Double = null,
    readOnly: scala.Boolean | js.Array[_] = null,
    ref: reactLib.reactMod.ReactNs.LegacyRef[NumberPickerClass] = null,
    step: scala.Int | scala.Double = null,
    value: scala.Int | scala.Double = null
  ): NumberPickerProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (culture != null) __obj.updateDynamic("culture")(culture)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (disabled != null) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format)
    if (id != null) __obj.updateDynamic("id")(id)
    if (inputProps != null) __obj.updateDynamic("inputProps")(inputProps)
    if (!js.isUndefined(isRtl)) __obj.updateDynamic("isRtl")(isRtl)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (messages != null) __obj.updateDynamic("messages")(messages)
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1(onKeyDown))
    if (onKeyPress != null) __obj.updateDynamic("onKeyPress")(js.Any.fromFunction1(onKeyPress))
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open)
    if (parse != null) __obj.updateDynamic("parse")(parse.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (readOnly != null) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberPickerProps]
  }
}


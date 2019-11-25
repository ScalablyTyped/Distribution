package typings.reactDashWidgets.libNumberPickerMod

import typings.react.reactMod.Key
import typings.react.reactMod.LegacyRef
import typings.react.reactMod.ReactNode
import typings.reactDashWidgets.libCommonPropsMod.AutoFocus
import typings.reactDashWidgets.libCommonPropsMod.ReactWidgetsCommonProps
import typings.std.KeyboardEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NumberPickerProps
  extends ReactWidgetsCommonProps[NumberPickerClass]
     with AutoFocus {
  /**
    * Set the culture of the NumberPicker, passed to the configured localizer.
    */
  var culture: js.UndefOr[String] = js.undefined
  /**
    * Default Value.
    */
  var defaultValue: js.UndefOr[Double] = js.undefined
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
  var max: js.UndefOr[Double] = js.undefined
  /**
    * Object hash containing display text and/or text for screen readers. Use the messages
    * object to localize widget text and increase accessibility.
    */
  var messages: js.UndefOr[NumberPickerMessages] = js.undefined
  /**
    * The minimum number that the NumberPicker value.
    * @default -Infinity
    */
  var min: js.UndefOr[Double] = js.undefined
  /**
    * The HTML name attribute, passed directly to the input element.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Change event Handler that is called when the value is changed. The handler is called with
    * the current numeric value or null.
    */
  var onChange: js.UndefOr[js.Function1[/* value */ js.UndefOr[Double], Unit]] = js.undefined
  /**
    * The native onKeyDown event, called preventDefault will prevent any custom behavior, included keyboard shortcuts.
    */
  var onKeyDown: js.UndefOr[js.Function1[/* event */ KeyboardEvent, Unit]] = js.undefined
  /**
    * The native onKeyPress event, called preventDefault will stop any custom behavior.
    */
  var onKeyPress: js.UndefOr[js.Function1[/* event */ KeyboardEvent, Unit]] = js.undefined
  /**
    * Controls the visibility of the NumberPicker popup. Use defaultOpen to set an initial value for uncontrolled widgets.
    * @default false
    */
  var open: js.UndefOr[Boolean] = js.undefined
  /**
    * Determines how the NumberPicker parses a number from the localized string representation.
    * You can also provide a parser Function to pair with a custom format.
    */
  var parse: js.UndefOr[
    js.Array[String] | (js.Function2[/* str */ String, /* culture */ String, Double])
  ] = js.undefined
  /**
    * Text to display in the input when the value is empty.
    */
  var placeholder: js.UndefOr[String] = js.undefined
  /**
    * Specify how precise the value should be when typing, incrementing, or decrementing the
    * value. When empty, precision is parsed from the current format and culture.
    */
  var precision: js.UndefOr[Double] = js.undefined
  /**
    * Amount to increase or decrease value when using the spinner buttons.
    * @default 1
    */
  var step: js.UndefOr[Double] = js.undefined
  /**
    * The current value of the NumberPicker.
    */
  var value: js.UndefOr[Double] = js.undefined
}

object NumberPickerProps {
  @scala.inline
  def apply(
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    children: ReactNode = null,
    culture: String = null,
    defaultValue: Int | Double = null,
    disabled: Boolean | js.Array[_] = null,
    format: js.Any = null,
    id: String = null,
    inputProps: js.Object = null,
    isRtl: js.UndefOr[Boolean] = js.undefined,
    key: Key = null,
    max: Int | Double = null,
    messages: NumberPickerMessages = null,
    min: Int | Double = null,
    name: String = null,
    onChange: /* value */ js.UndefOr[Double] => Unit = null,
    onKeyDown: /* event */ KeyboardEvent => Unit = null,
    onKeyPress: /* event */ KeyboardEvent => Unit = null,
    open: js.UndefOr[Boolean] = js.undefined,
    parse: js.Array[String] | (js.Function2[/* str */ String, /* culture */ String, Double]) = null,
    placeholder: String = null,
    precision: Int | Double = null,
    readOnly: Boolean | js.Array[_] = null,
    ref: LegacyRef[NumberPickerClass] = null,
    step: Int | Double = null,
    value: Int | Double = null
  ): NumberPickerProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (culture != null) __obj.updateDynamic("culture")(culture.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (disabled != null) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (inputProps != null) __obj.updateDynamic("inputProps")(inputProps.asInstanceOf[js.Any])
    if (!js.isUndefined(isRtl)) __obj.updateDynamic("isRtl")(isRtl.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (messages != null) __obj.updateDynamic("messages")(messages.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1(onKeyDown))
    if (onKeyPress != null) __obj.updateDynamic("onKeyPress")(js.Any.fromFunction1(onKeyPress))
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open.asInstanceOf[js.Any])
    if (parse != null) __obj.updateDynamic("parse")(parse.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (readOnly != null) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberPickerProps]
  }
}


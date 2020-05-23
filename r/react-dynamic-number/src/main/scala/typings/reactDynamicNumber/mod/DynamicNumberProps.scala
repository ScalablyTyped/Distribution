package typings.reactDynamicNumber.mod

import typings.react.mod.ChangeEvent
import typings.reactDynamicNumber.reactDynamicNumberStrings.Comma
import typings.reactDynamicNumber.reactDynamicNumberStrings.Dot
import typings.reactDynamicNumber.reactDynamicNumberStrings.Space
import typings.reactDynamicNumber.reactDynamicNumberStrings._empty
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof react-dynamic-number.react-dynamic-number.Omit<react.react.DetailedHTMLProps<react.react.InputHTMLAttributes<std.HTMLInputElement>, std.HTMLInputElement>, 'ref' | 'value' | 'onChange' | 'placeholder'> ]:? react-dynamic-number.react-dynamic-number.Omit<react.react.DetailedHTMLProps<react.react.InputHTMLAttributes<std.HTMLInputElement>, std.HTMLInputElement>, 'ref' | 'value' | 'onChange' | 'placeholder'>[P]} */ trait DynamicNumberProps extends js.Object {
  var fraction: js.UndefOr[Double] = js.undefined
  var integer: js.UndefOr[Double] = js.undefined
  var negative: js.UndefOr[Boolean] = js.undefined
  var onChange: js.UndefOr[
    js.Function3[
      /* event */ ChangeEvent[HTMLInputElement], 
      /* modelValue */ Double, 
      /* viewValue */ String, 
      Unit
    ]
  ] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var positive: js.UndefOr[Boolean] = js.undefined
  var separator: js.UndefOr[Dot | Comma] = js.undefined
  var thousand: js.UndefOr[Boolean | Space] = js.undefined
  var value: js.UndefOr[Double | _empty] = js.undefined
}

object DynamicNumberProps {
  @scala.inline
  def apply(
    fraction: js.UndefOr[Double] = js.undefined,
    integer: js.UndefOr[Double] = js.undefined,
    negative: js.UndefOr[Boolean] = js.undefined,
    onChange: (/* event */ ChangeEvent[HTMLInputElement], /* modelValue */ Double, /* viewValue */ String) => Unit = null,
    placeholder: String = null,
    positive: js.UndefOr[Boolean] = js.undefined,
    separator: Dot | Comma = null,
    thousand: Boolean | Space = null,
    value: Double | _empty = null
  ): DynamicNumberProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(fraction)) __obj.updateDynamic("fraction")(fraction.get.asInstanceOf[js.Any])
    if (!js.isUndefined(integer)) __obj.updateDynamic("integer")(integer.get.asInstanceOf[js.Any])
    if (!js.isUndefined(negative)) __obj.updateDynamic("negative")(negative.get.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction3(onChange))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (!js.isUndefined(positive)) __obj.updateDynamic("positive")(positive.get.asInstanceOf[js.Any])
    if (separator != null) __obj.updateDynamic("separator")(separator.asInstanceOf[js.Any])
    if (thousand != null) __obj.updateDynamic("thousand")(thousand.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DynamicNumberProps]
  }
}


package typings.reactDashDynamicDashNumber.reactDashDynamicDashNumberMod

import typings.react.reactMod.ChangeEvent
import typings.reactDashDynamicDashNumber.reactDashDynamicDashNumberStrings.DOT
import typings.reactDashDynamicDashNumber.reactDashDynamicDashNumberStrings.Empty
import typings.reactDashDynamicDashNumber.reactDashDynamicDashNumberStrings.` `
import typings.reactDashDynamicDashNumber.reactDashDynamicDashNumberStrings.`,`
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
  var separator: js.UndefOr[DOT | `,`] = js.undefined
  var thousand: js.UndefOr[Boolean | (` `)] = js.undefined
  var value: js.UndefOr[Double | Empty] = js.undefined
}

object DynamicNumberProps {
  @scala.inline
  def apply(
    fraction: Int | Double = null,
    integer: Int | Double = null,
    negative: js.UndefOr[Boolean] = js.undefined,
    onChange: (/* event */ ChangeEvent[HTMLInputElement], /* modelValue */ Double, /* viewValue */ String) => Unit = null,
    placeholder: String = null,
    positive: js.UndefOr[Boolean] = js.undefined,
    separator: DOT | `,` = null,
    thousand: Boolean | (` `) = null,
    value: Double | Empty = null
  ): DynamicNumberProps = {
    val __obj = js.Dynamic.literal()
    if (fraction != null) __obj.updateDynamic("fraction")(fraction.asInstanceOf[js.Any])
    if (integer != null) __obj.updateDynamic("integer")(integer.asInstanceOf[js.Any])
    if (!js.isUndefined(negative)) __obj.updateDynamic("negative")(negative.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction3(onChange))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (!js.isUndefined(positive)) __obj.updateDynamic("positive")(positive.asInstanceOf[js.Any])
    if (separator != null) __obj.updateDynamic("separator")(separator.asInstanceOf[js.Any])
    if (thousand != null) __obj.updateDynamic("thousand")(thousand.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DynamicNumberProps]
  }
}


package typings
package reactDashDynamicDashNumberLib.reactDashDynamicDashNumberMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof react-dynamic-number.react-dynamic-number.Omit<react.react.DetailedHTMLProps<react.react.InputHTMLAttributes<std.HTMLInputElement>, std.HTMLInputElement>, 'ref' | 'value' | 'onChange' | 'placeholder'> ]:? react-dynamic-number.react-dynamic-number.Omit<react.react.DetailedHTMLProps<react.react.InputHTMLAttributes<std.HTMLInputElement>, std.HTMLInputElement>, 'ref' | 'value' | 'onChange' | 'placeholder'>[P]} */ trait DynamicNumberProps extends js.Object {
  var fraction: js.UndefOr[scala.Double] = js.undefined
  var integer: js.UndefOr[scala.Double] = js.undefined
  var negative: js.UndefOr[scala.Boolean] = js.undefined
  var onChange: js.UndefOr[
    js.Function3[
      /* event */ reactLib.reactMod.ChangeEvent[stdLib.HTMLInputElement], 
      /* modelValue */ scala.Double, 
      /* viewValue */ java.lang.String, 
      scala.Unit
    ]
  ] = js.undefined
  var placeholder: js.UndefOr[java.lang.String] = js.undefined
  var positive: js.UndefOr[scala.Boolean] = js.undefined
  var separator: js.UndefOr[
    reactDashDynamicDashNumberLib.reactDashDynamicDashNumberLibStrings.DOT | reactDashDynamicDashNumberLib.reactDashDynamicDashNumberLibStrings.`,`
  ] = js.undefined
  var thousand: js.UndefOr[
    scala.Boolean | (reactDashDynamicDashNumberLib.reactDashDynamicDashNumberLibStrings.` `)
  ] = js.undefined
  var value: js.UndefOr[
    scala.Double | reactDashDynamicDashNumberLib.reactDashDynamicDashNumberLibStrings.Empty
  ] = js.undefined
}

object DynamicNumberProps {
  @scala.inline
  def apply(
    fraction: scala.Int | scala.Double = null,
    integer: scala.Int | scala.Double = null,
    negative: js.UndefOr[scala.Boolean] = js.undefined,
    onChange: (/* event */ reactLib.reactMod.ChangeEvent[stdLib.HTMLInputElement], /* modelValue */ scala.Double, /* viewValue */ java.lang.String) => scala.Unit = null,
    placeholder: java.lang.String = null,
    positive: js.UndefOr[scala.Boolean] = js.undefined,
    separator: reactDashDynamicDashNumberLib.reactDashDynamicDashNumberLibStrings.DOT | reactDashDynamicDashNumberLib.reactDashDynamicDashNumberLibStrings.`,` = null,
    thousand: scala.Boolean | (reactDashDynamicDashNumberLib.reactDashDynamicDashNumberLibStrings.` `) = null,
    value: scala.Double | reactDashDynamicDashNumberLib.reactDashDynamicDashNumberLibStrings.Empty = null
  ): DynamicNumberProps = {
    val __obj = js.Dynamic.literal()
    if (fraction != null) __obj.updateDynamic("fraction")(fraction.asInstanceOf[js.Any])
    if (integer != null) __obj.updateDynamic("integer")(integer.asInstanceOf[js.Any])
    if (!js.isUndefined(negative)) __obj.updateDynamic("negative")(negative)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction3(onChange))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (!js.isUndefined(positive)) __obj.updateDynamic("positive")(positive)
    if (separator != null) __obj.updateDynamic("separator")(separator.asInstanceOf[js.Any])
    if (thousand != null) __obj.updateDynamic("thousand")(thousand.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DynamicNumberProps]
  }
}


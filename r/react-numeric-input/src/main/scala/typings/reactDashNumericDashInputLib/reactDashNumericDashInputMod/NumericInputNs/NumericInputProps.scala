package typings
package reactDashNumericDashInputLib.reactDashNumericDashInputMod.NumericInputNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveDifficultInheritance: 
- Lifted 1 members from Set(std.Pick<react.react.InputHTMLAttributes<react.HTMLInputElement>, std.Exclude<keyof react.react.InputHTMLAttributes<react.HTMLInputElement>, 'min' | 'max' | 'step' | 'onChange' | 'defaultValue' | 'onInvalid' | 'style'>>) */ trait NumericInputProps extends js.Object {
  var addLabelText: js.UndefOr[java.lang.String] = js.undefined
  var componentClass: js.UndefOr[java.lang.String] = js.undefined
  var defaultValue: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var format: js.UndefOr[js.Function1[/* value */ scala.Double | scala.Null, java.lang.String]] = js.undefined
  var max: js.UndefOr[BoundsFunctionProp] = js.undefined
  var min: js.UndefOr[BoundsFunctionProp] = js.undefined
  var mobile: js.UndefOr[
    scala.Boolean | reactDashNumericDashInputLib.reactDashNumericDashInputLibStrings.auto | (js.Function1[
      /* component */ reactDashNumericDashInputLib.reactDashNumericDashInputMod.NumericInput, 
      scala.Boolean
    ])
  ] = js.undefined
  var noStyle: js.UndefOr[scala.Boolean] = js.undefined
  var noValidate: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  var onBlur: js.UndefOr[
    reactLib.reactMod.ReactNs.FocusEventHandler[reactLib.HTMLDivElement | reactLib.HTMLInputElement]
  ] = js.undefined
  var onChange: js.UndefOr[
    js.Function3[
      /* value */ scala.Double | scala.Null, 
      /* stringValue */ java.lang.String, 
      /* input */ reactLib.HTMLInputElement, 
      scala.Unit
    ]
  ] = js.undefined
  var onFocus: js.UndefOr[
    reactLib.reactMod.ReactNs.FocusEventHandler[reactLib.HTMLDivElement | reactLib.HTMLInputElement]
  ] = js.undefined
  var onInput: js.UndefOr[reactLib.reactMod.ReactNs.FormEventHandler[reactLib.HTMLInputElement]] = js.undefined
  var onInvalid: js.UndefOr[
    js.Function3[
      /* error */ java.lang.String, 
      /* value */ scala.Double | scala.Null, 
      /* stringValue */ java.lang.String, 
      scala.Unit
    ]
  ] = js.undefined
  var onKeyDown: js.UndefOr[
    reactLib.reactMod.ReactNs.KeyboardEventHandler[reactLib.HTMLDivElement | reactLib.HTMLInputElement]
  ] = js.undefined
  var onSelect: js.UndefOr[reactLib.reactMod.ReactNs.ReactEventHandler[reactLib.HTMLInputElement]] = js.undefined
  var onValid: js.UndefOr[
    js.Function2[
      /* value */ scala.Double | scala.Null, 
      /* stringValue */ java.lang.String, 
      scala.Unit
    ]
  ] = js.undefined
  var parse: js.UndefOr[js.Function1[/* stringValue */ java.lang.String, scala.Double | scala.Null]] = js.undefined
  var precision: js.UndefOr[
    scala.Double | (js.Function1[
      /* component */ reactDashNumericDashInputLib.reactDashNumericDashInputMod.NumericInput, 
      js.UndefOr[scala.Double | scala.Null]
    ])
  ] = js.undefined
  var snap: js.UndefOr[scala.Boolean] = js.undefined
  var step: js.UndefOr[
    scala.Double | (js.Function2[
      /* component */ reactDashNumericDashInputLib.reactDashNumericDashInputMod.NumericInput, 
      /* direction */ java.lang.String, 
      js.UndefOr[scala.Double]
    ])
  ] = js.undefined
  var strict: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[reactLib.reactMod.ReactNs.CSSProperties] | scala.Boolean
  ] = js.undefined
  var value: js.UndefOr[scala.Double | java.lang.String] = js.undefined
}


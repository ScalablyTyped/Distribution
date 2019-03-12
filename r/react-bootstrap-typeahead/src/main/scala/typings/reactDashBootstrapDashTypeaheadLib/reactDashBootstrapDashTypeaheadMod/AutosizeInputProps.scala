package typings
package reactDashBootstrapDashTypeaheadLib.reactDashBootstrapDashTypeaheadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in 'className' | 'style' ]: react.react.InputHTMLAttributes<'input'>[P]} */ trait AutosizeInputProps extends js.Object {
  var inputClassName: js.UndefOr[java.lang.String] = js.undefined
  var inputRef: js.UndefOr[reactLib.reactMod.ReactNs.LegacyRef[stdLib.HTMLInputElement]] = js.undefined
  var inputStyle: js.UndefOr[
    stdLib.Pick[
      reactLib.reactMod.ReactNs.CSSProperties, 
      reactDashBootstrapDashTypeaheadLib.reactDashBootstrapDashTypeaheadLibStrings.boxSizing | reactDashBootstrapDashTypeaheadLib.reactDashBootstrapDashTypeaheadLibStrings.width
    ]
  ] = js.undefined
  var style: reactLib.reactMod.ReactNs.CSSProperties
}

object AutosizeInputProps {
  @scala.inline
  def apply(
    style: reactLib.reactMod.ReactNs.CSSProperties,
    inputClassName: java.lang.String = null,
    inputRef: reactLib.reactMod.ReactNs.LegacyRef[stdLib.HTMLInputElement] = null,
    inputStyle: stdLib.Pick[
      reactLib.reactMod.ReactNs.CSSProperties, 
      reactDashBootstrapDashTypeaheadLib.reactDashBootstrapDashTypeaheadLibStrings.boxSizing | reactDashBootstrapDashTypeaheadLib.reactDashBootstrapDashTypeaheadLibStrings.width
    ] = null
  ): AutosizeInputProps = {
    val __obj = js.Dynamic.literal(style = style)
    if (inputClassName != null) __obj.updateDynamic("inputClassName")(inputClassName)
    if (inputRef != null) __obj.updateDynamic("inputRef")(inputRef.asInstanceOf[js.Any])
    if (inputStyle != null) __obj.updateDynamic("inputStyle")(inputStyle)
    __obj.asInstanceOf[AutosizeInputProps]
  }
}


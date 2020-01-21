package typings.reactBootstrapTypeahead.mod

import typings.react.mod.CSSProperties
import typings.react.mod.LegacyRef
import typings.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.boxSizing
import typings.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.width
import typings.std.HTMLInputElement
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in 'className' | 'style' ]: react.react.InputHTMLAttributes<'input'>[P]} */ trait AutosizeInputProps extends js.Object {
  var inputClassName: js.UndefOr[String] = js.undefined
  var inputRef: js.UndefOr[LegacyRef[HTMLInputElement]] = js.undefined
  var inputStyle: js.UndefOr[Pick[CSSProperties, boxSizing | width]] = js.undefined
  var style: CSSProperties
}

object AutosizeInputProps {
  @scala.inline
  def apply(
    style: CSSProperties,
    inputClassName: String = null,
    inputRef: LegacyRef[HTMLInputElement] = null,
    inputStyle: Pick[CSSProperties, boxSizing | width] = null
  ): AutosizeInputProps = {
    val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
    if (inputClassName != null) __obj.updateDynamic("inputClassName")(inputClassName.asInstanceOf[js.Any])
    if (inputRef != null) __obj.updateDynamic("inputRef")(inputRef.asInstanceOf[js.Any])
    if (inputStyle != null) __obj.updateDynamic("inputStyle")(inputStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutosizeInputProps]
  }
}


package typings.reactInputMask.mod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.InputHTMLAttributes
import typings.react.mod.Ref
import typings.std.HTMLInputElement
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Props extends InputHTMLAttributes[HTMLInputElement] {
  /**
    * Show mask even in empty input without focus.
    */
  var alwaysShowMask: js.UndefOr[Boolean] = js.native
  /**
    * In case you need to implement more complex masking behavior, you can provide
    * beforeMaskedValueChange function to change masked value and cursor position
    * before it will be applied to the input.
    */
  var beforeMaskedValueChange: js.UndefOr[
    js.Function4[
      /* newState */ InputState, 
      /* oldState */ InputState, 
      /* userInput */ String, 
      /* maskOptions */ MaskOptions, 
      InputState
    ]
  ] = js.native
  /**
    * Defines format characters with characters as keys and corresponding RegExp string as values. Default ones:
    * ```
    * {
    *   "9": "[0-9]",
    *   "a": "[A-Za-z]",
    *   "*": "[A-Za-z0-9]"
    * }```
    */
  var formatChars: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * Use inputRef instead of ref if you need input node to manage focus, selection, etc.
    */
  var inputRef: js.UndefOr[Ref[HTMLInputElement]] = js.native
  /**
    * Mask string. Format characters are:
    * * `9`: `0-9`
    * * `a`: `A-Z, a-z`
    * * `\*`: `A-Z, a-z, 0-9`
    *
    * Any character can be escaped with backslash, which usually will appear as double backslash in JS strings.
    * For example, German phone mask with unremoveable prefix +49 will look like `mask="+4\\9 99 999 99"` or `mask={"+4\\\\9 99 999 99"}`
    */
  var mask: String | (js.Array[String | RegExp]) = js.native
  /**
    * Character to cover unfilled editable parts of mask. Default character is "_". If set to null, unfilled parts will be empty, like in ordinary input.
    */
  var maskChar: js.UndefOr[String | Null] = js.native
}

object Props {
  @scala.inline
  def apply(mask: String | (js.Array[String | RegExp])): Props = {
    val __obj = js.Dynamic.literal(mask = mask.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
  @scala.inline
  implicit class PropsOps[Self <: Props] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMaskVarargs(value: (String | RegExp)*): Self = this.set("mask", js.Array(value :_*))
    @scala.inline
    def setMask(value: String | (js.Array[String | RegExp])): Self = this.set("mask", value.asInstanceOf[js.Any])
    @scala.inline
    def setAlwaysShowMask(value: Boolean): Self = this.set("alwaysShowMask", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlwaysShowMask: Self = this.set("alwaysShowMask", js.undefined)
    @scala.inline
    def setBeforeMaskedValueChange(
      value: (/* newState */ InputState, /* oldState */ InputState, /* userInput */ String, /* maskOptions */ MaskOptions) => InputState
    ): Self = this.set("beforeMaskedValueChange", js.Any.fromFunction4(value))
    @scala.inline
    def deleteBeforeMaskedValueChange: Self = this.set("beforeMaskedValueChange", js.undefined)
    @scala.inline
    def setFormatChars(value: StringDictionary[String]): Self = this.set("formatChars", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormatChars: Self = this.set("formatChars", js.undefined)
    @scala.inline
    def setInputRefFunction1(value: /* instance */ HTMLInputElement | Null => Unit): Self = this.set("inputRef", js.Any.fromFunction1(value))
    @scala.inline
    def setInputRef(value: Ref[HTMLInputElement]): Self = this.set("inputRef", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputRef: Self = this.set("inputRef", js.undefined)
    @scala.inline
    def setInputRefNull: Self = this.set("inputRef", null)
    @scala.inline
    def setMaskChar(value: String): Self = this.set("maskChar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaskChar: Self = this.set("maskChar", js.undefined)
    @scala.inline
    def setMaskCharNull: Self = this.set("maskChar", null)
  }
  
}


package typings
package reactstrapLib.libInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputProps
  extends reactLib.reactMod.InputHTMLAttributes[stdLib.HTMLInputElement]
     with /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var addon: js.UndefOr[scala.Boolean] = js.undefined
  var bsSize: js.UndefOr[reactstrapLib.reactstrapLibStrings.lg | reactstrapLib.reactstrapLibStrings.sm] = js.undefined
  var cssModule: js.UndefOr[reactstrapLib.reactstrapMod.CSSModule] = js.undefined
  var innerRef: js.UndefOr[reactLib.reactMod.Ref[stdLib.HTMLInputElement]] = js.undefined
  var invalid: js.UndefOr[scala.Boolean] = js.undefined
  var plaintext: js.UndefOr[scala.Boolean] = js.undefined
  var state: js.UndefOr[java.lang.String] = js.undefined
  var tag: js.UndefOr[reactLib.reactMod.ReactType[_]] = js.undefined
  @JSName("type")
  var type_InputProps: js.UndefOr[InputType] = js.undefined
  var valid: js.UndefOr[scala.Boolean] = js.undefined
}

object InputProps {
  @scala.inline
  def apply(
    InputHTMLAttributes: reactLib.reactMod.InputHTMLAttributes[stdLib.HTMLInputElement] = null,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    addon: js.UndefOr[scala.Boolean] = js.undefined,
    bsSize: reactstrapLib.reactstrapLibStrings.lg | reactstrapLib.reactstrapLibStrings.sm = null,
    className: java.lang.String = null,
    cssModule: reactstrapLib.reactstrapMod.CSSModule = null,
    innerRef: reactLib.reactMod.Ref[stdLib.HTMLInputElement] = null,
    invalid: js.UndefOr[scala.Boolean] = js.undefined,
    plaintext: js.UndefOr[scala.Boolean] = js.undefined,
    state: java.lang.String = null,
    tag: reactLib.reactMod.ReactType[_] = null,
    `type`: InputType = null,
    valid: js.UndefOr[scala.Boolean] = js.undefined
  ): InputProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, InputHTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(addon)) __obj.updateDynamic("addon")(addon)
    if (bsSize != null) __obj.updateDynamic("bsSize")(bsSize.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (cssModule != null) __obj.updateDynamic("cssModule")(cssModule)
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (!js.isUndefined(invalid)) __obj.updateDynamic("invalid")(invalid)
    if (!js.isUndefined(plaintext)) __obj.updateDynamic("plaintext")(plaintext)
    if (state != null) __obj.updateDynamic("state")(state)
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(valid)) __obj.updateDynamic("valid")(valid)
    __obj.asInstanceOf[InputProps]
  }
}


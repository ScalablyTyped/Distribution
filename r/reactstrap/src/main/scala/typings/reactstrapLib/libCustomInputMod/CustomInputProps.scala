package typings
package reactstrapLib.libCustomInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomInputProps
  extends reactLib.reactMod.InputHTMLAttributes[stdLib.HTMLInputElement]
     with /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var bsSize: js.UndefOr[reactstrapLib.reactstrapLibStrings.lg | reactstrapLib.reactstrapLibStrings.sm] = js.undefined
  var cssModule: js.UndefOr[reactstrapLib.reactstrapMod.CSSModule] = js.undefined
  var htmlFor: js.UndefOr[java.lang.String] = js.undefined
  var `inline`: js.UndefOr[scala.Boolean] = js.undefined
  var invalid: js.UndefOr[scala.Boolean] = js.undefined
  var label: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  @JSName("type")
  var type_CustomInputProps: CustomInputType
  var valid: js.UndefOr[scala.Boolean] = js.undefined
}

object CustomInputProps {
  @scala.inline
  def apply(
    `type`: CustomInputType,
    InputHTMLAttributes: reactLib.reactMod.InputHTMLAttributes[stdLib.HTMLInputElement] = null,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    bsSize: reactstrapLib.reactstrapLibStrings.lg | reactstrapLib.reactstrapLibStrings.sm = null,
    className: java.lang.String = null,
    cssModule: reactstrapLib.reactstrapMod.CSSModule = null,
    htmlFor: java.lang.String = null,
    `inline`: js.UndefOr[scala.Boolean] = js.undefined,
    invalid: js.UndefOr[scala.Boolean] = js.undefined,
    label: reactLib.reactMod.ReactNode = null,
    valid: js.UndefOr[scala.Boolean] = js.undefined
  ): CustomInputProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    js.Dynamic.global.Object.assign(__obj, InputHTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (bsSize != null) __obj.updateDynamic("bsSize")(bsSize.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (cssModule != null) __obj.updateDynamic("cssModule")(cssModule)
    if (htmlFor != null) __obj.updateDynamic("htmlFor")(htmlFor)
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`)
    if (!js.isUndefined(invalid)) __obj.updateDynamic("invalid")(invalid)
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (!js.isUndefined(valid)) __obj.updateDynamic("valid")(valid)
    __obj.asInstanceOf[CustomInputProps]
  }
}


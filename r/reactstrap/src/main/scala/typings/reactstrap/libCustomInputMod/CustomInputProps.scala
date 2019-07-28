package typings.reactstrap.libCustomInputMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.InputHTMLAttributes
import typings.react.reactMod.ReactNode
import typings.reactstrap.reactstrapMod.CSSModule
import typings.reactstrap.reactstrapStrings.lg
import typings.reactstrap.reactstrapStrings.sm
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomInputProps
  extends InputHTMLAttributes[HTMLInputElement]
     with /* key */ StringDictionary[js.Any] {
  var bsSize: js.UndefOr[lg | sm] = js.undefined
  var cssModule: js.UndefOr[CSSModule] = js.undefined
  var htmlFor: js.UndefOr[String] = js.undefined
  var `inline`: js.UndefOr[Boolean] = js.undefined
  var invalid: js.UndefOr[Boolean] = js.undefined
  var label: js.UndefOr[ReactNode] = js.undefined
  @JSName("type")
  var type_CustomInputProps: CustomInputType
  var valid: js.UndefOr[Boolean] = js.undefined
}

object CustomInputProps {
  @scala.inline
  def apply(
    `type`: CustomInputType,
    InputHTMLAttributes: InputHTMLAttributes[HTMLInputElement] = null,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    bsSize: lg | sm = null,
    className: String = null,
    cssModule: CSSModule = null,
    htmlFor: String = null,
    `inline`: js.UndefOr[Boolean] = js.undefined,
    invalid: js.UndefOr[Boolean] = js.undefined,
    label: ReactNode = null,
    valid: js.UndefOr[Boolean] = js.undefined
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


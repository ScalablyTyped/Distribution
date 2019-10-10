package typings.reactstrap.libInputMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.InputHTMLAttributes
import typings.react.reactMod.ReactType
import typings.react.reactMod.Ref
import typings.reactstrap.reactstrapMod.CSSModule
import typings.reactstrap.reactstrapStrings.lg
import typings.reactstrap.reactstrapStrings.sm
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputProps
  extends InputHTMLAttributes[HTMLInputElement]
     with /* key */ StringDictionary[js.Any] {
  var addon: js.UndefOr[Boolean] = js.undefined
  var bsSize: js.UndefOr[lg | sm] = js.undefined
  var cssModule: js.UndefOr[CSSModule] = js.undefined
  var innerRef: js.UndefOr[Ref[HTMLInputElement]] = js.undefined
  var invalid: js.UndefOr[Boolean] = js.undefined
  var plaintext: js.UndefOr[Boolean] = js.undefined
  var state: js.UndefOr[String] = js.undefined
  var tag: js.UndefOr[String | ReactType[_]] = js.undefined
  @JSName("type")
  var type_InputProps: js.UndefOr[InputType] = js.undefined
  var valid: js.UndefOr[Boolean] = js.undefined
}

object InputProps {
  @scala.inline
  def apply(
    InputHTMLAttributes: InputHTMLAttributes[HTMLInputElement] = null,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    addon: js.UndefOr[Boolean] = js.undefined,
    bsSize: lg | sm = null,
    className: String = null,
    cssModule: CSSModule = null,
    innerRef: Ref[HTMLInputElement] = null,
    invalid: js.UndefOr[Boolean] = js.undefined,
    plaintext: js.UndefOr[Boolean] = js.undefined,
    state: String = null,
    tag: String | ReactType[_] = null,
    `type`: InputType = null,
    valid: js.UndefOr[Boolean] = js.undefined
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


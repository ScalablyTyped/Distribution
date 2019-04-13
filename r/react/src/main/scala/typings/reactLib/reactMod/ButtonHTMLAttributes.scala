package typings
package reactLib.reactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonHTMLAttributes[T] extends HTMLAttributes[T] {
  var autoFocus: js.UndefOr[scala.Boolean] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var form: js.UndefOr[java.lang.String] = js.undefined
  var formAction: js.UndefOr[java.lang.String] = js.undefined
  var formEncType: js.UndefOr[java.lang.String] = js.undefined
  var formMethod: js.UndefOr[java.lang.String] = js.undefined
  var formNoValidate: js.UndefOr[scala.Boolean] = js.undefined
  var formTarget: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[
    reactLib.reactLibStrings.submit | reactLib.reactLibStrings.reset | reactLib.reactLibStrings.button
  ] = js.undefined
  var value: js.UndefOr[java.lang.String | js.Array[java.lang.String] | scala.Double] = js.undefined
}

object ButtonHTMLAttributes {
  @scala.inline
  def apply[T](
    HTMLAttributes: HTMLAttributes[T] = null,
    autoFocus: js.UndefOr[scala.Boolean] = js.undefined,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    form: java.lang.String = null,
    formAction: java.lang.String = null,
    formEncType: java.lang.String = null,
    formMethod: java.lang.String = null,
    formNoValidate: js.UndefOr[scala.Boolean] = js.undefined,
    formTarget: java.lang.String = null,
    name: java.lang.String = null,
    `type`: reactLib.reactLibStrings.submit | reactLib.reactLibStrings.reset | reactLib.reactLibStrings.button = null,
    value: java.lang.String | js.Array[java.lang.String] | scala.Double = null
  ): ButtonHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (form != null) __obj.updateDynamic("form")(form)
    if (formAction != null) __obj.updateDynamic("formAction")(formAction)
    if (formEncType != null) __obj.updateDynamic("formEncType")(formEncType)
    if (formMethod != null) __obj.updateDynamic("formMethod")(formMethod)
    if (!js.isUndefined(formNoValidate)) __obj.updateDynamic("formNoValidate")(formNoValidate)
    if (formTarget != null) __obj.updateDynamic("formTarget")(formTarget)
    if (name != null) __obj.updateDynamic("name")(name)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonHTMLAttributes[T]]
  }
}


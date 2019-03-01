package typings
package reactLib.reactMod.ReactNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormHTMLAttributes[T] extends HTMLAttributes[T] {
  var acceptCharset: js.UndefOr[java.lang.String] = js.undefined
  var action: js.UndefOr[java.lang.String] = js.undefined
  var autoComplete: js.UndefOr[java.lang.String] = js.undefined
  var encType: js.UndefOr[java.lang.String] = js.undefined
  var method: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var noValidate: js.UndefOr[scala.Boolean] = js.undefined
  var target: js.UndefOr[java.lang.String] = js.undefined
}

object FormHTMLAttributes {
  @scala.inline
  def apply[T](
    HTMLAttributes: HTMLAttributes[T] = null,
    acceptCharset: java.lang.String = null,
    action: java.lang.String = null,
    autoComplete: java.lang.String = null,
    encType: java.lang.String = null,
    method: java.lang.String = null,
    name: java.lang.String = null,
    noValidate: js.UndefOr[scala.Boolean] = js.undefined,
    target: java.lang.String = null
  ): FormHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (acceptCharset != null) __obj.updateDynamic("acceptCharset")(acceptCharset)
    if (action != null) __obj.updateDynamic("action")(action)
    if (autoComplete != null) __obj.updateDynamic("autoComplete")(autoComplete)
    if (encType != null) __obj.updateDynamic("encType")(encType)
    if (method != null) __obj.updateDynamic("method")(method)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(noValidate)) __obj.updateDynamic("noValidate")(noValidate)
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[FormHTMLAttributes[T]]
  }
}


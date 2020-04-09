package typings.rax.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormHTMLAttributes[T] extends HTMLAttributes[T] {
  var acceptCharset: js.UndefOr[String] = js.undefined
  var action: js.UndefOr[String] = js.undefined
  var autoComplete: js.UndefOr[String] = js.undefined
  var encType: js.UndefOr[String] = js.undefined
  var method: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var noValidate: js.UndefOr[Boolean] = js.undefined
  var target: js.UndefOr[String] = js.undefined
}

object FormHTMLAttributes {
  @scala.inline
  def apply[T](
    HTMLAttributes: HTMLAttributes[T] = null,
    acceptCharset: String = null,
    action: String = null,
    autoComplete: String = null,
    encType: String = null,
    method: String = null,
    name: String = null,
    noValidate: js.UndefOr[Boolean] = js.undefined,
    target: String = null
  ): FormHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    if (HTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (acceptCharset != null) __obj.updateDynamic("acceptCharset")(acceptCharset.asInstanceOf[js.Any])
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (autoComplete != null) __obj.updateDynamic("autoComplete")(autoComplete.asInstanceOf[js.Any])
    if (encType != null) __obj.updateDynamic("encType")(encType.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(noValidate)) __obj.updateDynamic("noValidate")(noValidate.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormHTMLAttributes[T]]
  }
}


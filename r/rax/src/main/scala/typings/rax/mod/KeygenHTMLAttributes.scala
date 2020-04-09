package typings.rax.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeygenHTMLAttributes[T] extends HTMLAttributes[T] {
  var autoFocus: js.UndefOr[Boolean] = js.undefined
  var challenge: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var form: js.UndefOr[String] = js.undefined
  var keyParams: js.UndefOr[String] = js.undefined
  var keyType: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
}

object KeygenHTMLAttributes {
  @scala.inline
  def apply[T](
    HTMLAttributes: HTMLAttributes[T] = null,
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    challenge: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    form: String = null,
    keyParams: String = null,
    keyType: String = null,
    name: String = null
  ): KeygenHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    if (HTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus.asInstanceOf[js.Any])
    if (challenge != null) __obj.updateDynamic("challenge")(challenge.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (form != null) __obj.updateDynamic("form")(form.asInstanceOf[js.Any])
    if (keyParams != null) __obj.updateDynamic("keyParams")(keyParams.asInstanceOf[js.Any])
    if (keyType != null) __obj.updateDynamic("keyType")(keyType.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeygenHTMLAttributes[T]]
  }
}


package typings.react.reactMod

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
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus)
    if (challenge != null) __obj.updateDynamic("challenge")(challenge)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (form != null) __obj.updateDynamic("form")(form)
    if (keyParams != null) __obj.updateDynamic("keyParams")(keyParams)
    if (keyType != null) __obj.updateDynamic("keyType")(keyType)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[KeygenHTMLAttributes[T]]
  }
}


package typings
package reactLib.reactMod.ReactNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeygenHTMLAttributes[T] extends HTMLAttributes[T] {
  var autoFocus: js.UndefOr[scala.Boolean] = js.undefined
  var challenge: js.UndefOr[java.lang.String] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var form: js.UndefOr[java.lang.String] = js.undefined
  var keyParams: js.UndefOr[java.lang.String] = js.undefined
  var keyType: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object KeygenHTMLAttributes {
  @scala.inline
  def apply[T](
    HTMLAttributes: HTMLAttributes[T] = null,
    autoFocus: js.UndefOr[scala.Boolean] = js.undefined,
    challenge: java.lang.String = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    form: java.lang.String = null,
    keyParams: java.lang.String = null,
    keyType: java.lang.String = null,
    name: java.lang.String = null
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


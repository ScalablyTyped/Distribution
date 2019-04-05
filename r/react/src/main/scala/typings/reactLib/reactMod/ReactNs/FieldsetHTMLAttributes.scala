package typings
package reactLib.reactMod.ReactNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldsetHTMLAttributes[T] extends HTMLAttributes[T] {
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var form: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object FieldsetHTMLAttributes {
  @scala.inline
  def apply[T](
    HTMLAttributes: HTMLAttributes[T] = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    form: java.lang.String = null,
    name: java.lang.String = null
  ): FieldsetHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (form != null) __obj.updateDynamic("form")(form)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[FieldsetHTMLAttributes[T]]
  }
}


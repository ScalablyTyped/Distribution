package typings
package reactLib.reactMod.ReactNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapHTMLAttributes[T] extends HTMLAttributes[T] {
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object MapHTMLAttributes {
  @scala.inline
  def apply[T](HTMLAttributes: HTMLAttributes[T] = null, name: java.lang.String = null): MapHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[MapHTMLAttributes[T]]
  }
}


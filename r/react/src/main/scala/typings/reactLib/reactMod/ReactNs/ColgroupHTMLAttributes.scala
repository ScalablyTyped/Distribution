package typings
package reactLib.reactMod.ReactNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColgroupHTMLAttributes[T] extends HTMLAttributes[T] {
  var span: js.UndefOr[scala.Double] = js.undefined
}

object ColgroupHTMLAttributes {
  @scala.inline
  def apply[T](HTMLAttributes: HTMLAttributes[T] = null, span: scala.Int | scala.Double = null): ColgroupHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (span != null) __obj.updateDynamic("span")(span.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColgroupHTMLAttributes[T]]
  }
}


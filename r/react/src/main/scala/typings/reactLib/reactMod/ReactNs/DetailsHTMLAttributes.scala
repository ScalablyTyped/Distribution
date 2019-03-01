package typings
package reactLib.reactMod.ReactNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetailsHTMLAttributes[T] extends HTMLAttributes[T] {
  var open: js.UndefOr[scala.Boolean] = js.undefined
}

object DetailsHTMLAttributes {
  @scala.inline
  def apply[T](HTMLAttributes: HTMLAttributes[T] = null, open: js.UndefOr[scala.Boolean] = js.undefined): DetailsHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open)
    __obj.asInstanceOf[DetailsHTMLAttributes[T]]
  }
}


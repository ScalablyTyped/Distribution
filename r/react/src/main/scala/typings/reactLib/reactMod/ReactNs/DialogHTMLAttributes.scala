package typings
package reactLib.reactMod.ReactNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogHTMLAttributes[T] extends HTMLAttributes[T] {
  var open: js.UndefOr[scala.Boolean] = js.undefined
}

object DialogHTMLAttributes {
  @scala.inline
  def apply[T](HTMLAttributes: HTMLAttributes[T] = null, open: js.UndefOr[scala.Boolean] = js.undefined): DialogHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open)
    __obj.asInstanceOf[DialogHTMLAttributes[T]]
  }
}


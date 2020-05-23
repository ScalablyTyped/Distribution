package typings.reactNative.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegisteredStyleBrand[T] extends js.Object {
  var __registeredStyleBrand: T
}

object RegisteredStyleBrand {
  @scala.inline
  def apply[T](__registeredStyleBrand: T): RegisteredStyleBrand[T] = {
    val __obj = js.Dynamic.literal(__registeredStyleBrand = __registeredStyleBrand.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisteredStyleBrand[T]]
  }
}


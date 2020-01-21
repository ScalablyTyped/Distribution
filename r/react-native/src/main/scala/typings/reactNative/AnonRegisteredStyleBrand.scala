package typings.reactNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRegisteredStyleBrand[T] extends js.Object {
  var __registeredStyleBrand: T
}

object AnonRegisteredStyleBrand {
  @scala.inline
  def apply[T](__registeredStyleBrand: T): AnonRegisteredStyleBrand[T] = {
    val __obj = js.Dynamic.literal(__registeredStyleBrand = __registeredStyleBrand.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonRegisteredStyleBrand[T]]
  }
}


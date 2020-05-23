package typings.reactNativeElements.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Android extends js.Object {
  var android: Error
  var ios: Error
}

object Android {
  @scala.inline
  def apply(android: Error, ios: Error): Android = {
    val __obj = js.Dynamic.literal(android = android.asInstanceOf[js.Any], ios = ios.asInstanceOf[js.Any])
    __obj.asInstanceOf[Android]
  }
}


package typings.reactNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKey extends js.Object {
  var key: String
  var value: String | Double | Boolean
}

object AnonKey {
  @scala.inline
  def apply(key: String, value: String | Double | Boolean): AnonKey = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonKey]
  }
}


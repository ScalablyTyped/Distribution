package typings.reactNativeElements

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAndroid extends js.Object {
  var android: AnonError
  var ios: AnonError
}

object AnonAndroid {
  @scala.inline
  def apply(android: AnonError, ios: AnonError): AnonAndroid = {
    val __obj = js.Dynamic.literal(android = android.asInstanceOf[js.Any], ios = ios.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAndroid]
  }
}


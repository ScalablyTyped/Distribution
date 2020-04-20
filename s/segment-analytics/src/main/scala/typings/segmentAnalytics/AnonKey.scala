package typings.segmentAnalytics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKey extends js.Object {
  var key: String
  var oldKey: String
}

object AnonKey {
  @scala.inline
  def apply(key: String, oldKey: String): AnonKey = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], oldKey = oldKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonKey]
  }
}


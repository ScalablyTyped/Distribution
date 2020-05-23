package typings.segmentAnalytics.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Key extends js.Object {
  var key: String
  var oldKey: String
}

object Key {
  @scala.inline
  def apply(key: String, oldKey: String): Key = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], oldKey = oldKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Key]
  }
}


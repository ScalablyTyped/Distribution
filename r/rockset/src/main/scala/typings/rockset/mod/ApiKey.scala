package typings.rockset.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApiKey extends js.Object {
  // ISO-8601 date
  var created_at: js.UndefOr[String] = js.undefined
  // string of 64 alphanumeric characters
  var key: String
  // descriptive label
  var name: String
}

object ApiKey {
  @scala.inline
  def apply(key: String, name: String, created_at: String = null): ApiKey = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (created_at != null) __obj.updateDynamic("created_at")(created_at.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApiKey]
  }
}


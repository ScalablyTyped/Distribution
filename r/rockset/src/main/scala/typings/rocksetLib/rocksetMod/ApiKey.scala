package typings
package rocksetLib.rocksetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApiKey extends js.Object {
  // ISO-8601 date
  var created_at: js.UndefOr[java.lang.String] = js.undefined
  // string of 64 alphanumeric characters
  var key: java.lang.String
  // descriptive label
  var name: java.lang.String
}

object ApiKey {
  @scala.inline
  def apply(key: java.lang.String, name: java.lang.String, created_at: java.lang.String = null): ApiKey = {
    val __obj = js.Dynamic.literal(key = key, name = name)
    if (created_at != null) __obj.updateDynamic("created_at")(created_at)
    __obj.asInstanceOf[ApiKey]
  }
}


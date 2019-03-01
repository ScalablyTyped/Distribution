package typings
package realmLib.RealmNs.SyncNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SyncError extends js.Object {
  var category: js.UndefOr[java.lang.String] = js.undefined
  var code: scala.Double
  var isFatal: scala.Boolean
  var message: java.lang.String
  var name: java.lang.String
}

object SyncError {
  @scala.inline
  def apply(
    code: scala.Double,
    isFatal: scala.Boolean,
    message: java.lang.String,
    name: java.lang.String,
    category: java.lang.String = null
  ): SyncError = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("code")(code)
    __obj.updateDynamic("isFatal")(isFatal)
    __obj.updateDynamic("message")(message)
    __obj.updateDynamic("name")(name)
    if (category != null) __obj.updateDynamic("category")(category)
    __obj.asInstanceOf[SyncError]
  }
}


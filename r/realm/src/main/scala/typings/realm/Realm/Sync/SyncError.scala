package typings.realm.Realm.Sync

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SyncError extends js.Object {
  var category: js.UndefOr[String] = js.undefined
  var code: Double
  var isFatal: Boolean
  var message: String
  var name: String
}

object SyncError {
  @scala.inline
  def apply(code: Double, isFatal: Boolean, message: String, name: String, category: String = null): SyncError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], isFatal = isFatal.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (category != null) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    __obj.asInstanceOf[SyncError]
  }
}


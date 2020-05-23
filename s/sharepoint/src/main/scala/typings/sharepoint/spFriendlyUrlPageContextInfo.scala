package typings.sharepoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait spFriendlyUrlPageContextInfo extends js.Object {
  var termId: String
  var termSetId: String
  var termStoreId: String
  var title: String
}

object spFriendlyUrlPageContextInfo {
  @scala.inline
  def apply(termId: String, termSetId: String, termStoreId: String, title: String): spFriendlyUrlPageContextInfo = {
    val __obj = js.Dynamic.literal(termId = termId.asInstanceOf[js.Any], termSetId = termSetId.asInstanceOf[js.Any], termStoreId = termStoreId.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[spFriendlyUrlPageContextInfo]
  }
}


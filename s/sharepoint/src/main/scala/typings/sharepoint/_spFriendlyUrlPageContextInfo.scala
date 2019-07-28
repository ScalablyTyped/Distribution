package typings.sharepoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _spFriendlyUrlPageContextInfo extends js.Object {
  var termId: String
  var termSetId: String
  var termStoreId: String
  var title: String
}

object _spFriendlyUrlPageContextInfo {
  @scala.inline
  def apply(termId: String, termSetId: String, termStoreId: String, title: String): _spFriendlyUrlPageContextInfo = {
    val __obj = js.Dynamic.literal(termId = termId, termSetId = termSetId, termStoreId = termStoreId, title = title)
  
    __obj.asInstanceOf[_spFriendlyUrlPageContextInfo]
  }
}


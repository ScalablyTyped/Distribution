package typings
package sharepointLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _spFriendlyUrlPageContextInfo extends js.Object {
  var termId: java.lang.String
  var termSetId: java.lang.String
  var termStoreId: java.lang.String
  var title: java.lang.String
}

object _spFriendlyUrlPageContextInfo {
  @scala.inline
  def apply(
    termId: java.lang.String,
    termSetId: java.lang.String,
    termStoreId: java.lang.String,
    title: java.lang.String
  ): _spFriendlyUrlPageContextInfo = {
    val __obj = js.Dynamic.literal(termId = termId, termSetId = termSetId, termStoreId = termStoreId, title = title)
  
    __obj.asInstanceOf[_spFriendlyUrlPageContextInfo]
  }
}


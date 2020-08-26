package typings.sharepoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait spFriendlyUrlPageContextInfo extends js.Object {
  var termId: String = js.native
  var termSetId: String = js.native
  var termStoreId: String = js.native
  var title: String = js.native
}

object spFriendlyUrlPageContextInfo {
  @scala.inline
  def apply(termId: String, termSetId: String, termStoreId: String, title: String): spFriendlyUrlPageContextInfo = {
    val __obj = js.Dynamic.literal(termId = termId.asInstanceOf[js.Any], termSetId = termSetId.asInstanceOf[js.Any], termStoreId = termStoreId.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[spFriendlyUrlPageContextInfo]
  }
  @scala.inline
  implicit class spFriendlyUrlPageContextInfoOps[Self <: spFriendlyUrlPageContextInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setTermId(value: String): Self = this.set("termId", value.asInstanceOf[js.Any])
    @scala.inline
    def setTermSetId(value: String): Self = this.set("termSetId", value.asInstanceOf[js.Any])
    @scala.inline
    def setTermStoreId(value: String): Self = this.set("termStoreId", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
  }
  
}


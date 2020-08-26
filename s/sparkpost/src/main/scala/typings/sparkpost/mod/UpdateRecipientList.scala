package typings.sparkpost.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateRecipientList extends js.Object {
  /** Recipient list attribute object */
  var attributes: js.UndefOr[js.Any] = js.native
  /** Detailed description of the recipient list */
  var description: js.UndefOr[String] = js.native
  /** Short, unique, recipient list identifier */
  var id: js.UndefOr[String] = js.native
  /** Short, pretty/readable recipient list display name, not required to be unique */
  var name: js.UndefOr[String] = js.native
  /** Array of recipient objects */
  var recipients: js.Array[Recipient] = js.native
}

object UpdateRecipientList {
  @scala.inline
  def apply(recipients: js.Array[Recipient]): UpdateRecipientList = {
    val __obj = js.Dynamic.literal(recipients = recipients.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRecipientList]
  }
  @scala.inline
  implicit class UpdateRecipientListOps[Self <: UpdateRecipientList] (val x: Self) extends AnyVal {
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
    def setRecipientsVarargs(value: Recipient*): Self = this.set("recipients", js.Array(value :_*))
    @scala.inline
    def setRecipients(value: js.Array[Recipient]): Self = this.set("recipients", value.asInstanceOf[js.Any])
    @scala.inline
    def setAttributes(value: js.Any): Self = this.set("attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributes: Self = this.set("attributes", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}


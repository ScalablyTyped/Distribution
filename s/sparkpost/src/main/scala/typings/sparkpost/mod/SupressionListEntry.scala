package typings.sparkpost.mod

import typings.sparkpost.sparkpostStrings.Compliance
import typings.sparkpost.sparkpostStrings.`Bounce Rule`
import typings.sparkpost.sparkpostStrings.`List Unsubscribe`
import typings.sparkpost.sparkpostStrings.`Manually Added`
import typings.sparkpost.sparkpostStrings.`Spam Complaint`
import typings.sparkpost.sparkpostStrings.`Unsubscribe Link`
import typings.sparkpost.sparkpostStrings.non_transactional
import typings.sparkpost.sparkpostStrings.transactional
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SupressionListEntry extends js.Object {
  var created: String = js.native
  /** Short explanation of the suppression */
  var description: js.UndefOr[String] = js.native
  /**
    * Whether the recipient requested to not receive any non-transactional messages
    * Not required if a valid type is passed
    *
    * @deprecated Available, but deprecated in favor of type
    */
  var non_transactional: js.UndefOr[Boolean] = js.native
  /**
    * Email address to be suppressed
    *
    */
  var recipient: String = js.native
  /**
    * Source responsible for inserting the list entry
    *
    * no - entries created by the user are marked as Manually Added
    *
    */
  var source: js.UndefOr[
    (`Spam Complaint`) | (`List Unsubscribe`) | (`Bounce Rule`) | (`Unsubscribe Link`) | (`Manually Added`) | Compliance
  ] = js.native
  /**
    * Whether the recipient requested to not receive any transactional messages
    * Not required if a valid type is passed
    *
    * @deprecated Available, but deprecated in favor of type
    */
  var transactional: js.UndefOr[Boolean] = js.native
  /** Type of suppression record: transactional or non_transactional */
  var `type`: js.UndefOr[transactional | non_transactional] = js.native
  var updated: String = js.native
}

object SupressionListEntry {
  @scala.inline
  def apply(created: String, recipient: String, updated: String): SupressionListEntry = {
    val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], recipient = recipient.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any])
    __obj.asInstanceOf[SupressionListEntry]
  }
  @scala.inline
  implicit class SupressionListEntryOps[Self <: SupressionListEntry] (val x: Self) extends AnyVal {
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
    def setCreated(value: String): Self = this.set("created", value.asInstanceOf[js.Any])
    @scala.inline
    def setRecipient(value: String): Self = this.set("recipient", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdated(value: String): Self = this.set("updated", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setNon_transactional(value: Boolean): Self = this.set("non_transactional", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNon_transactional: Self = this.set("non_transactional", js.undefined)
    @scala.inline
    def setSource(
      value: (`Spam Complaint`) | (`List Unsubscribe`) | (`Bounce Rule`) | (`Unsubscribe Link`) | (`Manually Added`) | Compliance
    ): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    @scala.inline
    def setTransactional(value: Boolean): Self = this.set("transactional", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransactional: Self = this.set("transactional", js.undefined)
    @scala.inline
    def setType(value: transactional | non_transactional): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}


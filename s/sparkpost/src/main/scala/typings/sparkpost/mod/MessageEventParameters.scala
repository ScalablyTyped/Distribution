package typings.sparkpost.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MessageEventParameters extends js.Object {
  
  /** delimited list of bounce classification codes to search. (See Bounce Classification Codes.) */
  var bounce_classes: js.UndefOr[(js.Array[String | Double]) | String | Double] = js.native
  
  /** delimited list of campaign ID’s to search (i.e. the campaign id used during creation of a transmission). */
  var campaign_ids: js.UndefOr[js.Array[String] | String] = js.native
  
  /** Specifies the delimiter for query parameter lists */
  var delimiter: js.UndefOr[String] = js.native
  
  /** delimited list of event types to search. Defaults to all event types. */
  var events: js.UndefOr[js.Array[String] | String] = js.native
  
  /** delimited list of friendly from emails to search. */
  var friendly_froms: js.UndefOr[js.Array[String] | String] = js.native
  
  /** Datetime in format of YYYY-MM-DDTHH:MM. */
  var from: js.UndefOr[String] = js.native
  
  /** delimited list of message ID’s to search. */
  var message_ids: js.UndefOr[js.Array[String] | String] = js.native
  
  /** The results page number to return. Used with per_page for paging through results. */
  var page: js.UndefOr[Double] = js.native
  
  /** Number of results to return per page. Must be between 1 and 10,000 (inclusive). */
  var per_page: js.UndefOr[Double] = js.native
  
  /** Bounce/failure/rejection reason that will be matched using a wildcard (e.g., %reason%). */
  var reason: js.UndefOr[js.Array[String] | String] = js.native
  
  /** delimited list of recipients to search. */
  var recipients: js.UndefOr[js.Array[String] | String] = js.native
  
  /** delimited list of subaccount ID’s to search. */
  var subaccounts: js.UndefOr[js.Array[Double] | Double] = js.native
  
  /** delimited list of template ID’s to search. */
  var template_ids: js.UndefOr[js.Array[String] | String] = js.native
  
  /** Standard timezone identification string. */
  var timezone: js.UndefOr[String] = js.native
  
  /** Datetime in format of YYYY-MM-DDTHH:MM. */
  var to: js.UndefOr[String] = js.native
  
  /** delimited list of transmission ID’s to search (i.e. id generated during creation of a transmission). */
  var transmission_ids: js.UndefOr[js.Array[String] | String] = js.native
}
object MessageEventParameters {
  
  @scala.inline
  def apply(): MessageEventParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessageEventParameters]
  }
  
  @scala.inline
  implicit class MessageEventParametersOps[Self <: MessageEventParameters] (val x: Self) extends AnyVal {
    
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
    def setBounce_classesVarargs(value: (String | Double)*): Self = this.set("bounce_classes", js.Array(value :_*))
    
    @scala.inline
    def setBounce_classes(value: (js.Array[String | Double]) | String | Double): Self = this.set("bounce_classes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBounce_classes: Self = this.set("bounce_classes", js.undefined)
    
    @scala.inline
    def setCampaign_idsVarargs(value: String*): Self = this.set("campaign_ids", js.Array(value :_*))
    
    @scala.inline
    def setCampaign_ids(value: js.Array[String] | String): Self = this.set("campaign_ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCampaign_ids: Self = this.set("campaign_ids", js.undefined)
    
    @scala.inline
    def setDelimiter(value: String): Self = this.set("delimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelimiter: Self = this.set("delimiter", js.undefined)
    
    @scala.inline
    def setEventsVarargs(value: String*): Self = this.set("events", js.Array(value :_*))
    
    @scala.inline
    def setEvents(value: js.Array[String] | String): Self = this.set("events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvents: Self = this.set("events", js.undefined)
    
    @scala.inline
    def setFriendly_fromsVarargs(value: String*): Self = this.set("friendly_froms", js.Array(value :_*))
    
    @scala.inline
    def setFriendly_froms(value: js.Array[String] | String): Self = this.set("friendly_froms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFriendly_froms: Self = this.set("friendly_froms", js.undefined)
    
    @scala.inline
    def setFrom(value: String): Self = this.set("from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrom: Self = this.set("from", js.undefined)
    
    @scala.inline
    def setMessage_idsVarargs(value: String*): Self = this.set("message_ids", js.Array(value :_*))
    
    @scala.inline
    def setMessage_ids(value: js.Array[String] | String): Self = this.set("message_ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage_ids: Self = this.set("message_ids", js.undefined)
    
    @scala.inline
    def setPage(value: Double): Self = this.set("page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePage: Self = this.set("page", js.undefined)
    
    @scala.inline
    def setPer_page(value: Double): Self = this.set("per_page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePer_page: Self = this.set("per_page", js.undefined)
    
    @scala.inline
    def setReasonVarargs(value: String*): Self = this.set("reason", js.Array(value :_*))
    
    @scala.inline
    def setReason(value: js.Array[String] | String): Self = this.set("reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReason: Self = this.set("reason", js.undefined)
    
    @scala.inline
    def setRecipientsVarargs(value: String*): Self = this.set("recipients", js.Array(value :_*))
    
    @scala.inline
    def setRecipients(value: js.Array[String] | String): Self = this.set("recipients", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecipients: Self = this.set("recipients", js.undefined)
    
    @scala.inline
    def setSubaccountsVarargs(value: Double*): Self = this.set("subaccounts", js.Array(value :_*))
    
    @scala.inline
    def setSubaccounts(value: js.Array[Double] | Double): Self = this.set("subaccounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubaccounts: Self = this.set("subaccounts", js.undefined)
    
    @scala.inline
    def setTemplate_idsVarargs(value: String*): Self = this.set("template_ids", js.Array(value :_*))
    
    @scala.inline
    def setTemplate_ids(value: js.Array[String] | String): Self = this.set("template_ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplate_ids: Self = this.set("template_ids", js.undefined)
    
    @scala.inline
    def setTimezone(value: String): Self = this.set("timezone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimezone: Self = this.set("timezone", js.undefined)
    
    @scala.inline
    def setTo(value: String): Self = this.set("to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTo: Self = this.set("to", js.undefined)
    
    @scala.inline
    def setTransmission_idsVarargs(value: String*): Self = this.set("transmission_ids", js.Array(value :_*))
    
    @scala.inline
    def setTransmission_ids(value: js.Array[String] | String): Self = this.set("transmission_ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransmission_ids: Self = this.set("transmission_ids", js.undefined)
  }
}

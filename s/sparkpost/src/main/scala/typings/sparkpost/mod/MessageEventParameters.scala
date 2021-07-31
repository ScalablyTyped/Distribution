package typings.sparkpost.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageEventParameters extends StObject {
  
  /** delimited list of bounce classification codes to search. (See Bounce Classification Codes.) */
  var bounce_classes: js.UndefOr[(js.Array[String | Double]) | String | Double] = js.undefined
  
  /** delimited list of campaign ID’s to search (i.e. the campaign id used during creation of a transmission). */
  var campaign_ids: js.UndefOr[js.Array[String] | String] = js.undefined
  
  /** Specifies the delimiter for query parameter lists */
  var delimiter: js.UndefOr[String] = js.undefined
  
  /** delimited list of event types to search. Defaults to all event types. */
  var events: js.UndefOr[js.Array[String] | String] = js.undefined
  
  /** delimited list of friendly from emails to search. */
  var friendly_froms: js.UndefOr[js.Array[String] | String] = js.undefined
  
  /** Datetime in format of YYYY-MM-DDTHH:MM. */
  var from: js.UndefOr[String] = js.undefined
  
  /** delimited list of message ID’s to search. */
  var message_ids: js.UndefOr[js.Array[String] | String] = js.undefined
  
  /** The results page number to return. Used with per_page for paging through results. */
  var page: js.UndefOr[Double] = js.undefined
  
  /** Number of results to return per page. Must be between 1 and 10,000 (inclusive). */
  var per_page: js.UndefOr[Double] = js.undefined
  
  /** Bounce/failure/rejection reason that will be matched using a wildcard (e.g., %reason%). */
  var reason: js.UndefOr[js.Array[String] | String] = js.undefined
  
  /** delimited list of recipients to search. */
  var recipients: js.UndefOr[js.Array[String] | String] = js.undefined
  
  /** delimited list of subaccount ID’s to search. */
  var subaccounts: js.UndefOr[js.Array[Double] | Double] = js.undefined
  
  /** delimited list of template ID’s to search. */
  var template_ids: js.UndefOr[js.Array[String] | String] = js.undefined
  
  /** Standard timezone identification string. */
  var timezone: js.UndefOr[String] = js.undefined
  
  /** Datetime in format of YYYY-MM-DDTHH:MM. */
  var to: js.UndefOr[String] = js.undefined
  
  /** delimited list of transmission ID’s to search (i.e. id generated during creation of a transmission). */
  var transmission_ids: js.UndefOr[js.Array[String] | String] = js.undefined
}
object MessageEventParameters {
  
  @scala.inline
  def apply(): MessageEventParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessageEventParameters]
  }
  
  @scala.inline
  implicit class MessageEventParametersMutableBuilder[Self <: MessageEventParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBounce_classes(value: (js.Array[String | Double]) | String | Double): Self = StObject.set(x, "bounce_classes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBounce_classesUndefined: Self = StObject.set(x, "bounce_classes", js.undefined)
    
    @scala.inline
    def setBounce_classesVarargs(value: (String | Double)*): Self = StObject.set(x, "bounce_classes", js.Array(value :_*))
    
    @scala.inline
    def setCampaign_ids(value: js.Array[String] | String): Self = StObject.set(x, "campaign_ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCampaign_idsUndefined: Self = StObject.set(x, "campaign_ids", js.undefined)
    
    @scala.inline
    def setCampaign_idsVarargs(value: String*): Self = StObject.set(x, "campaign_ids", js.Array(value :_*))
    
    @scala.inline
    def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
    
    @scala.inline
    def setEvents(value: js.Array[String] | String): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    @scala.inline
    def setEventsVarargs(value: String*): Self = StObject.set(x, "events", js.Array(value :_*))
    
    @scala.inline
    def setFriendly_froms(value: js.Array[String] | String): Self = StObject.set(x, "friendly_froms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFriendly_fromsUndefined: Self = StObject.set(x, "friendly_froms", js.undefined)
    
    @scala.inline
    def setFriendly_fromsVarargs(value: String*): Self = StObject.set(x, "friendly_froms", js.Array(value :_*))
    
    @scala.inline
    def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    @scala.inline
    def setMessage_ids(value: js.Array[String] | String): Self = StObject.set(x, "message_ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage_idsUndefined: Self = StObject.set(x, "message_ids", js.undefined)
    
    @scala.inline
    def setMessage_idsVarargs(value: String*): Self = StObject.set(x, "message_ids", js.Array(value :_*))
    
    @scala.inline
    def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    @scala.inline
    def setPer_page(value: Double): Self = StObject.set(x, "per_page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPer_pageUndefined: Self = StObject.set(x, "per_page", js.undefined)
    
    @scala.inline
    def setReason(value: js.Array[String] | String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    @scala.inline
    def setReasonVarargs(value: String*): Self = StObject.set(x, "reason", js.Array(value :_*))
    
    @scala.inline
    def setRecipients(value: js.Array[String] | String): Self = StObject.set(x, "recipients", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipientsUndefined: Self = StObject.set(x, "recipients", js.undefined)
    
    @scala.inline
    def setRecipientsVarargs(value: String*): Self = StObject.set(x, "recipients", js.Array(value :_*))
    
    @scala.inline
    def setSubaccounts(value: js.Array[Double] | Double): Self = StObject.set(x, "subaccounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubaccountsUndefined: Self = StObject.set(x, "subaccounts", js.undefined)
    
    @scala.inline
    def setSubaccountsVarargs(value: Double*): Self = StObject.set(x, "subaccounts", js.Array(value :_*))
    
    @scala.inline
    def setTemplate_ids(value: js.Array[String] | String): Self = StObject.set(x, "template_ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplate_idsUndefined: Self = StObject.set(x, "template_ids", js.undefined)
    
    @scala.inline
    def setTemplate_idsVarargs(value: String*): Self = StObject.set(x, "template_ids", js.Array(value :_*))
    
    @scala.inline
    def setTimezone(value: String): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimezoneUndefined: Self = StObject.set(x, "timezone", js.undefined)
    
    @scala.inline
    def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    
    @scala.inline
    def setTransmission_ids(value: js.Array[String] | String): Self = StObject.set(x, "transmission_ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransmission_idsUndefined: Self = StObject.set(x, "transmission_ids", js.undefined)
    
    @scala.inline
    def setTransmission_idsVarargs(value: String*): Self = StObject.set(x, "transmission_ids", js.Array(value :_*))
  }
}

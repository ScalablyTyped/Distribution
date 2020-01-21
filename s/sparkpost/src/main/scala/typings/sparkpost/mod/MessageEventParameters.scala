package typings.sparkpost.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageEventParameters extends js.Object {
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
  def apply(
    bounce_classes: (js.Array[String | Double]) | String | Double = null,
    campaign_ids: js.Array[String] | String = null,
    delimiter: String = null,
    events: js.Array[String] | String = null,
    friendly_froms: js.Array[String] | String = null,
    from: String = null,
    message_ids: js.Array[String] | String = null,
    page: Int | Double = null,
    per_page: Int | Double = null,
    reason: js.Array[String] | String = null,
    recipients: js.Array[String] | String = null,
    subaccounts: js.Array[Double] | Double = null,
    template_ids: js.Array[String] | String = null,
    timezone: String = null,
    to: String = null,
    transmission_ids: js.Array[String] | String = null
  ): MessageEventParameters = {
    val __obj = js.Dynamic.literal()
    if (bounce_classes != null) __obj.updateDynamic("bounce_classes")(bounce_classes.asInstanceOf[js.Any])
    if (campaign_ids != null) __obj.updateDynamic("campaign_ids")(campaign_ids.asInstanceOf[js.Any])
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (friendly_froms != null) __obj.updateDynamic("friendly_froms")(friendly_froms.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (message_ids != null) __obj.updateDynamic("message_ids")(message_ids.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    if (recipients != null) __obj.updateDynamic("recipients")(recipients.asInstanceOf[js.Any])
    if (subaccounts != null) __obj.updateDynamic("subaccounts")(subaccounts.asInstanceOf[js.Any])
    if (template_ids != null) __obj.updateDynamic("template_ids")(template_ids.asInstanceOf[js.Any])
    if (timezone != null) __obj.updateDynamic("timezone")(timezone.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    if (transmission_ids != null) __obj.updateDynamic("transmission_ids")(transmission_ids.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageEventParameters]
  }
}


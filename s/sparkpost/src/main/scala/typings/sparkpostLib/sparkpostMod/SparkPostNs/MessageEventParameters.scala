package typings
package sparkpostLib.sparkpostMod.SparkPostNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageEventParameters extends js.Object {
  /** delimited list of bounce classification codes to search. (See Bounce Classification Codes.) */
  var bounce_classes: js.UndefOr[(js.Array[java.lang.String | scala.Double]) | java.lang.String | scala.Double] = js.undefined
  /** delimited list of campaign ID’s to search (i.e. the campaign id used during creation of a transmission). */
  var campaign_ids: js.UndefOr[js.Array[java.lang.String] | java.lang.String] = js.undefined
  /** Specifies the delimiter for query parameter lists */
  var delimiter: js.UndefOr[java.lang.String] = js.undefined
  /** delimited list of event types to search. Defaults to all event types. */
  var events: js.UndefOr[js.Array[java.lang.String] | java.lang.String] = js.undefined
  /** delimited list of friendly from emails to search. */
  var friendly_froms: js.UndefOr[js.Array[java.lang.String] | java.lang.String] = js.undefined
  /** Datetime in format of YYYY-MM-DDTHH:MM. */
  var from: js.UndefOr[java.lang.String] = js.undefined
  /** delimited list of message ID’s to search. */
  var message_ids: js.UndefOr[js.Array[java.lang.String] | java.lang.String] = js.undefined
  /** The results page number to return. Used with per_page for paging through results. */
  var page: js.UndefOr[scala.Double] = js.undefined
  /** Number of results to return per page. Must be between 1 and 10,000 (inclusive). */
  var per_page: js.UndefOr[scala.Double] = js.undefined
  /** Bounce/failure/rejection reason that will be matched using a wildcard (e.g., %reason%). */
  var reason: js.UndefOr[js.Array[java.lang.String] | java.lang.String] = js.undefined
  /** delimited list of recipients to search. */
  var recipients: js.UndefOr[js.Array[java.lang.String] | java.lang.String] = js.undefined
  /** delimited list of subaccount ID’s to search. */
  var subaccounts: js.UndefOr[js.Array[scala.Double] | scala.Double] = js.undefined
  /** delimited list of template ID’s to search. */
  var template_ids: js.UndefOr[js.Array[java.lang.String] | java.lang.String] = js.undefined
  /** Standard timezone identification string. */
  var timezone: js.UndefOr[java.lang.String] = js.undefined
  /** Datetime in format of YYYY-MM-DDTHH:MM. */
  var to: js.UndefOr[java.lang.String] = js.undefined
  /** delimited list of transmission ID’s to search (i.e. id generated during creation of a transmission). */
  var transmission_ids: js.UndefOr[js.Array[java.lang.String] | java.lang.String] = js.undefined
}


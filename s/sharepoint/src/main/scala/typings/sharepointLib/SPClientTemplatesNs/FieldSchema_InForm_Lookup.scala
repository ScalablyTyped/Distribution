package typings
package sharepointLib.SPClientTemplatesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents schema for a Lookup field in list form or in list view in grid mode */

trait FieldSchema_InForm_Lookup extends FieldSchema_InForm {
  /** Specifies if the field allows multiple values */
  var AllowMultipleValues: scala.Boolean
  /** Returns base url for a list display form, e.g. "http:// portal/web/_layouts/15/listform.aspx?PageType=4"
              You must add "ListId" (Guid of the list) and "ID" (integer Id of the item) parameters in order to use this Url */
  var BaseDisplayFormUrl: java.lang.String
  /** Number of choices. Appears only for Lookup field. */
  var ChoiceCount: scala.Double
  /** List of choices for this field. */
  var Choices: js.Array[sharepointLib.Anon_LookupValue]
  /** Indicates if the field is a dependent lookup */
  var DependentLookup: scala.Boolean
  var LookupListId: java.lang.String
  /** Returns string representation of a number that represents the current value for the "List Throttle Limit" web application setting.
              Only appears if Throttled property is true, i.e. the target lookup list is throttled. */
  var MaxQueryResult: java.lang.String
  /** Indicates wherever the lookup list is throttled (contains more items than value of the "List Throttle Limit" setting). */
  var Throttled: scala.Boolean
}


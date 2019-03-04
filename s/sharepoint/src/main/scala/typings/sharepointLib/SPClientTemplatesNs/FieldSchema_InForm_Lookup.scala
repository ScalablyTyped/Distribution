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
  var Choices: js.Array[sharepointLib.Anon_LookupId]
  /** Indicates if the field is a dependent lookup */
  var DependentLookup: scala.Boolean
  var LookupListId: java.lang.String
  /** Returns string representation of a number that represents the current value for the "List Throttle Limit" web application setting.
    Only appears if Throttled property is true, i.e. the target lookup list is throttled. */
  var MaxQueryResult: java.lang.String
  /** Indicates wherever the lookup list is throttled (contains more items than value of the "List Throttle Limit" setting). */
  var Throttled: scala.Boolean
}

object FieldSchema_InForm_Lookup {
  @scala.inline
  def apply(
    AllowGridEditing: scala.Boolean,
    AllowMultipleValues: scala.Boolean,
    BaseDisplayFormUrl: java.lang.String,
    ChoiceCount: scala.Double,
    Choices: js.Array[sharepointLib.Anon_LookupId],
    DependentLookup: scala.Boolean,
    Description: java.lang.String,
    Direction: java.lang.String,
    FieldType: java.lang.String,
    Hidden: scala.Boolean,
    IMEMode: js.Any,
    Id: java.lang.String,
    LookupListId: java.lang.String,
    MaxQueryResult: java.lang.String,
    Name: java.lang.String,
    ReadOnlyField: scala.Boolean,
    Required: scala.Boolean,
    RestrictedMode: scala.Boolean,
    Throttled: scala.Boolean,
    Title: java.lang.String,
    Type: java.lang.String,
    UseMinWidth: scala.Boolean
  ): FieldSchema_InForm_Lookup = {
    val __obj = js.Dynamic.literal(AllowGridEditing = AllowGridEditing, AllowMultipleValues = AllowMultipleValues, BaseDisplayFormUrl = BaseDisplayFormUrl, ChoiceCount = ChoiceCount, Choices = Choices, DependentLookup = DependentLookup, Description = Description, Direction = Direction, FieldType = FieldType, Hidden = Hidden, IMEMode = IMEMode, Id = Id, LookupListId = LookupListId, MaxQueryResult = MaxQueryResult, Name = Name, ReadOnlyField = ReadOnlyField, Required = Required, RestrictedMode = RestrictedMode, Throttled = Throttled, Title = Title, Type = Type, UseMinWidth = UseMinWidth)
  
    __obj.asInstanceOf[FieldSchema_InForm_Lookup]
  }
}


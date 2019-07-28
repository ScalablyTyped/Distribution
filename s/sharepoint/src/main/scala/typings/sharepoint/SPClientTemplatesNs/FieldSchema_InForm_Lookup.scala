package typings.sharepoint.SPClientTemplatesNs

import typings.sharepoint.Anon_LookupId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents schema for a Lookup field in list form or in list view in grid mode */
trait FieldSchema_InForm_Lookup extends FieldSchema_InForm {
  /** Specifies if the field allows multiple values */
  var AllowMultipleValues: Boolean
  /** Returns base url for a list display form, e.g. "http:// portal/web/_layouts/15/listform.aspx?PageType=4"
    You must add "ListId" (Guid of the list) and "ID" (integer Id of the item) parameters in order to use this Url */
  var BaseDisplayFormUrl: String
  /** Number of choices. Appears only for Lookup field. */
  var ChoiceCount: Double
  /** List of choices for this field. */
  var Choices: js.Array[Anon_LookupId]
  /** Indicates if the field is a dependent lookup */
  var DependentLookup: Boolean
  var LookupListId: String
  /** Returns string representation of a number that represents the current value for the "List Throttle Limit" web application setting.
    Only appears if Throttled property is true, i.e. the target lookup list is throttled. */
  var MaxQueryResult: String
  /** Indicates wherever the lookup list is throttled (contains more items than value of the "List Throttle Limit" setting). */
  var Throttled: Boolean
}

object FieldSchema_InForm_Lookup {
  @scala.inline
  def apply(
    AllowGridEditing: Boolean,
    AllowMultipleValues: Boolean,
    BaseDisplayFormUrl: String,
    ChoiceCount: Double,
    Choices: js.Array[Anon_LookupId],
    DependentLookup: Boolean,
    Description: String,
    Direction: String,
    FieldType: String,
    Hidden: Boolean,
    IMEMode: js.Any,
    Id: String,
    LookupListId: String,
    MaxQueryResult: String,
    Name: String,
    ReadOnlyField: Boolean,
    Required: Boolean,
    RestrictedMode: Boolean,
    Throttled: Boolean,
    Title: String,
    Type: String,
    UseMinWidth: Boolean
  ): FieldSchema_InForm_Lookup = {
    val __obj = js.Dynamic.literal(AllowGridEditing = AllowGridEditing, AllowMultipleValues = AllowMultipleValues, BaseDisplayFormUrl = BaseDisplayFormUrl, ChoiceCount = ChoiceCount, Choices = Choices, DependentLookup = DependentLookup, Description = Description, Direction = Direction, FieldType = FieldType, Hidden = Hidden, IMEMode = IMEMode, Id = Id, LookupListId = LookupListId, MaxQueryResult = MaxQueryResult, Name = Name, ReadOnlyField = ReadOnlyField, Required = Required, RestrictedMode = RestrictedMode, Throttled = Throttled, Title = Title, Type = Type, UseMinWidth = UseMinWidth)
  
    __obj.asInstanceOf[FieldSchema_InForm_Lookup]
  }
}


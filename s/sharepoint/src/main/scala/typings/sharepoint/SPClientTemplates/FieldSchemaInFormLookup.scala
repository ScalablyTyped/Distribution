package typings.sharepoint.SPClientTemplates

import typings.sharepoint.anon.LookupId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents schema for a Lookup field in list form or in list view in grid mode */
@js.native
trait FieldSchemaInFormLookup extends FieldSchemaInForm {
  /** Specifies if the field allows multiple values */
  var AllowMultipleValues: Boolean = js.native
  /** Returns base url for a list display form, e.g. "http:// portal/web/_layouts/15/listform.aspx?PageType=4"
    You must add "ListId" (Guid of the list) and "ID" (integer Id of the item) parameters in order to use this Url */
  var BaseDisplayFormUrl: String = js.native
  /** Number of choices. Appears only for Lookup field. */
  var ChoiceCount: Double = js.native
  /** List of choices for this field. */
  var Choices: js.Array[LookupId] = js.native
  /** Indicates if the field is a dependent lookup */
  var DependentLookup: Boolean = js.native
  var LookupListId: String = js.native
  /** Returns string representation of a number that represents the current value for the "List Throttle Limit" web application setting.
    Only appears if Throttled property is true, i.e. the target lookup list is throttled. */
  var MaxQueryResult: String = js.native
  /** Indicates wherever the lookup list is throttled (contains more items than value of the "List Throttle Limit" setting). */
  var Throttled: Boolean = js.native
}

object FieldSchemaInFormLookup {
  @scala.inline
  def apply(
    AllowGridEditing: Boolean,
    AllowMultipleValues: Boolean,
    BaseDisplayFormUrl: String,
    ChoiceCount: Double,
    Choices: js.Array[LookupId],
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
  ): FieldSchemaInFormLookup = {
    val __obj = js.Dynamic.literal(AllowGridEditing = AllowGridEditing.asInstanceOf[js.Any], AllowMultipleValues = AllowMultipleValues.asInstanceOf[js.Any], BaseDisplayFormUrl = BaseDisplayFormUrl.asInstanceOf[js.Any], ChoiceCount = ChoiceCount.asInstanceOf[js.Any], Choices = Choices.asInstanceOf[js.Any], DependentLookup = DependentLookup.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], Direction = Direction.asInstanceOf[js.Any], FieldType = FieldType.asInstanceOf[js.Any], Hidden = Hidden.asInstanceOf[js.Any], IMEMode = IMEMode.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], LookupListId = LookupListId.asInstanceOf[js.Any], MaxQueryResult = MaxQueryResult.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], ReadOnlyField = ReadOnlyField.asInstanceOf[js.Any], Required = Required.asInstanceOf[js.Any], RestrictedMode = RestrictedMode.asInstanceOf[js.Any], Throttled = Throttled.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], UseMinWidth = UseMinWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldSchemaInFormLookup]
  }
  @scala.inline
  implicit class FieldSchemaInFormLookupOps[Self <: FieldSchemaInFormLookup] (val x: Self) extends AnyVal {
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
    def setAllowMultipleValues(value: Boolean): Self = this.set("AllowMultipleValues", value.asInstanceOf[js.Any])
    @scala.inline
    def setBaseDisplayFormUrl(value: String): Self = this.set("BaseDisplayFormUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setChoiceCount(value: Double): Self = this.set("ChoiceCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setChoicesVarargs(value: LookupId*): Self = this.set("Choices", js.Array(value :_*))
    @scala.inline
    def setChoices(value: js.Array[LookupId]): Self = this.set("Choices", value.asInstanceOf[js.Any])
    @scala.inline
    def setDependentLookup(value: Boolean): Self = this.set("DependentLookup", value.asInstanceOf[js.Any])
    @scala.inline
    def setLookupListId(value: String): Self = this.set("LookupListId", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxQueryResult(value: String): Self = this.set("MaxQueryResult", value.asInstanceOf[js.Any])
    @scala.inline
    def setThrottled(value: Boolean): Self = this.set("Throttled", value.asInstanceOf[js.Any])
  }
  
}


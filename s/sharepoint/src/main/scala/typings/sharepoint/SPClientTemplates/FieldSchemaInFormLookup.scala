package typings.sharepoint.SPClientTemplates

import typings.sharepoint.anon.LookupId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents schema for a Lookup field in list form or in list view in grid mode */
trait FieldSchemaInFormLookup
  extends StObject
     with FieldSchemaInForm {
  
  /** Specifies if the field allows multiple values */
  var AllowMultipleValues: Boolean
  
  /** Returns base url for a list display form, e.g. "http:// portal/web/_layouts/15/listform.aspx?PageType=4"
    You must add "ListId" (Guid of the list) and "ID" (integer Id of the item) parameters in order to use this Url */
  var BaseDisplayFormUrl: String
  
  /** Number of choices. Appears only for Lookup field. */
  var ChoiceCount: Double
  
  /** List of choices for this field. */
  var Choices: js.Array[LookupId]
  
  /** Indicates if the field is a dependent lookup */
  var DependentLookup: Boolean
  
  var LookupListId: String
  
  /** Returns string representation of a number that represents the current value for the "List Throttle Limit" web application setting.
    Only appears if Throttled property is true, i.e. the target lookup list is throttled. */
  var MaxQueryResult: String
  
  /** Indicates wherever the lookup list is throttled (contains more items than value of the "List Throttle Limit" setting). */
  var Throttled: Boolean
}
object FieldSchemaInFormLookup {
  
  inline def apply(
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
    IMEMode: Any,
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
  implicit open class MutableBuilder[Self <: FieldSchemaInFormLookup] (val x: Self) extends AnyVal {
    
    inline def setAllowMultipleValues(value: Boolean): Self = StObject.set(x, "AllowMultipleValues", value.asInstanceOf[js.Any])
    
    inline def setBaseDisplayFormUrl(value: String): Self = StObject.set(x, "BaseDisplayFormUrl", value.asInstanceOf[js.Any])
    
    inline def setChoiceCount(value: Double): Self = StObject.set(x, "ChoiceCount", value.asInstanceOf[js.Any])
    
    inline def setChoices(value: js.Array[LookupId]): Self = StObject.set(x, "Choices", value.asInstanceOf[js.Any])
    
    inline def setChoicesVarargs(value: LookupId*): Self = StObject.set(x, "Choices", js.Array(value*))
    
    inline def setDependentLookup(value: Boolean): Self = StObject.set(x, "DependentLookup", value.asInstanceOf[js.Any])
    
    inline def setLookupListId(value: String): Self = StObject.set(x, "LookupListId", value.asInstanceOf[js.Any])
    
    inline def setMaxQueryResult(value: String): Self = StObject.set(x, "MaxQueryResult", value.asInstanceOf[js.Any])
    
    inline def setThrottled(value: Boolean): Self = StObject.set(x, "Throttled", value.asInstanceOf[js.Any])
  }
}

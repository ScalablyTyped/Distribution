package typings.sharepoint

import org.scalablytyped.runtime.StringDictionary
import typings.sharepoint.anon.Department
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISPClientPeoplePickerEntity
  extends StObject
     with /* name */ StringDictionary[js.Any] {
  
  var Description: js.UndefOr[String] = js.undefined
  
  var DisplayText: js.UndefOr[String] = js.undefined
  
  var DomainText: js.UndefOr[String] = js.undefined
  
  var EntityData: js.UndefOr[Department] = js.undefined
  
  var EntityType: js.UndefOr[String] = js.undefined
  
  var IsResolved: js.UndefOr[Boolean] = js.undefined
  
  var Key: js.UndefOr[String] = js.undefined
  
  var MultipleMatches: js.Array[ISPClientPeoplePickerEntity]
  
  var ProviderDisplayName: js.UndefOr[String] = js.undefined
  
  var ProviderName: js.UndefOr[String] = js.undefined
}
object ISPClientPeoplePickerEntity {
  
  @scala.inline
  def apply(MultipleMatches: js.Array[ISPClientPeoplePickerEntity]): ISPClientPeoplePickerEntity = {
    val __obj = js.Dynamic.literal(MultipleMatches = MultipleMatches.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISPClientPeoplePickerEntity]
  }
  
  @scala.inline
  implicit class ISPClientPeoplePickerEntityMutableBuilder[Self <: ISPClientPeoplePickerEntity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setDisplayText(value: String): Self = StObject.set(x, "DisplayText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayTextUndefined: Self = StObject.set(x, "DisplayText", js.undefined)
    
    @scala.inline
    def setDomainText(value: String): Self = StObject.set(x, "DomainText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainTextUndefined: Self = StObject.set(x, "DomainText", js.undefined)
    
    @scala.inline
    def setEntityData(value: Department): Self = StObject.set(x, "EntityData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityDataUndefined: Self = StObject.set(x, "EntityData", js.undefined)
    
    @scala.inline
    def setEntityType(value: String): Self = StObject.set(x, "EntityType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityTypeUndefined: Self = StObject.set(x, "EntityType", js.undefined)
    
    @scala.inline
    def setIsResolved(value: Boolean): Self = StObject.set(x, "IsResolved", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsResolvedUndefined: Self = StObject.set(x, "IsResolved", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
    
    @scala.inline
    def setMultipleMatches(value: js.Array[ISPClientPeoplePickerEntity]): Self = StObject.set(x, "MultipleMatches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultipleMatchesVarargs(value: ISPClientPeoplePickerEntity*): Self = StObject.set(x, "MultipleMatches", js.Array(value :_*))
    
    @scala.inline
    def setProviderDisplayName(value: String): Self = StObject.set(x, "ProviderDisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProviderDisplayNameUndefined: Self = StObject.set(x, "ProviderDisplayName", js.undefined)
    
    @scala.inline
    def setProviderName(value: String): Self = StObject.set(x, "ProviderName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProviderNameUndefined: Self = StObject.set(x, "ProviderName", js.undefined)
  }
}

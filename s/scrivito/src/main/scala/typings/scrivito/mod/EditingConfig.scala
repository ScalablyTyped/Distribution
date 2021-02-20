package typings.scrivito.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EditingConfig extends StObject {
  
  var attributes: js.UndefOr[EditingConfigAttributes] = js.native
  
  var description: js.UndefOr[String] = js.native
  
  var descriptionForContent: js.UndefOr[js.Function1[/* instance */ Obj | Widget, String]] = js.native
  
  var hideInSelectionDialogs: js.UndefOr[Boolean] = js.native
  
  var initialContent: js.UndefOr[Record[String, _]] = js.native
  
  var initializeCopy: js.UndefOr[js.Function1[/* originalInstance */ Obj, Unit]] = js.native
  
  var properties: js.UndefOr[js.Array[String]] = js.native
  
  var propertiesGroups: js.UndefOr[js.Array[PropertiesGroup]] = js.native
  
  var thumbnail: js.UndefOr[String] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var titleForContent: js.UndefOr[js.Function1[/* instance */ Obj | Widget, String | Unit]] = js.native
  
  var validations: js.UndefOr[js.Array[Validation]] = js.native
}
object EditingConfig {
  
  @scala.inline
  def apply(): EditingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditingConfig]
  }
  
  @scala.inline
  implicit class EditingConfigMutableBuilder[Self <: EditingConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: EditingConfigAttributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionForContent(value: /* instance */ Obj | Widget => String): Self = StObject.set(x, "descriptionForContent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDescriptionForContentUndefined: Self = StObject.set(x, "descriptionForContent", js.undefined)
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setHideInSelectionDialogs(value: Boolean): Self = StObject.set(x, "hideInSelectionDialogs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideInSelectionDialogsUndefined: Self = StObject.set(x, "hideInSelectionDialogs", js.undefined)
    
    @scala.inline
    def setInitialContent(value: Record[String, _]): Self = StObject.set(x, "initialContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialContentUndefined: Self = StObject.set(x, "initialContent", js.undefined)
    
    @scala.inline
    def setInitializeCopy(value: /* originalInstance */ Obj => Unit): Self = StObject.set(x, "initializeCopy", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInitializeCopyUndefined: Self = StObject.set(x, "initializeCopy", js.undefined)
    
    @scala.inline
    def setProperties(value: js.Array[String]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesGroups(value: js.Array[PropertiesGroup]): Self = StObject.set(x, "propertiesGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesGroupsUndefined: Self = StObject.set(x, "propertiesGroups", js.undefined)
    
    @scala.inline
    def setPropertiesGroupsVarargs(value: PropertiesGroup*): Self = StObject.set(x, "propertiesGroups", js.Array(value :_*))
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    @scala.inline
    def setPropertiesVarargs(value: String*): Self = StObject.set(x, "properties", js.Array(value :_*))
    
    @scala.inline
    def setThumbnail(value: String): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbnailUndefined: Self = StObject.set(x, "thumbnail", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleForContent(value: /* instance */ Obj | Widget => String | Unit): Self = StObject.set(x, "titleForContent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTitleForContentUndefined: Self = StObject.set(x, "titleForContent", js.undefined)
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setValidations(value: js.Array[Validation]): Self = StObject.set(x, "validations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidationsUndefined: Self = StObject.set(x, "validations", js.undefined)
    
    @scala.inline
    def setValidationsVarargs(value: Validation*): Self = StObject.set(x, "validations", js.Array(value :_*))
  }
}

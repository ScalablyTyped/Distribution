package typings.scrivito.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditingConfig extends StObject {
  
  var attributes: js.UndefOr[EditingConfigAttributes] = js.undefined
  
  var description: js.UndefOr[String] = js.undefined
  
  var descriptionForContent: js.UndefOr[js.Function1[/* instance */ Obj | Widget, String]] = js.undefined
  
  var hideInSelectionDialogs: js.UndefOr[Boolean] = js.undefined
  
  var initialContent: js.UndefOr[Record[String, Any]] = js.undefined
  
  var initialize: js.UndefOr[js.Function1[/* instance */ Obj, Unit]] = js.undefined
  
  var initializeCopy: js.UndefOr[js.Function1[/* originalInstance */ Obj, Unit]] = js.undefined
  
  var properties: js.UndefOr[js.Array[String]] = js.undefined
  
  var propertiesGroups: js.UndefOr[js.Array[PropertiesGroup]] = js.undefined
  
  var thumbnail: js.UndefOr[String] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  var titleForContent: js.UndefOr[js.Function1[/* instance */ Obj | Widget, String | Unit]] = js.undefined
  
  var validations: js.UndefOr[js.Array[Validation]] = js.undefined
}
object EditingConfig {
  
  inline def apply(): EditingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditingConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EditingConfig] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: EditingConfigAttributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionForContent(value: /* instance */ Obj | Widget => String): Self = StObject.set(x, "descriptionForContent", js.Any.fromFunction1(value))
    
    inline def setDescriptionForContentUndefined: Self = StObject.set(x, "descriptionForContent", js.undefined)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setHideInSelectionDialogs(value: Boolean): Self = StObject.set(x, "hideInSelectionDialogs", value.asInstanceOf[js.Any])
    
    inline def setHideInSelectionDialogsUndefined: Self = StObject.set(x, "hideInSelectionDialogs", js.undefined)
    
    inline def setInitialContent(value: Record[String, Any]): Self = StObject.set(x, "initialContent", value.asInstanceOf[js.Any])
    
    inline def setInitialContentUndefined: Self = StObject.set(x, "initialContent", js.undefined)
    
    inline def setInitialize(value: /* instance */ Obj => Unit): Self = StObject.set(x, "initialize", js.Any.fromFunction1(value))
    
    inline def setInitializeCopy(value: /* originalInstance */ Obj => Unit): Self = StObject.set(x, "initializeCopy", js.Any.fromFunction1(value))
    
    inline def setInitializeCopyUndefined: Self = StObject.set(x, "initializeCopy", js.undefined)
    
    inline def setInitializeUndefined: Self = StObject.set(x, "initialize", js.undefined)
    
    inline def setProperties(value: js.Array[String]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesGroups(value: js.Array[PropertiesGroup]): Self = StObject.set(x, "propertiesGroups", value.asInstanceOf[js.Any])
    
    inline def setPropertiesGroupsUndefined: Self = StObject.set(x, "propertiesGroups", js.undefined)
    
    inline def setPropertiesGroupsVarargs(value: PropertiesGroup*): Self = StObject.set(x, "propertiesGroups", js.Array(value*))
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setPropertiesVarargs(value: String*): Self = StObject.set(x, "properties", js.Array(value*))
    
    inline def setThumbnail(value: String): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
    
    inline def setThumbnailUndefined: Self = StObject.set(x, "thumbnail", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleForContent(value: /* instance */ Obj | Widget => String | Unit): Self = StObject.set(x, "titleForContent", js.Any.fromFunction1(value))
    
    inline def setTitleForContentUndefined: Self = StObject.set(x, "titleForContent", js.undefined)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setValidations(value: js.Array[Validation]): Self = StObject.set(x, "validations", value.asInstanceOf[js.Any])
    
    inline def setValidationsUndefined: Self = StObject.set(x, "validations", js.undefined)
    
    inline def setValidationsVarargs(value: Validation*): Self = StObject.set(x, "validations", js.Array(value*))
  }
}

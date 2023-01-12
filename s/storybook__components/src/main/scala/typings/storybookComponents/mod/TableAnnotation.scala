package typings.storybookComponents.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableAnnotation extends StObject {
  
  var category: js.UndefOr[String] = js.undefined
  
  var defaultValue: js.UndefOr[PropDefaultValue] = js.undefined
  
  var jsDocTags: js.UndefOr[JsDocTags] = js.undefined
  
  var `type`: PropType
}
object TableAnnotation {
  
  inline def apply(`type`: PropType): TableAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableAnnotation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TableAnnotation] (val x: Self) extends AnyVal {
    
    inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setDefaultValue(value: PropDefaultValue): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setJsDocTags(value: JsDocTags): Self = StObject.set(x, "jsDocTags", value.asInstanceOf[js.Any])
    
    inline def setJsDocTagsUndefined: Self = StObject.set(x, "jsDocTags", js.undefined)
    
    inline def setType(value: PropType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

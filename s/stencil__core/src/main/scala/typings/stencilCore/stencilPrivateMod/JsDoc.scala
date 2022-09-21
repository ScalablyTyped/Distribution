package typings.stencilCore.stencilPrivateMod

import typings.stencilCore.anon.Documentation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JsDoc extends StObject {
  
  var default: js.UndefOr[String] = js.undefined
  
  var documentation: String
  
  var name: String
  
  var parameters: js.UndefOr[js.Array[JsDoc]] = js.undefined
  
  var returns: js.UndefOr[Documentation] = js.undefined
  
  var tags: js.Array[JSDocTagInfo]
  
  var `type`: String
}
object JsDoc {
  
  inline def apply(documentation: String, name: String, tags: js.Array[JSDocTagInfo], `type`: String): JsDoc = {
    val __obj = js.Dynamic.literal(documentation = documentation.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsDoc]
  }
  
  extension [Self <: JsDoc](x: Self) {
    
    inline def setDefault(value: String): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    inline def setDocumentation(value: String): Self = StObject.set(x, "documentation", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setParameters(value: js.Array[JsDoc]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setParametersVarargs(value: JsDoc*): Self = StObject.set(x, "parameters", js.Array(value*))
    
    inline def setReturns(value: Documentation): Self = StObject.set(x, "returns", value.asInstanceOf[js.Any])
    
    inline def setReturnsUndefined: Self = StObject.set(x, "returns", js.undefined)
    
    inline def setTags(value: js.Array[JSDocTagInfo]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsVarargs(value: JSDocTagInfo*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

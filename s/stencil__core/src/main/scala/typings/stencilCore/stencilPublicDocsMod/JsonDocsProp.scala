package typings.stencilCore.stencilPublicDocsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JsonDocsProp extends StObject {
  
  var default: String
  
  /**
    * The name of the attribute that is exposed to configure a compiled web component
    */
  var attr: js.UndefOr[String] = js.undefined
  
  var deprecation: js.UndefOr[String] = js.undefined
  
  var docs: String
  
  var docsTags: js.Array[JsonDocsTag]
  
  var mutable: Boolean
  
  var name: String
  
  var optional: Boolean
  
  var reflectToAttr: Boolean
  
  var required: Boolean
  
  var `type`: String
  
  var values: js.Array[JsonDocsValue]
}
object JsonDocsProp {
  
  inline def apply(
    default: String,
    docs: String,
    docsTags: js.Array[JsonDocsTag],
    mutable: Boolean,
    name: String,
    optional: Boolean,
    reflectToAttr: Boolean,
    required: Boolean,
    `type`: String,
    values: js.Array[JsonDocsValue]
  ): JsonDocsProp = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], docs = docs.asInstanceOf[js.Any], docsTags = docsTags.asInstanceOf[js.Any], mutable = mutable.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], reflectToAttr = reflectToAttr.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonDocsProp]
  }
  
  extension [Self <: JsonDocsProp](x: Self) {
    
    inline def setAttr(value: String): Self = StObject.set(x, "attr", value.asInstanceOf[js.Any])
    
    inline def setAttrUndefined: Self = StObject.set(x, "attr", js.undefined)
    
    inline def setDefault(value: String): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDeprecation(value: String): Self = StObject.set(x, "deprecation", value.asInstanceOf[js.Any])
    
    inline def setDeprecationUndefined: Self = StObject.set(x, "deprecation", js.undefined)
    
    inline def setDocs(value: String): Self = StObject.set(x, "docs", value.asInstanceOf[js.Any])
    
    inline def setDocsTags(value: js.Array[JsonDocsTag]): Self = StObject.set(x, "docsTags", value.asInstanceOf[js.Any])
    
    inline def setDocsTagsVarargs(value: JsonDocsTag*): Self = StObject.set(x, "docsTags", js.Array(value*))
    
    inline def setMutable(value: Boolean): Self = StObject.set(x, "mutable", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    inline def setReflectToAttr(value: Boolean): Self = StObject.set(x, "reflectToAttr", value.asInstanceOf[js.Any])
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValues(value: js.Array[JsonDocsValue]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: JsonDocsValue*): Self = StObject.set(x, "values", js.Array(value*))
  }
}

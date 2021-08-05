package typings.schemaUtils

import typings.ajv.mod.ErrorObject
import typings.ajv.mod.ErrorParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined ajv.ajv.ErrorObject & {  children :std.Array<ajv.ajv.ErrorObject> | undefined} */
  trait ErrorObjectchildrenArrayE extends StObject {
    
    var children: js.UndefOr[js.Array[ErrorObject]] = js.undefined
    
    var data: js.UndefOr[js.Any] = js.undefined
    
    var dataPath: String
    
    var keyword: String
    
    // Excluded if messages set to false.
    var message: js.UndefOr[String] = js.undefined
    
    var params: ErrorParameters
    
    var parentSchema: js.UndefOr[js.Object] = js.undefined
    
    // Added to validation errors of propertyNames keyword schema
    var propertyName: js.UndefOr[String] = js.undefined
    
    // These are added with the `verbose` option.
    var schema: js.UndefOr[js.Any] = js.undefined
    
    var schemaPath: String
  }
  object ErrorObjectchildrenArrayE {
    
    inline def apply(dataPath: String, keyword: String, params: ErrorParameters, schemaPath: String): ErrorObjectchildrenArrayE = {
      val __obj = js.Dynamic.literal(dataPath = dataPath.asInstanceOf[js.Any], keyword = keyword.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], schemaPath = schemaPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrorObjectchildrenArrayE]
    }
    
    extension [Self <: ErrorObjectchildrenArrayE](x: Self) {
      
      inline def setChildren(value: js.Array[ErrorObject]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: ErrorObject*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      inline def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataPath(value: String): Self = StObject.set(x, "dataPath", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setKeyword(value: String): Self = StObject.set(x, "keyword", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setParams(value: ErrorParameters): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParentSchema(value: js.Object): Self = StObject.set(x, "parentSchema", value.asInstanceOf[js.Any])
      
      inline def setParentSchemaUndefined: Self = StObject.set(x, "parentSchema", js.undefined)
      
      inline def setPropertyName(value: String): Self = StObject.set(x, "propertyName", value.asInstanceOf[js.Any])
      
      inline def setPropertyNameUndefined: Self = StObject.set(x, "propertyName", js.undefined)
      
      inline def setSchema(value: js.Any): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
      
      inline def setSchemaPath(value: String): Self = StObject.set(x, "schemaPath", value.asInstanceOf[js.Any])
      
      inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    }
  }
}

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
    
    @scala.inline
    def apply(dataPath: String, keyword: String, params: ErrorParameters, schemaPath: String): ErrorObjectchildrenArrayE = {
      val __obj = js.Dynamic.literal(dataPath = dataPath.asInstanceOf[js.Any], keyword = keyword.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], schemaPath = schemaPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrorObjectchildrenArrayE]
    }
    
    @scala.inline
    implicit class ErrorObjectchildrenArrayEMutableBuilder[Self <: ErrorObjectchildrenArrayE] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: js.Array[ErrorObject]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setChildrenVarargs(value: ErrorObject*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataPath(value: String): Self = StObject.set(x, "dataPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setKeyword(value: String): Self = StObject.set(x, "keyword", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      @scala.inline
      def setParams(value: ErrorParameters): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentSchema(value: js.Object): Self = StObject.set(x, "parentSchema", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentSchemaUndefined: Self = StObject.set(x, "parentSchema", js.undefined)
      
      @scala.inline
      def setPropertyName(value: String): Self = StObject.set(x, "propertyName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropertyNameUndefined: Self = StObject.set(x, "propertyName", js.undefined)
      
      @scala.inline
      def setSchema(value: js.Any): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSchemaPath(value: String): Self = StObject.set(x, "schemaPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    }
  }
}

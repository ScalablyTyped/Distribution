package typings.schemaUtils

import typings.ajv.mod.ErrorObject
import typings.ajv.mod.ErrorParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object absolutePathMod {
  
  @JSImport("schema-utils/declarations/keywords/absolutePath", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    *
    * @param {Ajv} ajv
    * @returns {Ajv}
    */
  inline def default(ajv: Ajv): Ajv = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(ajv.asInstanceOf[js.Any]).asInstanceOf[Ajv]
  
  type Ajv = typings.ajv.mod.Ajv
  
  trait SchemaUtilErrorObject
    extends StObject
       with ErrorObject {
    
    var children: js.UndefOr[js.Array[ErrorObject]] = js.undefined
  }
  object SchemaUtilErrorObject {
    
    inline def apply(dataPath: String, keyword: String, params: ErrorParameters, schemaPath: String): SchemaUtilErrorObject = {
      val __obj = js.Dynamic.literal(dataPath = dataPath.asInstanceOf[js.Any], keyword = keyword.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], schemaPath = schemaPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[SchemaUtilErrorObject]
    }
    
    extension [Self <: SchemaUtilErrorObject](x: Self) {
      
      inline def setChildren(value: js.Array[ErrorObject]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: ErrorObject*): Self = StObject.set(x, "children", js.Array(value :_*))
    }
  }
  
  type ValidateFunction = typings.ajv.mod.ValidateFunction
}

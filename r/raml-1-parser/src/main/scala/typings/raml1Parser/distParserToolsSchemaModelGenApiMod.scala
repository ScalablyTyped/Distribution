package typings.raml1Parser

import typings.raml1Parser.distParserHighLevelASTMod.IHighLevelNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distParserToolsSchemaModelGenApiMod {
  
  trait ModelToSchemaGenerator extends StObject {
    
    def generateSchema(node: IHighLevelNode): Any
  }
  object ModelToSchemaGenerator {
    
    inline def apply(generateSchema: IHighLevelNode => Any): ModelToSchemaGenerator = {
      val __obj = js.Dynamic.literal(generateSchema = js.Any.fromFunction1(generateSchema))
      __obj.asInstanceOf[ModelToSchemaGenerator]
    }
    
    extension [Self <: ModelToSchemaGenerator](x: Self) {
      
      inline def setGenerateSchema(value: IHighLevelNode => Any): Self = StObject.set(x, "generateSchema", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait SchemaToModelGenerator extends StObject {
    
    def generateTo(api: IHighLevelNode, schema: String): js.Array[String] = js.native
    def generateTo(api: IHighLevelNode, schema: String, title: String): js.Array[String] = js.native
  }
}

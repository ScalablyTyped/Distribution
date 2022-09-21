package typings.raml1Parser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object schemaGeneratorMod {
  
  @JSImport("raml-1-parser/dist/util/schemaGenerator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("raml-1-parser/dist/util/schemaGenerator", "JsonSchemaGenerator")
  @js.native
  open class JsonSchemaGenerator () extends StObject {
    
    /* private */ var detectType: Any = js.native
    
    def generateSchema(obj: Any): js.Object = js.native
    
    /* private */ var pass: Any = js.native
    
    /* private */ var passArray: Any = js.native
    
    /* private */ var passObject: Any = js.native
    
    /* private */ var registerProperty: Any = js.native
  }
  
  inline def generateSchema(text: String, mediaType: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generateSchema")(text.asInstanceOf[js.Any], mediaType.asInstanceOf[js.Any])).asInstanceOf[String]
}

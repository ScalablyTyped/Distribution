package typings.ramlXmlValidation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("raml-xml-validation", "XMLSchemaReference")
  @js.native
  open class XMLSchemaReference protected () extends StObject {
    def this(originalPath: String, virtualIndex: Double, patchedContent: String) = this()
    
    var originalPath: String = js.native
    
    var patchedContent: String = js.native
    
    var virtualIndex: Double = js.native
  }
  
  @JSImport("raml-xml-validation", "XMLValidator")
  @js.native
  open class XMLValidator protected () extends StObject {
    def this(schema: String) = this()
    
    /* private */ var remoteSchemas: Any = js.native
    
    /* private */ var schema: Any = js.native
    
    /* private */ var schemaObject: Any = js.native
    
    def validate(xml: String): js.Array[js.Error] = js.native
    def validate(xml: String, references: js.Array[XMLSchemaReference]): js.Array[js.Error] = js.native
  }
}

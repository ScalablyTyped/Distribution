package typings.ramlJsonValidation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("raml-json-validation", "JSONValidator")
  @js.native
  open class JSONValidator () extends StObject {
    
    def getLastErrors(): js.Array[Any] = js.native
    
    def getMissingRemoteReferences(): js.Array[Any] = js.native
    
    def isResourceLoaded(reference: String): Boolean = js.native
    
    def setRemoteReference(reference: String, content: Any): Unit = js.native
    
    def validate(content: Any, schema: Any): Unit = js.native
    
    def validateSchema(jsonSchema: Any): Unit = js.native
    
    /* private */ var validator: Any = js.native
  }
}

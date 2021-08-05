package typings.pulumiKubernetes.outputMod.apiextensions.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ExternalDocumentation allows referencing an external resource for extended documentation.
  */
trait ExternalDocumentation extends StObject {
  
  var description: String
  
  var url: String
}
object ExternalDocumentation {
  
  inline def apply(description: String, url: String): ExternalDocumentation = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExternalDocumentation]
  }
  
  extension [Self <: ExternalDocumentation](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}

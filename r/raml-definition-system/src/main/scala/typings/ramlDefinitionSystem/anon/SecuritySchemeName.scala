package typings.ramlDefinitionSystem.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecuritySchemeName extends StObject {
  
  var annotations: NameString
  
  var securityScheme: Domain
  
  var securitySchemeName: Domain
}
object SecuritySchemeName {
  
  inline def apply(annotations: NameString, securityScheme: Domain, securitySchemeName: Domain): SecuritySchemeName = {
    val __obj = js.Dynamic.literal(annotations = annotations.asInstanceOf[js.Any], securityScheme = securityScheme.asInstanceOf[js.Any], securitySchemeName = securitySchemeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecuritySchemeName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SecuritySchemeName] (val x: Self) extends AnyVal {
    
    inline def setAnnotations(value: NameString): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
    
    inline def setSecurityScheme(value: Domain): Self = StObject.set(x, "securityScheme", value.asInstanceOf[js.Any])
    
    inline def setSecuritySchemeName(value: Domain): Self = StObject.set(x, "securitySchemeName", value.asInstanceOf[js.Any])
  }
}

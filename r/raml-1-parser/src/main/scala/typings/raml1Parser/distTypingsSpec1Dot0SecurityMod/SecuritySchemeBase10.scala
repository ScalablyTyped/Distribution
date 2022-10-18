package typings.raml1Parser.distTypingsSpec1Dot0SecurityMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecuritySchemeBase10 extends StObject {
  
  var describedBy: SecuritySchemePart10
  
  /**
    * The description attribute MAY be used to describe a security schemes property
    */
  var description: String
  
  /**
    * Name of the security scheme
    */
  var name: String
  
  /**
    * The securitySchemes property MUST be used to specify an API's security mechanisms,
    * including the required settings and the authentication methods that the API supports.
    * one authentication method is allowed if the API supports them
    */
  var `type`: String
}
object SecuritySchemeBase10 {
  
  inline def apply(describedBy: SecuritySchemePart10, description: String, name: String, `type`: String): SecuritySchemeBase10 = {
    val __obj = js.Dynamic.literal(describedBy = describedBy.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecuritySchemeBase10]
  }
  
  extension [Self <: SecuritySchemeBase10](x: Self) {
    
    inline def setDescribedBy(value: SecuritySchemePart10): Self = StObject.set(x, "describedBy", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

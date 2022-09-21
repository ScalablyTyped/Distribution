package typings.raml1Parser.spec1Dot0SecurityMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DigestSecurityScheme10
  extends StObject
     with SecuritySchemeBase10 {
  
  /**
    * The settings attribute MAY be used to provide security scheme-specific information.
    * The required attributes vary depending on the type of security scheme is being declared.
    * It describes the minimum set of properties which any processing application MUST
    * provide and validate if it chooses to implement the security scheme.
    * Processing applications MAY choose to recognize other properties for things such as
    * token lifetime, preferred cryptographic algorithms, and more.
    */
  var settings: DigestSecuritySettings10
}
object DigestSecurityScheme10 {
  
  inline def apply(
    describedBy: SecuritySchemePart10,
    description: String,
    name: String,
    settings: DigestSecuritySettings10,
    `type`: String
  ): DigestSecurityScheme10 = {
    val __obj = js.Dynamic.literal(describedBy = describedBy.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DigestSecurityScheme10]
  }
  
  extension [Self <: DigestSecurityScheme10](x: Self) {
    
    inline def setSettings(value: DigestSecuritySettings10): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
  }
}

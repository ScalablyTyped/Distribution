package typings.raml1Parser.distTypingsSpec1Dot0SecurityMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomSecurityScheme10
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
  var settings: CustomSecuritySettings10
}
object CustomSecurityScheme10 {
  
  inline def apply(
    describedBy: SecuritySchemePart10,
    description: String,
    name: String,
    settings: CustomSecuritySettings10,
    `type`: String
  ): CustomSecurityScheme10 = {
    val __obj = js.Dynamic.literal(describedBy = describedBy.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomSecurityScheme10]
  }
  
  extension [Self <: CustomSecurityScheme10](x: Self) {
    
    inline def setSettings(value: CustomSecuritySettings10): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
  }
}

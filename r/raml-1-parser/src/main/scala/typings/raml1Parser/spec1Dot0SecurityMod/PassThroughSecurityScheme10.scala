package typings.raml1Parser.spec1Dot0SecurityMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PassThroughSecurityScheme10
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
  var settings: PassThroughSecuritySettings10
}
object PassThroughSecurityScheme10 {
  
  inline def apply(
    describedBy: SecuritySchemePart10,
    description: String,
    name: String,
    settings: PassThroughSecuritySettings10,
    `type`: String
  ): PassThroughSecurityScheme10 = {
    val __obj = js.Dynamic.literal(describedBy = describedBy.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PassThroughSecurityScheme10]
  }
  
  extension [Self <: PassThroughSecurityScheme10](x: Self) {
    
    inline def setSettings(value: PassThroughSecuritySettings10): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
  }
}

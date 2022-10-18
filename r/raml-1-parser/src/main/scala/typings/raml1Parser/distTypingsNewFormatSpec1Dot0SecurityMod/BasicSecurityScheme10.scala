package typings.raml1Parser.distTypingsNewFormatSpec1Dot0SecurityMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BasicSecurityScheme10
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
  @JSName("settings")
  var settings_BasicSecurityScheme10: js.UndefOr[BasicSecuritySettings10] = js.undefined
}
object BasicSecurityScheme10 {
  
  inline def apply(name: String, `type`: String): BasicSecurityScheme10 = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BasicSecurityScheme10]
  }
  
  extension [Self <: BasicSecurityScheme10](x: Self) {
    
    inline def setSettings(value: BasicSecuritySettings10): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    
    inline def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
  }
}

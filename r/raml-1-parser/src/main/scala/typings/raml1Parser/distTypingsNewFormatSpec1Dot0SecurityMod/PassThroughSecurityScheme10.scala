package typings.raml1Parser.distTypingsNewFormatSpec1Dot0SecurityMod

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
  @JSName("settings")
  var settings_PassThroughSecurityScheme10: js.UndefOr[PassThroughSecuritySettings10] = js.undefined
}
object PassThroughSecurityScheme10 {
  
  inline def apply(name: String, `type`: String): PassThroughSecurityScheme10 = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PassThroughSecurityScheme10]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PassThroughSecurityScheme10] (val x: Self) extends AnyVal {
    
    inline def setSettings(value: PassThroughSecuritySettings10): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    
    inline def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
  }
}

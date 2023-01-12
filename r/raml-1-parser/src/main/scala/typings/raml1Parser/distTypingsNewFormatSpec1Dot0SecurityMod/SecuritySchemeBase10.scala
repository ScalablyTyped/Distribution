package typings.raml1Parser.distTypingsNewFormatSpec1Dot0SecurityMod

import typings.raml1Parser.distTypingsNewFormatSpec1Dot0CommonMod.Annotable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecuritySchemeBase10
  extends StObject
     with Annotable {
  
  var describedBy: js.UndefOr[SecuritySchemePart10] = js.undefined
  
  /**
    * The description attribute MAY be used to describe a security schemes property
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the security scheme
    */
  var name: String
  
  var settings: js.UndefOr[js.Object] = js.undefined
  
  /**
    * The securitySchemes property MUST be used to specify an API's security mechanisms,
    * including the required settings and the authentication methods that the API supports.
    * one authentication method is allowed if the API supports them
    */
  var `type`: String
}
object SecuritySchemeBase10 {
  
  inline def apply(name: String, `type`: String): SecuritySchemeBase10 = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecuritySchemeBase10]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SecuritySchemeBase10] (val x: Self) extends AnyVal {
    
    inline def setDescribedBy(value: SecuritySchemePart10): Self = StObject.set(x, "describedBy", value.asInstanceOf[js.Any])
    
    inline def setDescribedByUndefined: Self = StObject.set(x, "describedBy", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSettings(value: js.Object): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    
    inline def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

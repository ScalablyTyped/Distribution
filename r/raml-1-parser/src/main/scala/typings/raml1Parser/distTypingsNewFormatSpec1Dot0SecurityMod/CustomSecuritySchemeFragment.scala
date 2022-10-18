package typings.raml1Parser.distTypingsNewFormatSpec1Dot0SecurityMod

import typings.raml1Parser.distTypingsNewFormatSpec1Dot0CommonMod.FragmentDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.raml1Parser.distTypingsNewFormatSpec1Dot0CommonMod.HasSource because Already inherited
- typings.raml1Parser.distTypingsNewFormatSpec1Dot0CommonMod.Annotable because Already inherited
- typings.raml1Parser.distTypingsNewFormatSpec1Dot0SecurityMod.SecuritySchemeBase10 because var conflicts: __METADATA__, annotations, scalarsAnnotations, settings, sourceMap. Inlined name, description, describedBy, `type`
- typings.raml1Parser.distTypingsNewFormatSpec1Dot0SecurityMod.CustomSecurityScheme10 because var conflicts: __METADATA__, annotations, scalarsAnnotations, sourceMap. Inlined settings */ trait CustomSecuritySchemeFragment
  extends StObject
     with FragmentDeclaration
     with SecuritySchemeFragment {
  
  var describedBy: js.UndefOr[SecuritySchemePart10] = js.undefined
  
  /**
    * The description attribute MAY be used to describe a security schemes property
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the security scheme
    */
  var name: String
  
  /**
    * The settings attribute MAY be used to provide security scheme-specific information.
    * The required attributes vary depending on the type of security scheme is being declared.
    * It describes the minimum set of properties which any processing application MUST
    * provide and validate if it chooses to implement the security scheme.
    * Processing applications MAY choose to recognize other properties for things such as
    * token lifetime, preferred cryptographic algorithms, and more.
    */
  var settings: js.UndefOr[CustomSecuritySettings10] = js.undefined
  
  /**
    * The securitySchemes property MUST be used to specify an API's security mechanisms,
    * including the required settings and the authentication methods that the API supports.
    * one authentication method is allowed if the API supports them
    */
  var `type`: String
}
object CustomSecuritySchemeFragment {
  
  inline def apply(name: String, `type`: String): CustomSecuritySchemeFragment = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomSecuritySchemeFragment]
  }
  
  extension [Self <: CustomSecuritySchemeFragment](x: Self) {
    
    inline def setDescribedBy(value: SecuritySchemePart10): Self = StObject.set(x, "describedBy", value.asInstanceOf[js.Any])
    
    inline def setDescribedByUndefined: Self = StObject.set(x, "describedBy", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSettings(value: CustomSecuritySettings10): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    
    inline def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

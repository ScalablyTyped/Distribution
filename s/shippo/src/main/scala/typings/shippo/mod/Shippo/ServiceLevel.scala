package typings.shippo.mod.Shippo

import typings.shippo.anon.Extendedtoken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceLevel extends StObject {
  
  var extended_token: String
  
  var name: String
  
  var parent_servicelevel: js.UndefOr[Extendedtoken | Null] = js.undefined
  
  var terms: String
  
  var token: ServiceLevels
}
object ServiceLevel {
  
  inline def apply(extended_token: String, name: String, terms: String, token: ServiceLevels): ServiceLevel = {
    val __obj = js.Dynamic.literal(extended_token = extended_token.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], terms = terms.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceLevel]
  }
  
  extension [Self <: ServiceLevel](x: Self) {
    
    inline def setExtended_token(value: String): Self = StObject.set(x, "extended_token", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setParent_servicelevel(value: Extendedtoken): Self = StObject.set(x, "parent_servicelevel", value.asInstanceOf[js.Any])
    
    inline def setParent_servicelevelNull: Self = StObject.set(x, "parent_servicelevel", null)
    
    inline def setParent_servicelevelUndefined: Self = StObject.set(x, "parent_servicelevel", js.undefined)
    
    inline def setTerms(value: String): Self = StObject.set(x, "terms", value.asInstanceOf[js.Any])
    
    inline def setToken(value: ServiceLevels): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
  }
}

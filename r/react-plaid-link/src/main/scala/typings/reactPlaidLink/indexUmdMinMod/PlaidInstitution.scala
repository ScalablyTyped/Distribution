package typings.reactPlaidLink.indexUmdMinMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlaidInstitution extends StObject {
  
  var institution_id: String
  
  var name: String
}
object PlaidInstitution {
  
  inline def apply(institution_id: String, name: String): PlaidInstitution = {
    val __obj = js.Dynamic.literal(institution_id = institution_id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaidInstitution]
  }
  
  extension [Self <: PlaidInstitution](x: Self) {
    
    inline def setInstitution_id(value: String): Self = StObject.set(x, "institution_id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}

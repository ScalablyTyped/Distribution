package typings.reactPlaidLink.mod

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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlaidInstitution] (val x: Self) extends AnyVal {
    
    inline def setInstitution_id(value: String): Self = StObject.set(x, "institution_id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}

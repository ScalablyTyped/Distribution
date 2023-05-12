package typings.shopifyBuy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Company extends StObject {
  
  var createdAt: DateTime
  
  var externalId: js.UndefOr[String] = js.undefined
  
  var name: String
  
  var updatedAt: DateTime
}
object Company {
  
  inline def apply(createdAt: DateTime, name: String, updatedAt: DateTime): Company = {
    val __obj = js.Dynamic.literal(createdAt = createdAt.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], updatedAt = updatedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[Company]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Company] (val x: Self) extends AnyVal {
    
    inline def setCreatedAt(value: DateTime): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setExternalId(value: String): Self = StObject.set(x, "externalId", value.asInstanceOf[js.Any])
    
    inline def setExternalIdUndefined: Self = StObject.set(x, "externalId", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setUpdatedAt(value: DateTime): Self = StObject.set(x, "updatedAt", value.asInstanceOf[js.Any])
  }
}

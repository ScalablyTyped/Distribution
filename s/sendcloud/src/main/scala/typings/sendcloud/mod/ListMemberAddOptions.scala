package typings.sendcloud.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListMemberAddOptions extends StObject {
  
  var description: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var upsert: js.UndefOr[String] = js.undefined
  
  var vars: js.UndefOr[String] = js.undefined
}
object ListMemberAddOptions {
  
  inline def apply(): ListMemberAddOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListMemberAddOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListMemberAddOptions] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setUpsert(value: String): Self = StObject.set(x, "upsert", value.asInstanceOf[js.Any])
    
    inline def setUpsertUndefined: Self = StObject.set(x, "upsert", js.undefined)
    
    inline def setVars(value: String): Self = StObject.set(x, "vars", value.asInstanceOf[js.Any])
    
    inline def setVarsUndefined: Self = StObject.set(x, "vars", js.undefined)
  }
}

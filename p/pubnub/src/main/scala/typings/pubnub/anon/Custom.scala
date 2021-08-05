package typings.pubnub.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Custom extends StObject {
  
  var custom: js.UndefOr[js.Object | Null] = js.undefined
  
  var id: String
}
object Custom {
  
  inline def apply(id: String): Custom = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Custom]
  }
  
  extension [Self <: Custom](x: Self) {
    
    inline def setCustom(value: js.Object): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
    
    inline def setCustomNull: Self = StObject.set(x, "custom", null)
    
    inline def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}

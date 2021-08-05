package typings.simperium.mod

import typings.simperium.simperiumStrings.`-_`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemovalChange
  extends StObject
     with Change[js.Any] {
  
  var ccid: String
  
  var id: String
  
  var o: `-_`
}
object RemovalChange {
  
  inline def apply(ccid: String, id: String): RemovalChange = {
    val __obj = js.Dynamic.literal(ccid = ccid.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], o = "-")
    __obj.asInstanceOf[RemovalChange]
  }
  
  extension [Self <: RemovalChange](x: Self) {
    
    inline def setCcid(value: String): Self = StObject.set(x, "ccid", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setO(value: `-_`): Self = StObject.set(x, "o", value.asInstanceOf[js.Any])
  }
}

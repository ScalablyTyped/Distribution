package typings.skywayJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectionOption extends StObject {
  
  var connectionId: js.UndefOr[String] = js.undefined
  
  var metadata: js.UndefOr[Any] = js.undefined
}
object ConnectionOption {
  
  inline def apply(): ConnectionOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectionOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConnectionOption] (val x: Self) extends AnyVal {
    
    inline def setConnectionId(value: String): Self = StObject.set(x, "connectionId", value.asInstanceOf[js.Any])
    
    inline def setConnectionIdUndefined: Self = StObject.set(x, "connectionId", js.undefined)
    
    inline def setMetadata(value: Any): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
  }
}

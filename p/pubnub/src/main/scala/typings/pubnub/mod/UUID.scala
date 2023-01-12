package typings.pubnub.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UUID
  extends StObject
     with ID {
  
  var uuid: String
}
object UUID {
  
  inline def apply(uuid: String): UUID = {
    val __obj = js.Dynamic.literal(uuid = uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[UUID]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UUID] (val x: Self) extends AnyVal {
    
    inline def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
  }
}

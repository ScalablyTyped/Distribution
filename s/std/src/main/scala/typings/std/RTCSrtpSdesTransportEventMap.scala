package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCSrtpSdesTransportEventMap extends StObject {
  
  var error: Event = js.native
}
object RTCSrtpSdesTransportEventMap {
  
  @scala.inline
  def apply(error: Event): RTCSrtpSdesTransportEventMap = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCSrtpSdesTransportEventMap]
  }
  
  @scala.inline
  implicit class RTCSrtpSdesTransportEventMapMutableBuilder[Self <: RTCSrtpSdesTransportEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: Event): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
  }
}

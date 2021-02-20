package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCSctpTransportEventMap extends StObject {
  
  var statechange: Event = js.native
}
object RTCSctpTransportEventMap {
  
  @scala.inline
  def apply(statechange: Event): RTCSctpTransportEventMap = {
    val __obj = js.Dynamic.literal(statechange = statechange.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCSctpTransportEventMap]
  }
  
  @scala.inline
  implicit class RTCSctpTransportEventMapMutableBuilder[Self <: RTCSctpTransportEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatechange(value: Event): Self = StObject.set(x, "statechange", value.asInstanceOf[js.Any])
  }
}

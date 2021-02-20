package typings.reactRelay.anon

import typings.reactRelay.mod.RelayRefetchProp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RelayRelayRefetchProp extends StObject {
  
  var relay: RelayRefetchProp = js.native
}
object RelayRelayRefetchProp {
  
  @scala.inline
  def apply(relay: RelayRefetchProp): RelayRelayRefetchProp = {
    val __obj = js.Dynamic.literal(relay = relay.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelayRelayRefetchProp]
  }
  
  @scala.inline
  implicit class RelayRelayRefetchPropMutableBuilder[Self <: RelayRelayRefetchProp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRelay(value: RelayRefetchProp): Self = StObject.set(x, "relay", value.asInstanceOf[js.Any])
  }
}

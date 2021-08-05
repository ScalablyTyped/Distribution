package typings.reactRelay.anon

import typings.reactRelay.mod.RelayProp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Relay extends StObject {
  
  var relay: js.UndefOr[RelayProp] = js.undefined
}
object Relay {
  
  inline def apply(): Relay = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Relay]
  }
  
  extension [Self <: Relay](x: Self) {
    
    inline def setRelay(value: RelayProp): Self = StObject.set(x, "relay", value.asInstanceOf[js.Any])
    
    inline def setRelayUndefined: Self = StObject.set(x, "relay", js.undefined)
  }
}

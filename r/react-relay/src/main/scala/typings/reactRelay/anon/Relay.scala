package typings.reactRelay.anon

import typings.reactRelay.mod.RelayProp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Relay extends StObject {
  
  var relay: js.UndefOr[RelayProp] = js.undefined
}
object Relay {
  
  @scala.inline
  def apply(): Relay = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Relay]
  }
  
  @scala.inline
  implicit class RelayMutableBuilder[Self <: Relay] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRelay(value: RelayProp): Self = StObject.set(x, "relay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelayUndefined: Self = StObject.set(x, "relay", js.undefined)
  }
}

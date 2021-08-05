package typings.pulumiAws.outputMod.appmesh

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualNodeSpecListenerTimeoutTcp extends StObject {
  
  /**
    * The idle timeout. An idle timeout bounds the amount of time that a connection may be idle.
    */
  var idle: js.UndefOr[VirtualNodeSpecListenerTimeoutTcpIdle] = js.undefined
}
object VirtualNodeSpecListenerTimeoutTcp {
  
  inline def apply(): VirtualNodeSpecListenerTimeoutTcp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VirtualNodeSpecListenerTimeoutTcp]
  }
  
  extension [Self <: VirtualNodeSpecListenerTimeoutTcp](x: Self) {
    
    inline def setIdle(value: VirtualNodeSpecListenerTimeoutTcpIdle): Self = StObject.set(x, "idle", value.asInstanceOf[js.Any])
    
    inline def setIdleUndefined: Self = StObject.set(x, "idle", js.undefined)
  }
}

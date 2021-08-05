package typings.pulumiAws.inputMod.appmesh

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualNodeSpecListenerTimeoutHttp extends StObject {
  
  /**
    * The idle timeout. An idle timeout bounds the amount of time that a connection may be idle.
    */
  var idle: js.UndefOr[Input[VirtualNodeSpecListenerTimeoutHttpIdle]] = js.undefined
  
  /**
    * The per request timeout.
    */
  var perRequest: js.UndefOr[Input[VirtualNodeSpecListenerTimeoutHttpPerRequest]] = js.undefined
}
object VirtualNodeSpecListenerTimeoutHttp {
  
  inline def apply(): VirtualNodeSpecListenerTimeoutHttp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VirtualNodeSpecListenerTimeoutHttp]
  }
  
  extension [Self <: VirtualNodeSpecListenerTimeoutHttp](x: Self) {
    
    inline def setIdle(value: Input[VirtualNodeSpecListenerTimeoutHttpIdle]): Self = StObject.set(x, "idle", value.asInstanceOf[js.Any])
    
    inline def setIdleUndefined: Self = StObject.set(x, "idle", js.undefined)
    
    inline def setPerRequest(value: Input[VirtualNodeSpecListenerTimeoutHttpPerRequest]): Self = StObject.set(x, "perRequest", value.asInstanceOf[js.Any])
    
    inline def setPerRequestUndefined: Self = StObject.set(x, "perRequest", js.undefined)
  }
}

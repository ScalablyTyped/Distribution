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
  
  @scala.inline
  def apply(): VirtualNodeSpecListenerTimeoutHttp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VirtualNodeSpecListenerTimeoutHttp]
  }
  
  @scala.inline
  implicit class VirtualNodeSpecListenerTimeoutHttpMutableBuilder[Self <: VirtualNodeSpecListenerTimeoutHttp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIdle(value: Input[VirtualNodeSpecListenerTimeoutHttpIdle]): Self = StObject.set(x, "idle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdleUndefined: Self = StObject.set(x, "idle", js.undefined)
    
    @scala.inline
    def setPerRequest(value: Input[VirtualNodeSpecListenerTimeoutHttpPerRequest]): Self = StObject.set(x, "perRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerRequestUndefined: Self = StObject.set(x, "perRequest", js.undefined)
  }
}

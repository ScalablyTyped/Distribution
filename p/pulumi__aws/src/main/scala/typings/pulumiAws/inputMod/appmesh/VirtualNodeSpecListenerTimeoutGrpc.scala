package typings.pulumiAws.inputMod.appmesh

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualNodeSpecListenerTimeoutGrpc extends StObject {
  
  /**
    * The idle timeout. An idle timeout bounds the amount of time that a connection may be idle.
    */
  var idle: js.UndefOr[Input[VirtualNodeSpecListenerTimeoutGrpcIdle]] = js.undefined
  
  /**
    * The per request timeout.
    */
  var perRequest: js.UndefOr[Input[VirtualNodeSpecListenerTimeoutGrpcPerRequest]] = js.undefined
}
object VirtualNodeSpecListenerTimeoutGrpc {
  
  @scala.inline
  def apply(): VirtualNodeSpecListenerTimeoutGrpc = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VirtualNodeSpecListenerTimeoutGrpc]
  }
  
  @scala.inline
  implicit class VirtualNodeSpecListenerTimeoutGrpcMutableBuilder[Self <: VirtualNodeSpecListenerTimeoutGrpc] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIdle(value: Input[VirtualNodeSpecListenerTimeoutGrpcIdle]): Self = StObject.set(x, "idle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdleUndefined: Self = StObject.set(x, "idle", js.undefined)
    
    @scala.inline
    def setPerRequest(value: Input[VirtualNodeSpecListenerTimeoutGrpcPerRequest]): Self = StObject.set(x, "perRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerRequestUndefined: Self = StObject.set(x, "perRequest", js.undefined)
  }
}

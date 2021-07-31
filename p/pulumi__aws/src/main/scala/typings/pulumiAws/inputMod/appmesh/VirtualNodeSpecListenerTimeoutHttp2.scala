package typings.pulumiAws.inputMod.appmesh

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualNodeSpecListenerTimeoutHttp2 extends StObject {
  
  /**
    * The idle timeout. An idle timeout bounds the amount of time that a connection may be idle.
    */
  var idle: js.UndefOr[Input[VirtualNodeSpecListenerTimeoutHttp2Idle]] = js.undefined
  
  /**
    * The per request timeout.
    */
  var perRequest: js.UndefOr[Input[VirtualNodeSpecListenerTimeoutHttp2PerRequest]] = js.undefined
}
object VirtualNodeSpecListenerTimeoutHttp2 {
  
  @scala.inline
  def apply(): VirtualNodeSpecListenerTimeoutHttp2 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VirtualNodeSpecListenerTimeoutHttp2]
  }
  
  @scala.inline
  implicit class VirtualNodeSpecListenerTimeoutHttp2MutableBuilder[Self <: VirtualNodeSpecListenerTimeoutHttp2] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIdle(value: Input[VirtualNodeSpecListenerTimeoutHttp2Idle]): Self = StObject.set(x, "idle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdleUndefined: Self = StObject.set(x, "idle", js.undefined)
    
    @scala.inline
    def setPerRequest(value: Input[VirtualNodeSpecListenerTimeoutHttp2PerRequest]): Self = StObject.set(x, "perRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerRequestUndefined: Self = StObject.set(x, "perRequest", js.undefined)
  }
}

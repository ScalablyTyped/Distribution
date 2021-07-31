package typings.pulumiAws.inputMod.appmesh

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualNodeSpecListenerTimeoutTcp extends StObject {
  
  /**
    * The idle timeout. An idle timeout bounds the amount of time that a connection may be idle.
    */
  var idle: js.UndefOr[Input[VirtualNodeSpecListenerTimeoutTcpIdle]] = js.undefined
}
object VirtualNodeSpecListenerTimeoutTcp {
  
  @scala.inline
  def apply(): VirtualNodeSpecListenerTimeoutTcp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VirtualNodeSpecListenerTimeoutTcp]
  }
  
  @scala.inline
  implicit class VirtualNodeSpecListenerTimeoutTcpMutableBuilder[Self <: VirtualNodeSpecListenerTimeoutTcp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIdle(value: Input[VirtualNodeSpecListenerTimeoutTcpIdle]): Self = StObject.set(x, "idle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdleUndefined: Self = StObject.set(x, "idle", js.undefined)
  }
}

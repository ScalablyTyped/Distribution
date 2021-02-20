package typings.pulumiAws.outputMod.appmesh

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VirtualNodeSpecListenerTimeoutTcp extends StObject {
  
  /**
    * The idle timeout. An idle timeout bounds the amount of time that a connection may be idle.
    */
  var idle: js.UndefOr[VirtualNodeSpecListenerTimeoutTcpIdle] = js.native
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
    def setIdle(value: VirtualNodeSpecListenerTimeoutTcpIdle): Self = StObject.set(x, "idle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdleUndefined: Self = StObject.set(x, "idle", js.undefined)
  }
}

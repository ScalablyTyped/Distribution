package typings.pusherJs

import typings.pusherJs.typesSrcRuntimesWebDomScriptReceiverMod.ScriptReceiver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcRuntimesWebDomScriptReceiverFactoryMod {
  
  @JSImport("pusher-js/types/src/runtimes/web/dom/script_receiver_factory", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("pusher-js/types/src/runtimes/web/dom/script_receiver_factory", "ScriptReceiverFactory")
  @js.native
  open class ScriptReceiverFactory protected () extends StObject {
    def this(prefix: String, name: String) = this()
    
    def create(callback: js.Function): ScriptReceiver = js.native
    
    var lastId: Double = js.native
    
    var name: String = js.native
    
    var prefix: String = js.native
    
    def remove(receiver: ScriptReceiver): Unit = js.native
  }
  
  @JSImport("pusher-js/types/src/runtimes/web/dom/script_receiver_factory", "ScriptReceivers")
  @js.native
  def ScriptReceivers: ScriptReceiverFactory = js.native
  inline def ScriptReceivers_=(x: ScriptReceiverFactory): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ScriptReceivers")(x.asInstanceOf[js.Any])
}

package typings.socksProxyAgent

import typings.agentBase.mod.Agent
import typings.socksProxyAgent.mod.SocksProxyAgentOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("socks-proxy-agent/dist/agent", JSImport.Namespace)
@js.native
object agentMod extends js.Object {
  
  @js.native
  trait SocksProxyAgent extends Agent {
    
    var lookup: js.Any = js.native
    
    var proxy: js.Any = js.native
  }
  
  @js.native
  class default protected () extends SocksProxyAgent {
    def this(_opts: String) = this()
    def this(_opts: SocksProxyAgentOptions) = this()
  }
}

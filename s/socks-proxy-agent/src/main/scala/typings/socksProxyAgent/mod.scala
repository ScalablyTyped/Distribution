package typings.socksProxyAgent

import typings.agentBase.mod.Agent
import typings.node.httpMod.AgentOptions
import typings.socks.typingsCommonConstantsMod.SocksProxy
import typings.socksProxyAgent.socksProxyAgentStrings.`type`
import typings.socksProxyAgent.socksProxyAgentStrings.host
import typings.socksProxyAgent.socksProxyAgentStrings.ipaddress
import typings.socksProxyAgent.socksProxyAgentStrings.password
import typings.socksProxyAgent.socksProxyAgentStrings.port
import typings.socksProxyAgent.socksProxyAgentStrings.socks
import typings.socksProxyAgent.socksProxyAgentStrings.socks4
import typings.socksProxyAgent.socksProxyAgentStrings.socks4a
import typings.socksProxyAgent.socksProxyAgentStrings.socks5
import typings.socksProxyAgent.socksProxyAgentStrings.socks5h
import typings.socksProxyAgent.socksProxyAgentStrings.userId
import typings.std.Omit
import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("socks-proxy-agent", "SocksProxyAgent")
  @js.native
  open class SocksProxyAgent protected () extends Agent {
    def this(uri: String) = this()
    def this(uri: URL) = this()
    def this(uri: String, opts: SocksProxyAgentOptions) = this()
    def this(uri: URL, opts: SocksProxyAgentOptions) = this()
    
    val proxy: SocksProxy = js.native
    
    val shouldLookup: Boolean = js.native
    
    var timeout: Double | Null = js.native
  }
  /* static members */
  object SocksProxyAgent {
    
    @JSImport("socks-proxy-agent", "SocksProxyAgent")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("socks-proxy-agent", "SocksProxyAgent.protocols")
    @js.native
    def protocols: js.Tuple5[socks, socks4, socks4a, socks5, socks5h] = js.native
    inline def protocols_=(x: js.Tuple5[socks, socks4, socks4a, socks5, socks5h]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("protocols")(x.asInstanceOf[js.Any])
  }
  
  type SocksProxyAgentOptions = (Omit[SocksProxy, ipaddress | host | port | `type` | userId | password]) & AgentOptions
}

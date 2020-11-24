package typings.socksProxyAgent.mod

import typings.agentBase.mod.AgentOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof std.Omit<node.url.Url & socks.socks/typings/common/constants.SocksProxy, 'host' | 'port'> ]:? std.Omit<node.url.Url & socks.socks/typings/common/constants.SocksProxy, 'host' | 'port'>[P]} */ @js.native
trait SocksProxyAgentOptions
  extends AgentOptions
     with BaseSocksProxyAgentOptions
object SocksProxyAgentOptions {
  
  @scala.inline
  def apply(): SocksProxyAgentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SocksProxyAgentOptions]
  }
}

package typings.proxyDashAgent.proxyDashAgentMod

import org.scalablytyped.runtime.Instantiable1
import typings.agentDashBase.agentDashBaseMod.AgentOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProxyAgentConstructor
  extends Instantiable1[
      (/* options */ AgentOptions) | (/* options */ String), 
      typings.proxyDashAgent.proxyDashAgentMod.ProxyAgent.ProxyAgent
    ] {
  def apply(options: String): typings.proxyDashAgent.proxyDashAgentMod.ProxyAgent.ProxyAgent = js.native
  def apply(options: AgentOptions): typings.proxyDashAgent.proxyDashAgentMod.ProxyAgent.ProxyAgent = js.native
}


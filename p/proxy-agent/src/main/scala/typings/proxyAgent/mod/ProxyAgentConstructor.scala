package typings.proxyAgent.mod

import org.scalablytyped.runtime.Instantiable1
import typings.agentBase.mod.AgentOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProxyAgentConstructor
  extends Instantiable1[
      (/* options */ AgentOptions) | (/* options */ String), 
      typings.proxyAgent.mod.ProxyAgent.ProxyAgent
    ] {
  
  def apply(options: String): typings.proxyAgent.mod.ProxyAgent.ProxyAgent = js.native
  def apply(options: AgentOptions): typings.proxyAgent.mod.ProxyAgent.ProxyAgent = js.native
}

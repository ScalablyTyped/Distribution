package typings.proxyAgent

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Shortcut
import typings.agentBase.mod.Agent
import typings.agentBase.mod.AgentOptions
import typings.proxyAgent.mod.ProxyAgent.ProxyAgent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("proxy-agent", JSImport.Namespace)
  @js.native
  class ^ protected () extends Agent {
    def this(options: String) = this()
    def this(options: AgentOptions) = this()
  }
  @JSImport("proxy-agent", JSImport.Namespace)
  @js.native
  val ^ : ProxyAgentConstructor = js.native
  
  object ProxyAgent {
    
    type ProxyAgent = Agent
  }
  
  @js.native
  trait ProxyAgentConstructor
    extends StObject
       with Instantiable1[(/* options */ AgentOptions) | (/* options */ String), ProxyAgent] {
    
    def apply(options: String): ProxyAgent = js.native
    def apply(options: AgentOptions): ProxyAgent = js.native
  }
  
  type _To = ProxyAgentConstructor
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: ProxyAgentConstructor = ^
}

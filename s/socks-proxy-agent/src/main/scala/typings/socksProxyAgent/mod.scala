package typings.socksProxyAgent

import org.scalablytyped.runtime.Instantiable1
import typings.agentBase.mod.AgentOptions
import typings.socksProxyAgent.agentMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("socks-proxy-agent", JSImport.Namespace)
  @js.native
  def apply(opts: String): default = js.native
  @JSImport("socks-proxy-agent", JSImport.Namespace)
  @js.native
  def apply(opts: SocksProxyAgentOptions): default = js.native
  
  @JSImport("socks-proxy-agent", "SocksProxyAgent")
  @js.native
  val SocksProxyAgent: Instantiable1[/* _opts */ String | SocksProxyAgentOptions, default] = js.native
  type SocksProxyAgent = default
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("socks-proxy-agent", "SocksProxyAgent")
  @js.native
  class SocksProxyAgentCls protected () extends default {
    def this(_opts: String) = this()
    def this(_opts: SocksProxyAgentOptions) = this()
  }
  
  @js.native
  trait BaseSocksProxyAgentOptions extends StObject {
    
    var host: js.UndefOr[String | Null] = js.native
    
    var port: js.UndefOr[String | Double | Null] = js.native
  }
  object BaseSocksProxyAgentOptions {
    
    @scala.inline
    def apply(): BaseSocksProxyAgentOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseSocksProxyAgentOptions]
    }
    
    @scala.inline
    implicit class BaseSocksProxyAgentOptionsMutableBuilder[Self <: BaseSocksProxyAgentOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostNull: Self = StObject.set(x, "host", null)
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      @scala.inline
      def setPort(value: String | Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortNull: Self = StObject.set(x, "port", null)
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    }
  }
  
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
}

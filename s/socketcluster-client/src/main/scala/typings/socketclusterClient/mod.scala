package typings.socketclusterClient

import typings.socketclusterClient.clientsocketMod.ClientOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("socketcluster-client", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("socketcluster-client", "AGClientSocket")
  @js.native
  class AGClientSocket protected ()
    extends typings.socketclusterClient.clientsocketMod.^ {
    def this(opts: ClientOptions) = this()
  }
  
  @scala.inline
  def create(): AGClientSocket = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[AGClientSocket]
  @scala.inline
  def create(options: ClientOptions): AGClientSocket = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any]).asInstanceOf[AGClientSocket]
  
  object factory {
    
    @JSImport("socketcluster-client", "factory")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def create(): typings.socketclusterClient.clientsocketMod.^ = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.socketclusterClient.clientsocketMod.^]
    @scala.inline
    def create(options: ClientOptions): typings.socketclusterClient.clientsocketMod.^ = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any]).asInstanceOf[typings.socketclusterClient.clientsocketMod.^]
  }
  
  @JSImport("socketcluster-client", "version")
  @js.native
  val version: String = js.native
}

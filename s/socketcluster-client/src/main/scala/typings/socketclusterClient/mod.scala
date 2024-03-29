package typings.socketclusterClient

import typings.socketclusterClient.libClientsocketMod.ClientOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("socketcluster-client", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("socketcluster-client", "AGClientSocket")
  @js.native
  open class AGClientSocket protected ()
    extends typings.socketclusterClient.libClientsocketMod.^ {
    def this(opts: ClientOptions) = this()
  }
  
  inline def create(): AGClientSocket = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[AGClientSocket]
  inline def create(options: ClientOptions): AGClientSocket = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any]).asInstanceOf[AGClientSocket]
  
  object factory {
    
    @JSImport("socketcluster-client", "factory")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(): typings.socketclusterClient.libClientsocketMod.^ = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.socketclusterClient.libClientsocketMod.^]
    inline def create(options: ClientOptions): typings.socketclusterClient.libClientsocketMod.^ = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any]).asInstanceOf[typings.socketclusterClient.libClientsocketMod.^]
  }
  
  @JSImport("socketcluster-client", "version")
  @js.native
  val version: String = js.native
}

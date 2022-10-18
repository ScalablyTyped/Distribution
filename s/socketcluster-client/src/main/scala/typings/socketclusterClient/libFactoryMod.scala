package typings.socketclusterClient

import typings.socketclusterClient.libClientsocketMod.ClientOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFactoryMod {
  
  @JSImport("socketcluster-client/lib/factory", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(): typings.socketclusterClient.libClientsocketMod.^ = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.socketclusterClient.libClientsocketMod.^]
  inline def create(options: ClientOptions): typings.socketclusterClient.libClientsocketMod.^ = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any]).asInstanceOf[typings.socketclusterClient.libClientsocketMod.^]
}

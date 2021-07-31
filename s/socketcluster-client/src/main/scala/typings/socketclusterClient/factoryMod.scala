package typings.socketclusterClient

import typings.socketclusterClient.clientsocketMod.ClientOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object factoryMod {
  
  @JSImport("socketcluster-client/lib/factory", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def create(): typings.socketclusterClient.clientsocketMod.^ = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.socketclusterClient.clientsocketMod.^]
  @scala.inline
  def create(options: ClientOptions): typings.socketclusterClient.clientsocketMod.^ = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any]).asInstanceOf[typings.socketclusterClient.clientsocketMod.^]
}

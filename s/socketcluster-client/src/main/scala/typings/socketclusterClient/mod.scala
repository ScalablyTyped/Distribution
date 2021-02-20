package typings.socketclusterClient

import typings.socketclusterClient.clientsocketMod.ClientOptions
import typings.socketclusterClient.clientsocketMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("socketcluster-client", "AGClientSocket")
  @js.native
  class AGClientSocket protected () extends ^ {
    def this(opts: ClientOptions) = this()
  }
  
  @JSImport("socketcluster-client", "create")
  @js.native
  def create(): AGClientSocket = js.native
  @JSImport("socketcluster-client", "create")
  @js.native
  def create(options: ClientOptions): AGClientSocket = js.native
  
  object factory {
    
    @JSImport("socketcluster-client", "factory.create")
    @js.native
    def create(): ^ = js.native
    @JSImport("socketcluster-client", "factory.create")
    @js.native
    def create(options: ClientOptions): ^ = js.native
  }
  
  @JSImport("socketcluster-client", "version")
  @js.native
  val version: String = js.native
}

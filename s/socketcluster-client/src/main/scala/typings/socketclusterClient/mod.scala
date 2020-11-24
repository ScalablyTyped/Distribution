package typings.socketclusterClient

import typings.socketclusterClient.clientsocketMod.ClientOptions
import typings.socketclusterClient.clientsocketMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("socketcluster-client", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def create(): AGClientSocket = js.native
  def create(options: ClientOptions): AGClientSocket = js.native
  
  val version: String = js.native
  
  @js.native
  class AGClientSocket protected () extends ^ {
    def this(opts: ClientOptions) = this()
  }
  
  @js.native
  object factory extends js.Object {
    
    def create(): ^ = js.native
    def create(options: ClientOptions): ^ = js.native
  }
}

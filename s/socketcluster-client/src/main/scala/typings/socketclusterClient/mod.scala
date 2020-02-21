package typings.socketclusterClient

import typings.socketclusterClient.clientsocketMod.ClientOptions
import typings.socketclusterClient.clientsocketMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("socketcluster-client", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class AGClientSocket protected () extends ^ {
    def this(opts: ClientOptions) = this()
  }
  
  val version: String = js.native
  def create(): AGClientSocket = js.native
  def create(options: ClientOptions): AGClientSocket = js.native
  @js.native
  object factory extends js.Object {
    def create(): ^ = js.native
    def create(options: ClientOptions): ^ = js.native
  }
  
}


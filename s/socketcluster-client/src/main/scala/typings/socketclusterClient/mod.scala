package typings.socketclusterClient

import org.scalablytyped.runtime.StringDictionary
import typings.socketclusterClient.scclientsocketMod.ClientOptions
import typings.socketclusterClient.scclientsocketMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("socketcluster-client", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class SCClientSocket protected () extends ^ {
    def this(opts: ClientOptions) = this()
  }
  
  val version: String = js.native
  def connect(): SCClientSocket = js.native
  def connect(options: ClientOptions): SCClientSocket = js.native
  def create(): SCClientSocket = js.native
  def create(options: ClientOptions): SCClientSocket = js.native
  def destroy(socket: SCClientSocket): Unit = js.native
  @js.native
  object clients extends /* id */ StringDictionary[SCClientSocket]
  
}


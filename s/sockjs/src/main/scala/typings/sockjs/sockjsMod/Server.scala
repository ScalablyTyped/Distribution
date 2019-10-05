package typings.sockjs.sockjsMod

import typings.node.NodeJS.EventEmitter
import typings.sockjs.sockjsStrings.connection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Server extends EventEmitter {
  def installHandlers(server: typings.node.httpMod.Server): js.Any = js.native
  def installHandlers(server: typings.node.httpMod.Server, options: ServerOptions): js.Any = js.native
  def on(event: String, listener: js.Function): this.type = js.native
  @JSName("on")
  def on_connection(event: connection, listener: js.Function1[/* conn */ Connection, _]): this.type = js.native
}


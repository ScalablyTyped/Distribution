package typings
package sockjsLib.sockjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Server
  extends nodeLib.NodeJSNs.EventEmitter {
  def installHandlers(server: nodeLib.httpMod.Server): js.Any = js.native
  def installHandlers(server: nodeLib.httpMod.Server, options: ServerOptions): js.Any = js.native
  def on(event: java.lang.String, listener: js.Function): this.type = js.native
  @JSName("on")
  def on_connection(event: sockjsLib.sockjsLibStrings.connection, listener: js.Function1[/* conn */ Connection, _]): this.type = js.native
}


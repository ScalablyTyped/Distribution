package typings
package sockjsDashClientLib.sockjsDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sockjs-client", JSImport.Namespace)
@js.native
class ^ protected ()
  extends stdLib.WebSocket {
  def this(url: java.lang.String) = this()
  def this(url: java.lang.String, _reserved: js.Any) = this()
  def this(url: java.lang.String, _reserved: js.Any, options: Options) = this()
}

@JSImport("sockjs-client", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var CLOSED: sockjsDashClientLib.sockjsDashClientMod.CLOSED = js.native
  var CLOSING: sockjsDashClientLib.sockjsDashClientMod.CLOSING = js.native
  var CONNECTING: sockjsDashClientLib.sockjsDashClientMod.CONNECTING = js.native
  var OPEN: sockjsDashClientLib.sockjsDashClientMod.OPEN = js.native
  def apply(url: java.lang.String): stdLib.WebSocket = js.native
  def apply(url: java.lang.String, _reserved: js.Any): stdLib.WebSocket = js.native
  def apply(url: java.lang.String, _reserved: js.Any, options: Options): stdLib.WebSocket = js.native
}


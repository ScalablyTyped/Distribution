package typings.sockjsDashClient.sockjsDashClientMod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.TopLevel
import typings.std.WebSocket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sockjs-client", JSImport.Namespace)
@js.native
class ^ protected () extends WebSocket {
  def this(url: String) = this()
  def this(url: String, _reserved: js.Any) = this()
  def this(url: String, _reserved: js.Any, options: Options) = this()
}

@JSImport("sockjs-client", JSImport.Namespace)
@js.native
object ^
  extends TopLevel[
      (Instantiable1[/* url */ String, WebSocket]) with (Instantiable2[/* url */ String, /* _reserved */ js.Any, WebSocket]) with (Instantiable3[/* url */ String, /* _reserved */ js.Any, /* options */ Options, WebSocket])
    ] {
  var CLOSED: typings.sockjsDashClient.sockjsDashClientMod.CLOSED = js.native
  var CLOSING: typings.sockjsDashClient.sockjsDashClientMod.CLOSING = js.native
  var CONNECTING: typings.sockjsDashClient.sockjsDashClientMod.CONNECTING = js.native
  var OPEN: typings.sockjsDashClient.sockjsDashClientMod.OPEN = js.native
  def apply(url: String): WebSocket = js.native
  def apply(url: String, _reserved: js.Any): WebSocket = js.native
  def apply(url: String, _reserved: js.Any, options: Options): WebSocket = js.native
}


package typings
package sailsDotIoDotJsLib.sailsDotIoDotJsMod.SailsIOJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Socket extends js.Object {
  def delete(url: java.lang.String): scala.Unit = js.native
  def delete(url: java.lang.String, cb: RequestCallback): scala.Unit = js.native
  def delete(url: java.lang.String, data: Data): scala.Unit = js.native
  def delete(url: java.lang.String, data: Data, cb: RequestCallback): scala.Unit = js.native
  def get(url: java.lang.String): scala.Unit = js.native
  def get(url: java.lang.String, cb: RequestCallback): scala.Unit = js.native
  def get(url: java.lang.String, data: Data): scala.Unit = js.native
  def get(url: java.lang.String, data: Data, cb: RequestCallback): scala.Unit = js.native
  def isConnected(): scala.Boolean = js.native
  def isConnecting(): scala.Boolean = js.native
  def mightBeAboutToAutoConnect(): scala.Boolean = js.native
  def off(event: java.lang.String, cb: js.Function0[_]): Socket = js.native
  def on(event: java.lang.String, cb: js.Function1[/* repeated */js.Any, _]): Socket = js.native
  @JSName("on")
  def on_connect(event: sailsDotIoDotJsLib.sailsDotIoDotJsLibStrings.connect, cb: js.Function0[_]): Socket = js.native
  @JSName("on")
  def on_disconnect(event: sailsDotIoDotJsLib.sailsDotIoDotJsLibStrings.disconnect, cb: js.Function0[_]): Socket = js.native
  @JSName("on")
  def on_error(event: sailsDotIoDotJsLib.sailsDotIoDotJsLibStrings.error, cb: js.Function1[/* err */ js.Any, _]): Socket = js.native
  @JSName("on")
  def on_reconnect(
    event: sailsDotIoDotJsLib.sailsDotIoDotJsLibStrings.reconnect,
    cb: js.Function2[/* transport */ java.lang.String, /* numAttempts */ scala.Double, _]
  ): Socket = js.native
  @JSName("on")
  def on_reconnecting(
    event: sailsDotIoDotJsLib.sailsDotIoDotJsLibStrings.reconnecting,
    cb: js.Function1[/* numAttempts */ scala.Double, _]
  ): Socket = js.native
  def post(url: java.lang.String): scala.Unit = js.native
  def post(url: java.lang.String, cb: RequestCallback): scala.Unit = js.native
  def post(url: java.lang.String, data: Data): scala.Unit = js.native
  def post(url: java.lang.String, data: Data, cb: RequestCallback): scala.Unit = js.native
  def put(url: java.lang.String): scala.Unit = js.native
  def put(url: java.lang.String, cb: RequestCallback): scala.Unit = js.native
  def put(url: java.lang.String, data: Data): scala.Unit = js.native
  def put(url: java.lang.String, data: Data, cb: RequestCallback): scala.Unit = js.native
  def reconnect(): Socket = js.native
  def removeAllListeners(): Socket = js.native
  def replay(): Socket = js.native
  def request(options: RequestOptions): scala.Unit = js.native
  def request(options: RequestOptions, cb: RequestCallback): scala.Unit = js.native
}


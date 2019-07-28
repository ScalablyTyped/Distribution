package typings.sailsDotIoDotJs.sailsDotIoDotJsMod

import typings.sailsDotIoDotJs.sailsDotIoDotJsStrings.connect
import typings.sailsDotIoDotJs.sailsDotIoDotJsStrings.disconnect
import typings.sailsDotIoDotJs.sailsDotIoDotJsStrings.error
import typings.sailsDotIoDotJs.sailsDotIoDotJsStrings.reconnect
import typings.sailsDotIoDotJs.sailsDotIoDotJsStrings.reconnecting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Socket extends js.Object {
  def delete(url: String): Unit = js.native
  def delete(url: String, cb: RequestCallback): Unit = js.native
  def delete(url: String, data: Data): Unit = js.native
  def delete(url: String, data: Data, cb: RequestCallback): Unit = js.native
  def get(url: String): Unit = js.native
  def get(url: String, cb: RequestCallback): Unit = js.native
  def get(url: String, data: Data): Unit = js.native
  def get(url: String, data: Data, cb: RequestCallback): Unit = js.native
  def isConnected(): Boolean = js.native
  def isConnecting(): Boolean = js.native
  def mightBeAboutToAutoConnect(): Boolean = js.native
  def off(event: String, cb: js.Function0[_]): Socket = js.native
  def on(event: String, cb: js.Function1[/* repeated */ js.Any, _]): Socket = js.native
  @JSName("on")
  def on_connect(event: connect, cb: js.Function0[_]): Socket = js.native
  @JSName("on")
  def on_disconnect(event: disconnect, cb: js.Function0[_]): Socket = js.native
  @JSName("on")
  def on_error(event: error, cb: js.Function1[/* err */ js.Any, _]): Socket = js.native
  @JSName("on")
  def on_reconnect(event: reconnect, cb: js.Function2[/* transport */ String, /* numAttempts */ Double, _]): Socket = js.native
  @JSName("on")
  def on_reconnecting(event: reconnecting, cb: js.Function1[/* numAttempts */ Double, _]): Socket = js.native
  def post(url: String): Unit = js.native
  def post(url: String, cb: RequestCallback): Unit = js.native
  def post(url: String, data: Data): Unit = js.native
  def post(url: String, data: Data, cb: RequestCallback): Unit = js.native
  def put(url: String): Unit = js.native
  def put(url: String, cb: RequestCallback): Unit = js.native
  def put(url: String, data: Data): Unit = js.native
  def put(url: String, data: Data, cb: RequestCallback): Unit = js.native
  def reconnect(): Socket = js.native
  def removeAllListeners(): Socket = js.native
  def replay(): Socket = js.native
  def request(options: RequestOptions): Unit = js.native
  def request(options: RequestOptions, cb: RequestCallback): Unit = js.native
}


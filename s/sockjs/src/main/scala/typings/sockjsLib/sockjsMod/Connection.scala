package typings
package sockjsLib.sockjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Connection
  extends nodeLib.NodeJSNs.ReadWriteStream {
  var address: org.scalablytyped.runtime.StringDictionary[sockjsLib.Anon_Address] = js.native
  var headers: org.scalablytyped.runtime.StringDictionary[java.lang.String] = js.native
  var id: java.lang.String = js.native
  var pathname: java.lang.String = js.native
  var prefix: java.lang.String = js.native
  var protocol: java.lang.String = js.native
  var readyState: scala.Double = js.native
  var remoteAddress: java.lang.String = js.native
  var remotePort: scala.Double = js.native
  var url: java.lang.String = js.native
  def close(): scala.Boolean = js.native
  def close(code: java.lang.String): scala.Boolean = js.native
  def close(code: java.lang.String, reason: java.lang.String): scala.Boolean = js.native
  def destroy(): scala.Unit = js.native
  def on(event: java.lang.String, listener: js.Function): this.type = js.native
  @JSName("on")
  def on_close(event: sockjsLib.sockjsLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_data(event: sockjsLib.sockjsLibStrings.data, listener: js.Function1[/* message */ java.lang.String, _]): this.type = js.native
}


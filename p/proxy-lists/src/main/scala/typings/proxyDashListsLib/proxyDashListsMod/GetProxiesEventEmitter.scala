package typings
package proxyDashListsLib.proxyDashListsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("proxy-lists", "GetProxiesEventEmitter")
@js.native
class GetProxiesEventEmitter ()
  extends nodeLib.eventsMod.EventEmitter {
  @JSName("on")
  def on_data(
    event: proxyDashListsLib.proxyDashListsLibStrings.data,
    listener: js.Function1[/* proxies */ js.Array[Proxy], scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_end(event: proxyDashListsLib.proxyDashListsLibStrings.end, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_error(
    event: proxyDashListsLib.proxyDashListsLibStrings.error,
    listener: js.Function1[/* error */ js.Any, scala.Unit]
  ): this.type = js.native
}


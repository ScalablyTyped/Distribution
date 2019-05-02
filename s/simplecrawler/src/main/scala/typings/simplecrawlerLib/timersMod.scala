package typings
package simplecrawlerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("timers", JSImport.Namespace)
@js.native
object timersMod extends js.Object {
  def clearImmediate(immediateId: js.Any): scala.Unit = js.native
  def clearInterval(intervalId: simplecrawlerLib.NodeJSNs.Timer): scala.Unit = js.native
  def clearTimeout(timeoutId: simplecrawlerLib.NodeJSNs.Timer): scala.Unit = js.native
  def setImmediate(callback: js.Function1[/* repeated */ js.Any, scala.Unit], args: js.Any*): js.Any = js.native
  def setInterval(callback: js.Function1[/* repeated */ js.Any, scala.Unit], ms: scala.Double, args: js.Any*): simplecrawlerLib.NodeJSNs.Timer = js.native
  def setTimeout(callback: js.Function1[/* repeated */ js.Any, scala.Unit], ms: scala.Double, args: js.Any*): simplecrawlerLib.NodeJSNs.Timer = js.native
}


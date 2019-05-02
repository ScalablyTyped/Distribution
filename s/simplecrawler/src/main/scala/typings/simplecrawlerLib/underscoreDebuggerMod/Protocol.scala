package typings
package simplecrawlerLib.underscoreDebuggerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("_debugger", "Protocol")
@js.native
class Protocol () extends js.Object {
  var res: Packet = js.native
  var state: java.lang.String = js.native
  def execute(data: java.lang.String): scala.Unit = js.native
  def onResponse(pkt: Packet): scala.Unit = js.native
  def serialize(rq: Request): java.lang.String = js.native
}


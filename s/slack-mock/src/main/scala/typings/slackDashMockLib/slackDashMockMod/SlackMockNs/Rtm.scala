package typings
package slackDashMockLib.slackDashMockMod.SlackMockNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// RTM
trait Rtm[T] extends js.Object {
  var calls: js.Array[RtmCall[T]]
  var clients: js.Array[wsLib.wsMod.namespaced]
  def reset(): scala.Unit
  def send(token: java.lang.String, message: T): js.Promise[scala.Unit]
  def startServer(token: java.lang.String): scala.Unit
  def stopServer(token: java.lang.String): scala.Unit
}

object Rtm {
  @scala.inline
  def apply[T](
    calls: js.Array[RtmCall[T]],
    clients: js.Array[wsLib.wsMod.namespaced],
    reset: js.Function0[scala.Unit],
    send: js.Function2[java.lang.String, T, js.Promise[scala.Unit]],
    startServer: js.Function1[java.lang.String, scala.Unit],
    stopServer: js.Function1[java.lang.String, scala.Unit]
  ): Rtm[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("calls")(calls)
    __obj.updateDynamic("clients")(clients)
    __obj.updateDynamic("reset")(reset)
    __obj.updateDynamic("send")(send)
    __obj.updateDynamic("startServer")(startServer)
    __obj.updateDynamic("stopServer")(stopServer)
    __obj.asInstanceOf[Rtm[T]]
  }
}


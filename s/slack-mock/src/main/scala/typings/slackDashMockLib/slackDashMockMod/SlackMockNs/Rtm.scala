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
    reset: () => scala.Unit,
    send: (java.lang.String, T) => js.Promise[scala.Unit],
    startServer: java.lang.String => scala.Unit,
    stopServer: java.lang.String => scala.Unit
  ): Rtm[T] = {
    val __obj = js.Dynamic.literal(calls = calls, clients = clients, reset = js.Any.fromFunction0(reset), send = js.Any.fromFunction2(send), startServer = js.Any.fromFunction1(startServer), stopServer = js.Any.fromFunction1(stopServer))
  
    __obj.asInstanceOf[Rtm[T]]
  }
}


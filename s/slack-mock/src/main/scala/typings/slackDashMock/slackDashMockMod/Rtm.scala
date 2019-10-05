package typings.slackDashMock.slackDashMockMod

import typings.ws.wsMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// RTM
trait Rtm[T] extends js.Object {
  var calls: js.Array[RtmCall[T]]
  var clients: js.Array[^]
  def reset(): Unit
  def send(token: String, message: T): js.Promise[Unit]
  def startServer(token: String): Unit
  def stopServer(token: String): Unit
}

object Rtm {
  @scala.inline
  def apply[T](
    calls: js.Array[RtmCall[T]],
    clients: js.Array[^],
    reset: () => Unit,
    send: (String, T) => js.Promise[Unit],
    startServer: String => Unit,
    stopServer: String => Unit
  ): Rtm[T] = {
    val __obj = js.Dynamic.literal(calls = calls, clients = clients, reset = js.Any.fromFunction0(reset), send = js.Any.fromFunction2(send), startServer = js.Any.fromFunction1(startServer), stopServer = js.Any.fromFunction1(stopServer))
  
    __obj.asInstanceOf[Rtm[T]]
  }
}


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


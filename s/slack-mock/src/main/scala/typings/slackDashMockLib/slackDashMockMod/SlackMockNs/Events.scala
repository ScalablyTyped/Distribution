package typings
package slackDashMockLib.slackDashMockMod.SlackMockNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Events[T] extends js.Object {
  var calls: js.Array[EventCall[T]]
  def reset(): scala.Unit
  def send(targetUrl: EventUrl, body: T): js.Promise[scala.Unit]
}


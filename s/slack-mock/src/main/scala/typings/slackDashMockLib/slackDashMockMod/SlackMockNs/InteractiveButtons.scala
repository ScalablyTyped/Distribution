package typings
package slackDashMockLib.slackDashMockMod.SlackMockNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait InteractiveButtons[T] extends js.Object {
  var calls: js.Array[InteractiveButtonCall[T]]
  def addResponse(opts: InteractiveButtonOptions[T]): scala.Unit
  def reset(): scala.Unit
  def send(targetUrl: InteractiveButtonUrl, body: T): stdLib.Promise[scala.Unit]
}


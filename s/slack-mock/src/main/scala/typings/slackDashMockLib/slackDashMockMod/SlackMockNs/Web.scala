package typings
package slackDashMockLib.slackDashMockMod.SlackMockNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Web[T] extends js.Object {
  var calls: js.Array[WebCall[T]]
  def addResponse(opts: WebOptions[T]): scala.Unit
  def reset(): scala.Unit
}


package typings
package slackDashMockLib.slackDashMockMod.SlackMockNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventCall[T] extends js.Object {
  var headers: EventHttpHeaders
  var params: T
  var statusCode: scala.Double
  var url: EventUrl
}


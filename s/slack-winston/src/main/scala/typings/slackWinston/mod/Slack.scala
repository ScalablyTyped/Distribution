package typings.slackWinston.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("slack-winston", "Slack")
@js.native
class Slack () extends js.Object {
  def this(options: SlackTransportOptions) = this()
  var close: js.UndefOr[js.Function0[Unit]] = js.native
  var format: js.UndefOr[Format] = js.native
  var handleExceptions: js.UndefOr[Boolean] = js.native
  var level: js.UndefOr[String] = js.native
  var log: js.UndefOr[js.Function2[/* info */ js.Any, /* next */ js.Function0[Unit], _]] = js.native
  var logv: js.UndefOr[js.Function2[/* info */ js.Any, /* next */ js.Function0[Unit], _]] = js.native
  var silent: js.UndefOr[Boolean] = js.native
}


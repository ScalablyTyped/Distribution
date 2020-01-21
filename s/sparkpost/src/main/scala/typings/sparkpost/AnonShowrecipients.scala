package typings.sparkpost

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonShowrecipients extends js.Object {
  var show_recipients: js.UndefOr[Boolean] = js.undefined
}

object AnonShowrecipients {
  @scala.inline
  def apply(show_recipients: js.UndefOr[Boolean] = js.undefined): AnonShowrecipients = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(show_recipients)) __obj.updateDynamic("show_recipients")(show_recipients.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonShowrecipients]
  }
}


package typings.sparkpost.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Showrecipients extends js.Object {
  var show_recipients: js.UndefOr[Boolean] = js.undefined
}

object Showrecipients {
  @scala.inline
  def apply(show_recipients: js.UndefOr[Boolean] = js.undefined): Showrecipients = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(show_recipients)) __obj.updateDynamic("show_recipients")(show_recipients.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Showrecipients]
  }
}


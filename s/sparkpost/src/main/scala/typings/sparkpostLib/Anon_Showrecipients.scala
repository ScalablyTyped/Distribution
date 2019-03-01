package typings
package sparkpostLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Showrecipients extends js.Object {
  var show_recipients: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Showrecipients {
  @scala.inline
  def apply(show_recipients: js.UndefOr[scala.Boolean] = js.undefined): Anon_Showrecipients = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(show_recipients)) __obj.updateDynamic("show_recipients")(show_recipients)
    __obj.asInstanceOf[Anon_Showrecipients]
  }
}


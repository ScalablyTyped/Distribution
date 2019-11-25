package typings.reactDashStripeDashElements

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Declinecode extends js.Object {
  var decline_code: js.UndefOr[String] = js.undefined
}

object Anon_Declinecode {
  @scala.inline
  def apply(decline_code: String = null): Anon_Declinecode = {
    val __obj = js.Dynamic.literal()
    if (decline_code != null) __obj.updateDynamic("decline_code")(decline_code.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Declinecode]
  }
}


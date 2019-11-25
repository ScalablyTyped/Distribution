package typings.reactDashEmailDashEditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Tools extends js.Object {
  val tools: js.UndefOr[Anon_Dock] = js.undefined
}

object Anon_Tools {
  @scala.inline
  def apply(tools: Anon_Dock = null): Anon_Tools = {
    val __obj = js.Dynamic.literal()
    if (tools != null) __obj.updateDynamic("tools")(tools.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Tools]
  }
}


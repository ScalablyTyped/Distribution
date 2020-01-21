package typings.reactEmailEditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTools extends js.Object {
  val tools: js.UndefOr[AnonDock] = js.undefined
}

object AnonTools {
  @scala.inline
  def apply(tools: AnonDock = null): AnonTools = {
    val __obj = js.Dynamic.literal()
    if (tools != null) __obj.updateDynamic("tools")(tools.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTools]
  }
}


package typings.reactEmailEditor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tools extends js.Object {
  val tools: js.UndefOr[Dock] = js.undefined
}

object Tools {
  @scala.inline
  def apply(tools: Dock = null): Tools = {
    val __obj = js.Dynamic.literal()
    if (tools != null) __obj.updateDynamic("tools")(tools.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tools]
  }
}


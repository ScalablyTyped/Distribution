package typings.storybookComponents.actionBarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionBarProps extends js.Object {
  var actionItems: js.Array[ActionItem] = js.native
}

object ActionBarProps {
  @scala.inline
  def apply(actionItems: js.Array[ActionItem]): ActionBarProps = {
    val __obj = js.Dynamic.literal(actionItems = actionItems.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ActionBarProps]
  }
}


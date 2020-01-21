package typings.reactDataGrid.AdazzleReactDataGrid

import typings.reactDataGrid.AnonCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionMenu extends js.Object {
  var actions: js.Array[AnonCallback]
  var icon: String
}

object ActionMenu {
  @scala.inline
  def apply(actions: js.Array[AnonCallback], icon: String): ActionMenu = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ActionMenu]
  }
}


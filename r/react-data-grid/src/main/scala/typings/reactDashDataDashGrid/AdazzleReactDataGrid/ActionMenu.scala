package typings.reactDashDataDashGrid.AdazzleReactDataGrid

import typings.reactDashDataDashGrid.Anon_Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionMenu extends js.Object {
  var actions: js.Array[Anon_Callback]
  var icon: String
}

object ActionMenu {
  @scala.inline
  def apply(actions: js.Array[Anon_Callback], icon: String): ActionMenu = {
    val __obj = js.Dynamic.literal(actions = actions, icon = icon)
  
    __obj.asInstanceOf[ActionMenu]
  }
}


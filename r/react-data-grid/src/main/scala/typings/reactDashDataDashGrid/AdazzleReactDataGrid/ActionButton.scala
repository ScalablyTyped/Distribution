package typings.reactDashDataDashGrid.AdazzleReactDataGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionButton extends js.Object {
  var icon: String
  def callback(): Unit
}

object ActionButton {
  @scala.inline
  def apply(callback: () => Unit, icon: String): ActionButton = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction0(callback), icon = icon)
  
    __obj.asInstanceOf[ActionButton]
  }
}


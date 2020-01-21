package typings.reactDataGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCallback extends js.Object {
  var icon: String
  var text: String
  def callback(): Unit
}

object AnonCallback {
  @scala.inline
  def apply(callback: () => Unit, icon: String, text: String): AnonCallback = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction0(callback), icon = icon.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCallback]
  }
}


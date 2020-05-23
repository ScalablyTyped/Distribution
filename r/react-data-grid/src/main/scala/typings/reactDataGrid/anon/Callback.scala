package typings.reactDataGrid.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Callback extends js.Object {
  var icon: String
  var text: String
  def callback(): Unit
}

object Callback {
  @scala.inline
  def apply(callback: () => Unit, icon: String, text: String): Callback = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction0(callback), icon = icon.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Callback]
  }
}


package typings.reactDashDataDashGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Callback extends js.Object {
  var icon: String
  var text: String
  def callback(): Unit
}

object Anon_Callback {
  @scala.inline
  def apply(callback: () => Unit, icon: String, text: String): Anon_Callback = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction0(callback), icon = icon.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Callback]
  }
}


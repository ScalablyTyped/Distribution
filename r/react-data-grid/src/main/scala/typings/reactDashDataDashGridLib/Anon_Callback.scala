package typings
package reactDashDataDashGridLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Callback extends js.Object {
  var icon: java.lang.String
  var text: java.lang.String
  def callback(): scala.Unit
}

object Anon_Callback {
  @scala.inline
  def apply(callback: () => scala.Unit, icon: java.lang.String, text: java.lang.String): Anon_Callback = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction0(callback), icon = icon, text = text)
  
    __obj.asInstanceOf[Anon_Callback]
  }
}


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
  def apply(callback: js.Function0[scala.Unit], icon: java.lang.String, text: java.lang.String): Anon_Callback = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("callback")(callback)
    __obj.updateDynamic("icon")(icon)
    __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[Anon_Callback]
  }
}


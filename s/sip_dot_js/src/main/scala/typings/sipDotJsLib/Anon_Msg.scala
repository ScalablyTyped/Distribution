package typings
package sipDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Msg extends js.Object {
  var msg: java.lang.String
}

object Anon_Msg {
  @scala.inline
  def apply(msg: java.lang.String): Anon_Msg = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("msg")(msg)
    __obj.asInstanceOf[Anon_Msg]
  }
}


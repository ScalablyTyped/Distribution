package typings
package sparkpostLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Msg extends js.Object {
  var msg: java.lang.String
  var response: Anon_Body
}

object Anon_Msg {
  @scala.inline
  def apply(msg: java.lang.String, response: Anon_Body): Anon_Msg = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("msg")(msg)
    __obj.updateDynamic("response")(response)
    __obj.asInstanceOf[Anon_Msg]
  }
}


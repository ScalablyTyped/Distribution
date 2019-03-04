package typings
package reapopLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PayloadType extends js.Object {
  var payload: js.Any
  var `type`: ActionTypes
}

object Anon_PayloadType {
  @scala.inline
  def apply(payload: js.Any, `type`: ActionTypes): Anon_PayloadType = {
    val __obj = js.Dynamic.literal(payload = payload)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_PayloadType]
  }
}


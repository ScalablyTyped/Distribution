package typings.reapop.anon

import typings.reapop.mod.ActionTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PayloadType extends js.Object {
  var payload: js.Any
  var `type`: ActionTypes
}

object PayloadType {
  @scala.inline
  def apply(payload: js.Any, `type`: ActionTypes): PayloadType = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PayloadType]
  }
}


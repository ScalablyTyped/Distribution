package typings.sdpTransform

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMids extends js.Object {
  var mids: String
  var `type`: String
}

object AnonMids {
  @scala.inline
  def apply(mids: String, `type`: String): AnonMids = {
    val __obj = js.Dynamic.literal(mids = mids.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMids]
  }
}


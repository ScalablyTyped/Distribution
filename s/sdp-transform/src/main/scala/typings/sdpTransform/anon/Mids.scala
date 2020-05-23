package typings.sdpTransform.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Mids extends js.Object {
  var mids: String
  var `type`: String
}

object Mids {
  @scala.inline
  def apply(mids: String, `type`: String): Mids = {
    val __obj = js.Dynamic.literal(mids = mids.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mids]
  }
}


package typings.sdpDashTransform

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Mids extends js.Object {
  var mids: String
  var `type`: String
}

object Anon_Mids {
  @scala.inline
  def apply(mids: String, `type`: String): Anon_Mids = {
    val __obj = js.Dynamic.literal(mids = mids)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Mids]
  }
}


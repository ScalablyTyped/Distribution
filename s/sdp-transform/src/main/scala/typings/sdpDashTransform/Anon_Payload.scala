package typings.sdpDashTransform

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Payload extends js.Object {
  var payload: Double
  var subtype: js.UndefOr[String] = js.undefined
  var `type`: String
}

object Anon_Payload {
  @scala.inline
  def apply(payload: Double, `type`: String, subtype: String = null): Anon_Payload = {
    val __obj = js.Dynamic.literal(payload = payload)
    __obj.updateDynamic("type")(`type`)
    if (subtype != null) __obj.updateDynamic("subtype")(subtype)
    __obj.asInstanceOf[Anon_Payload]
  }
}


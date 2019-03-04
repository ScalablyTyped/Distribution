package typings
package sdpDashTransformLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Payload extends js.Object {
  var payload: scala.Double
  var subtype: js.UndefOr[java.lang.String] = js.undefined
  var `type`: java.lang.String
}

object Anon_Payload {
  @scala.inline
  def apply(payload: scala.Double, `type`: java.lang.String, subtype: java.lang.String = null): Anon_Payload = {
    val __obj = js.Dynamic.literal(payload = payload)
    __obj.updateDynamic("type")(`type`)
    if (subtype != null) __obj.updateDynamic("subtype")(subtype)
    __obj.asInstanceOf[Anon_Payload]
  }
}


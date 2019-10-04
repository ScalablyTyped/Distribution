package typings.atPulumiAws.typesOutputMod.applicationloadbalancingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetTargetGroupStickiness extends js.Object {
  var cookieDuration: Double
  var enabled: Boolean
  var `type`: String
}

object GetTargetGroupStickiness {
  @scala.inline
  def apply(cookieDuration: Double, enabled: Boolean, `type`: String): GetTargetGroupStickiness = {
    val __obj = js.Dynamic.literal(cookieDuration = cookieDuration, enabled = enabled)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[GetTargetGroupStickiness]
  }
}


package typings.pulumiAws.outputMod.elasticloadbalancingv2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTargetGroupStickiness extends js.Object {
  var cookieDuration: Double = js.native
  var enabled: Boolean = js.native
  var `type`: String = js.native
}

object GetTargetGroupStickiness {
  @scala.inline
  def apply(cookieDuration: Double, enabled: Boolean, `type`: String): GetTargetGroupStickiness = {
    val __obj = js.Dynamic.literal(cookieDuration = cookieDuration.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTargetGroupStickiness]
  }
}


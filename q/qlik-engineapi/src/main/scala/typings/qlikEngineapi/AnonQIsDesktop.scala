package typings.qlikEngineapi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonQIsDesktop extends js.Object {
  var qIsDesktop: Boolean
  var qSSOEnabled: Boolean
}

object AnonQIsDesktop {
  @scala.inline
  def apply(qIsDesktop: Boolean, qSSOEnabled: Boolean): AnonQIsDesktop = {
    val __obj = js.Dynamic.literal(qIsDesktop = qIsDesktop.asInstanceOf[js.Any], qSSOEnabled = qSSOEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonQIsDesktop]
  }
}


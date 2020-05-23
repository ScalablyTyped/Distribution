package typings.qlikEngineapi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QIsDesktop extends js.Object {
  var qIsDesktop: Boolean
  var qSSOEnabled: Boolean
}

object QIsDesktop {
  @scala.inline
  def apply(qIsDesktop: Boolean, qSSOEnabled: Boolean): QIsDesktop = {
    val __obj = js.Dynamic.literal(qIsDesktop = qIsDesktop.asInstanceOf[js.Any], qSSOEnabled = qSSOEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[QIsDesktop]
  }
}


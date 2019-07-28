package typings.qlikDashEngineapi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_QIsDesktop extends js.Object {
  var qIsDesktop: Boolean
  var qSSOEnabled: Boolean
}

object Anon_QIsDesktop {
  @scala.inline
  def apply(qIsDesktop: Boolean, qSSOEnabled: Boolean): Anon_QIsDesktop = {
    val __obj = js.Dynamic.literal(qIsDesktop = qIsDesktop, qSSOEnabled = qSSOEnabled)
  
    __obj.asInstanceOf[Anon_QIsDesktop]
  }
}


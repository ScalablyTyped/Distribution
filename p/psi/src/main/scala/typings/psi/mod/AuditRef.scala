package typings.psi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuditRef extends js.Object {
  var group: String
  var id: String
  var weight: Double
}

object AuditRef {
  @scala.inline
  def apply(group: String, id: String, weight: Double): AuditRef = {
    val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuditRef]
  }
}


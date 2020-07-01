package typings.psi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Category extends js.Object {
  var auditRefs: js.Array[AuditRef]
  var description: String
  var id: String
  var manualDescription: String
  var score: js.Object
  var title: String
}

object Category {
  @scala.inline
  def apply(
    auditRefs: js.Array[AuditRef],
    description: String,
    id: String,
    manualDescription: String,
    score: js.Object,
    title: String
  ): Category = {
    val __obj = js.Dynamic.literal(auditRefs = auditRefs.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], manualDescription = manualDescription.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Category]
  }
}


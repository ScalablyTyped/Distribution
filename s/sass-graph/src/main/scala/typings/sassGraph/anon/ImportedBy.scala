package typings.sassGraph.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImportedBy extends js.Object {
  var importedBy: js.Array[String]
  var imports: js.Array[String]
  var modified: String
}

object ImportedBy {
  @scala.inline
  def apply(importedBy: js.Array[String], imports: js.Array[String], modified: String): ImportedBy = {
    val __obj = js.Dynamic.literal(importedBy = importedBy.asInstanceOf[js.Any], imports = imports.asInstanceOf[js.Any], modified = modified.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportedBy]
  }
}


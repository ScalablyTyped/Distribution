package typings.sassGraph

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonImportedBy extends js.Object {
  var importedBy: js.Array[String]
  var imports: js.Array[String]
  var modified: String
}

object AnonImportedBy {
  @scala.inline
  def apply(importedBy: js.Array[String], imports: js.Array[String], modified: String): AnonImportedBy = {
    val __obj = js.Dynamic.literal(importedBy = importedBy.asInstanceOf[js.Any], imports = imports.asInstanceOf[js.Any], modified = modified.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonImportedBy]
  }
}


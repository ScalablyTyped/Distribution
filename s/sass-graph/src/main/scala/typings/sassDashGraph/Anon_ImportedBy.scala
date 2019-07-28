package typings.sassDashGraph

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ImportedBy extends js.Object {
  var importedBy: js.Array[String]
  var imports: js.Array[String]
  var modified: String
}

object Anon_ImportedBy {
  @scala.inline
  def apply(importedBy: js.Array[String], imports: js.Array[String], modified: String): Anon_ImportedBy = {
    val __obj = js.Dynamic.literal(importedBy = importedBy, imports = imports, modified = modified)
  
    __obj.asInstanceOf[Anon_ImportedBy]
  }
}


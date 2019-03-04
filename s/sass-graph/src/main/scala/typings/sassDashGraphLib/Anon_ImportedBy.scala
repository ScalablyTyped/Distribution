package typings
package sassDashGraphLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ImportedBy extends js.Object {
  var importedBy: js.Array[java.lang.String]
  var imports: js.Array[java.lang.String]
  var modified: java.lang.String
}

object Anon_ImportedBy {
  @scala.inline
  def apply(
    importedBy: js.Array[java.lang.String],
    imports: js.Array[java.lang.String],
    modified: java.lang.String
  ): Anon_ImportedBy = {
    val __obj = js.Dynamic.literal(importedBy = importedBy, imports = imports, modified = modified)
  
    __obj.asInstanceOf[Anon_ImportedBy]
  }
}


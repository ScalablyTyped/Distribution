package typings.sassGraph.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImportedBy extends js.Object {
  var importedBy: js.Array[String] = js.native
  var imports: js.Array[String] = js.native
  var modified: String = js.native
}

object ImportedBy {
  @scala.inline
  def apply(importedBy: js.Array[String], imports: js.Array[String], modified: String): ImportedBy = {
    val __obj = js.Dynamic.literal(importedBy = importedBy.asInstanceOf[js.Any], imports = imports.asInstanceOf[js.Any], modified = modified.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportedBy]
  }
  @scala.inline
  implicit class ImportedByOps[Self <: ImportedBy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setImportedByVarargs(value: String*): Self = this.set("importedBy", js.Array(value :_*))
    @scala.inline
    def setImportedBy(value: js.Array[String]): Self = this.set("importedBy", value.asInstanceOf[js.Any])
    @scala.inline
    def setImportsVarargs(value: String*): Self = this.set("imports", js.Array(value :_*))
    @scala.inline
    def setImports(value: js.Array[String]): Self = this.set("imports", value.asInstanceOf[js.Any])
    @scala.inline
    def setModified(value: String): Self = this.set("modified", value.asInstanceOf[js.Any])
  }
  
}


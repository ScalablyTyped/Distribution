package typings.psi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Category extends js.Object {
  
  var auditRefs: js.Array[AuditRef] = js.native
  
  var description: String = js.native
  
  var id: String = js.native
  
  var manualDescription: String = js.native
  
  var score: js.Object = js.native
  
  var title: String = js.native
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
  
  @scala.inline
  implicit class CategoryOps[Self <: Category] (val x: Self) extends AnyVal {
    
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
    def setAuditRefsVarargs(value: AuditRef*): Self = this.set("auditRefs", js.Array(value :_*))
    
    @scala.inline
    def setAuditRefs(value: js.Array[AuditRef]): Self = this.set("auditRefs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManualDescription(value: String): Self = this.set("manualDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScore(value: js.Object): Self = this.set("score", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
  }
}

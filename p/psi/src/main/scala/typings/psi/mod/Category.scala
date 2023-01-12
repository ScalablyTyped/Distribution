package typings.psi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Category extends StObject {
  
  var auditRefs: js.Array[AuditRef]
  
  var description: String
  
  var id: String
  
  var manualDescription: String
  
  var score: js.Object
  
  var title: String
}
object Category {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: Category] (val x: Self) extends AnyVal {
    
    inline def setAuditRefs(value: js.Array[AuditRef]): Self = StObject.set(x, "auditRefs", value.asInstanceOf[js.Any])
    
    inline def setAuditRefsVarargs(value: AuditRef*): Self = StObject.set(x, "auditRefs", js.Array(value*))
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setManualDescription(value: String): Self = StObject.set(x, "manualDescription", value.asInstanceOf[js.Any])
    
    inline def setScore(value: js.Object): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}

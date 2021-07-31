package typings.psi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuditRef extends StObject {
  
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
  
  @scala.inline
  implicit class AuditRefMutableBuilder[Self <: AuditRef] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
  }
}

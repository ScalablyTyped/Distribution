package typings.sendgrid.mod.SendGrid.Helpers.Mail

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Asm extends StObject {
  
  var group_id: Double
  
  var groups_to_display: js.Array[Double]
}
object Asm {
  
  inline def apply(group_id: Double, groups_to_display: js.Array[Double]): Asm = {
    val __obj = js.Dynamic.literal(group_id = group_id.asInstanceOf[js.Any], groups_to_display = groups_to_display.asInstanceOf[js.Any])
    __obj.asInstanceOf[Asm]
  }
  
  extension [Self <: Asm](x: Self) {
    
    inline def setGroup_id(value: Double): Self = StObject.set(x, "group_id", value.asInstanceOf[js.Any])
    
    inline def setGroups_to_display(value: js.Array[Double]): Self = StObject.set(x, "groups_to_display", value.asInstanceOf[js.Any])
    
    inline def setGroups_to_displayVarargs(value: Double*): Self = StObject.set(x, "groups_to_display", js.Array(value :_*))
  }
}

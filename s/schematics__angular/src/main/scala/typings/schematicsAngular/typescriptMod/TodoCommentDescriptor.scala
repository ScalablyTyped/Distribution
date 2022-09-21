package typings.schematicsAngular.typescriptMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TodoCommentDescriptor extends StObject {
  
  var priority: Double
  
  var text: java.lang.String
}
object TodoCommentDescriptor {
  
  inline def apply(priority: Double, text: java.lang.String): TodoCommentDescriptor = {
    val __obj = js.Dynamic.literal(priority = priority.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[TodoCommentDescriptor]
  }
  
  extension [Self <: TodoCommentDescriptor](x: Self) {
    
    inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setText(value: java.lang.String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}

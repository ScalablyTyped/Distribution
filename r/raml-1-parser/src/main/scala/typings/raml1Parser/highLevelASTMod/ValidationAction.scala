package typings.raml1Parser.highLevelASTMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValidationAction extends StObject {
  
  def action(): Unit
  
  var name: String
}
object ValidationAction {
  
  inline def apply(action: () => Unit, name: String): ValidationAction = {
    val __obj = js.Dynamic.literal(action = js.Any.fromFunction0(action), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidationAction]
  }
  
  extension [Self <: ValidationAction](x: Self) {
    
    inline def setAction(value: () => Unit): Self = StObject.set(x, "action", js.Any.fromFunction0(value))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}

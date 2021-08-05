package typings.storybookUi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait A11y extends StObject {
  
  var a11y: Disable
  
  var actions: Disable
}
object A11y {
  
  inline def apply(a11y: Disable, actions: Disable): A11y = {
    val __obj = js.Dynamic.literal(a11y = a11y.asInstanceOf[js.Any], actions = actions.asInstanceOf[js.Any])
    __obj.asInstanceOf[A11y]
  }
  
  extension [Self <: A11y](x: Self) {
    
    inline def setA11y(value: Disable): Self = StObject.set(x, "a11y", value.asInstanceOf[js.Any])
    
    inline def setActions(value: Disable): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
  }
}

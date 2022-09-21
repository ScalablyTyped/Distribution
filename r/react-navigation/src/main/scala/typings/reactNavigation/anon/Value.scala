package typings.reactNavigation.anon

import typings.reactNavigation.mod.NavigationProp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Value extends StObject {
  
  var value: NavigationProp[Any]
}
object Value {
  
  inline def apply(value: NavigationProp[Any]): Value = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
  
  extension [Self <: Value](x: Self) {
    
    inline def setValue(value: NavigationProp[Any]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}

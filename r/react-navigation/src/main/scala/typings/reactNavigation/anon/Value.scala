package typings.reactNavigation.anon

import typings.reactNavigation.mod.NavigationProp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Value extends StObject {
  
  var value: NavigationProp[js.Any]
}
object Value {
  
  @scala.inline
  def apply(value: NavigationProp[js.Any]): Value = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
  
  @scala.inline
  implicit class ValueMutableBuilder[Self <: Value] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue(value: NavigationProp[js.Any]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}

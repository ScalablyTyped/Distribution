package typings.reactNavigation.anon

import typings.reactNavigation.mod.NavigationProp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Value extends StObject {
  
  var value: NavigationProp[_] = js.native
}
object Value {
  
  @scala.inline
  def apply(value: NavigationProp[_]): Value = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
  
  @scala.inline
  implicit class ValueMutableBuilder[Self <: Value] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue(value: NavigationProp[_]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}

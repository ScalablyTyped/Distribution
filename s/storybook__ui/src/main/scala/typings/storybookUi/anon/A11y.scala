package typings.storybookUi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait A11y extends StObject {
  
  var a11y: Disable = js.native
  
  var actions: Disable = js.native
}
object A11y {
  
  @scala.inline
  def apply(a11y: Disable, actions: Disable): A11y = {
    val __obj = js.Dynamic.literal(a11y = a11y.asInstanceOf[js.Any], actions = actions.asInstanceOf[js.Any])
    __obj.asInstanceOf[A11y]
  }
  
  @scala.inline
  implicit class A11yMutableBuilder[Self <: A11y] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setA11y(value: Disable): Self = StObject.set(x, "a11y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActions(value: Disable): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
  }
}

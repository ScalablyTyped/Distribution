package typings.qlik.mod

import typings.qlik.qlikStrings.button
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomPropertyButton
  extends CustomPropertyCommon
     with CustomProperty {
  
  def action(data: VisualizationOptions): Unit = js.native
  
  var component: button = js.native
}
object CustomPropertyButton {
  
  @scala.inline
  def apply(action: VisualizationOptions => Unit, component: button): CustomPropertyButton = {
    val __obj = js.Dynamic.literal(action = js.Any.fromFunction1(action), component = component.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomPropertyButton]
  }
  
  @scala.inline
  implicit class CustomPropertyButtonMutableBuilder[Self <: CustomPropertyButton] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: VisualizationOptions => Unit): Self = StObject.set(x, "action", js.Any.fromFunction1(value))
    
    @scala.inline
    def setComponent(value: button): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
  }
}

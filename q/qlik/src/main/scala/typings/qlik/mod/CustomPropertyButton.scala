package typings.qlik.mod

import typings.qlik.qlikStrings.button
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomPropertyButton
  extends StObject
     with CustomPropertyCommon
     with CustomProperty {
  
  def action(data: VisualizationOptions): Unit
  
  var component: button
}
object CustomPropertyButton {
  
  inline def apply(action: VisualizationOptions => Unit): CustomPropertyButton = {
    val __obj = js.Dynamic.literal(action = js.Any.fromFunction1(action), component = "button")
    __obj.asInstanceOf[CustomPropertyButton]
  }
  
  extension [Self <: CustomPropertyButton](x: Self) {
    
    inline def setAction(value: VisualizationOptions => Unit): Self = StObject.set(x, "action", js.Any.fromFunction1(value))
    
    inline def setComponent(value: button): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
  }
}

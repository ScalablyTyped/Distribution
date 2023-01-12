package typings.reactBootstrapTable.mod

import typings.reactBootstrapTable.anon.ButtonGroupPropssearchPan
import typings.reactBootstrapTable.anon.CloseInsertModal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ToolBarProps extends StObject {
  
  /**
    * Rendered components to use in the toolbar.
    */
  var components: ButtonGroupPropssearchPan
  
  /**
    * Event callbacks to use with a custom toolbar.
    */
  var event: CloseInsertModal
}
object ToolBarProps {
  
  inline def apply(components: ButtonGroupPropssearchPan, event: CloseInsertModal): ToolBarProps = {
    val __obj = js.Dynamic.literal(components = components.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToolBarProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ToolBarProps] (val x: Self) extends AnyVal {
    
    inline def setComponents(value: ButtonGroupPropssearchPan): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    
    inline def setEvent(value: CloseInsertModal): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
  }
}

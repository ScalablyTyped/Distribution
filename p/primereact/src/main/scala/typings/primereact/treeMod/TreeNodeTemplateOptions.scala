package typings.primereact.treeMod

import typings.react.mod.SyntheticEvent
import typings.react.mod.global.JSX.Element
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TreeNodeTemplateOptions extends StObject {
  
  var className: String
  
  var element: Element
  
  var expanded: Boolean
  
  def onTogglerClick(e: SyntheticEvent[typings.std.Element, Event]): Unit
  
  var props: TreeProps
}
object TreeNodeTemplateOptions {
  
  inline def apply(
    className: String,
    element: Element,
    expanded: Boolean,
    onTogglerClick: SyntheticEvent[typings.std.Element, Event] => Unit,
    props: TreeProps
  ): TreeNodeTemplateOptions = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], expanded = expanded.asInstanceOf[js.Any], onTogglerClick = js.Any.fromFunction1(onTogglerClick), props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeNodeTemplateOptions]
  }
  
  extension [Self <: TreeNodeTemplateOptions](x: Self) {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setElement(value: Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
    
    inline def setOnTogglerClick(value: SyntheticEvent[typings.std.Element, Event] => Unit): Self = StObject.set(x, "onTogglerClick", js.Any.fromFunction1(value))
    
    inline def setProps(value: TreeProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
  }
}

package typings.primereact.treeTreeMod

import typings.react.mod.SyntheticEvent
import typings.react.mod.global.JSX.Element
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TreeTogglerTemplateOptions extends StObject {
  
  var containerClassName: String
  
  var element: Element
  
  var expanded: Boolean
  
  var iconClassName: String
  
  def onClick(e: SyntheticEvent[typings.std.Element, Event]): Unit
  
  var props: TreeProps
}
object TreeTogglerTemplateOptions {
  
  inline def apply(
    containerClassName: String,
    element: Element,
    expanded: Boolean,
    iconClassName: String,
    onClick: SyntheticEvent[typings.std.Element, Event] => Unit,
    props: TreeProps
  ): TreeTogglerTemplateOptions = {
    val __obj = js.Dynamic.literal(containerClassName = containerClassName.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], expanded = expanded.asInstanceOf[js.Any], iconClassName = iconClassName.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick), props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeTogglerTemplateOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TreeTogglerTemplateOptions] (val x: Self) extends AnyVal {
    
    inline def setContainerClassName(value: String): Self = StObject.set(x, "containerClassName", value.asInstanceOf[js.Any])
    
    inline def setElement(value: Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
    
    inline def setIconClassName(value: String): Self = StObject.set(x, "iconClassName", value.asInstanceOf[js.Any])
    
    inline def setOnClick(value: SyntheticEvent[typings.std.Element, Event] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    inline def setProps(value: TreeProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
  }
}

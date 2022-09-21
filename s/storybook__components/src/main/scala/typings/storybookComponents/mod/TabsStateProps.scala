package typings.storybookComponents.mod

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TabsStateProps extends StObject {
  
  var absolute: Boolean
  
  var backgroundColor: String
  
  var bordered: Boolean
  
  var children: js.Array[ReactNode | FuncChildren]
  
  var initial: String
}
object TabsStateProps {
  
  inline def apply(
    absolute: Boolean,
    backgroundColor: String,
    bordered: Boolean,
    children: js.Array[ReactNode | FuncChildren],
    initial: String
  ): TabsStateProps = {
    val __obj = js.Dynamic.literal(absolute = absolute.asInstanceOf[js.Any], backgroundColor = backgroundColor.asInstanceOf[js.Any], bordered = bordered.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], initial = initial.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabsStateProps]
  }
  
  extension [Self <: TabsStateProps](x: Self) {
    
    inline def setAbsolute(value: Boolean): Self = StObject.set(x, "absolute", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBordered(value: Boolean): Self = StObject.set(x, "bordered", value.asInstanceOf[js.Any])
    
    inline def setChildren(value: js.Array[ReactNode | FuncChildren]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenVarargs(value: (ReactNode | FuncChildren)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setInitial(value: String): Self = StObject.set(x, "initial", value.asInstanceOf[js.Any])
  }
}

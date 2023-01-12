package typings.storybookComponents.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlexBarProps extends StObject {
  
  var backgroundColor: js.UndefOr[String] = js.undefined
  
  var border: js.UndefOr[Boolean] = js.undefined
  
  var children: js.UndefOr[Any] = js.undefined
}
object FlexBarProps {
  
  inline def apply(): FlexBarProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlexBarProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FlexBarProps] (val x: Self) extends AnyVal {
    
    inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setBorder(value: Boolean): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    inline def setChildren(value: Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
  }
}

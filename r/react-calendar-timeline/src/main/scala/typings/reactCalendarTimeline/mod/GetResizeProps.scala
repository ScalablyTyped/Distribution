package typings.reactCalendarTimeline.mod

import typings.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResizeProps extends StObject {
  
  var leftClassName: js.UndefOr[String] = js.undefined
  
  var leftStyle: js.UndefOr[CSSProperties] = js.undefined
  
  var rightClassName: js.UndefOr[String] = js.undefined
  
  var rightStyle: js.UndefOr[CSSProperties] = js.undefined
}
object GetResizeProps {
  
  inline def apply(): GetResizeProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetResizeProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResizeProps] (val x: Self) extends AnyVal {
    
    inline def setLeftClassName(value: String): Self = StObject.set(x, "leftClassName", value.asInstanceOf[js.Any])
    
    inline def setLeftClassNameUndefined: Self = StObject.set(x, "leftClassName", js.undefined)
    
    inline def setLeftStyle(value: CSSProperties): Self = StObject.set(x, "leftStyle", value.asInstanceOf[js.Any])
    
    inline def setLeftStyleUndefined: Self = StObject.set(x, "leftStyle", js.undefined)
    
    inline def setRightClassName(value: String): Self = StObject.set(x, "rightClassName", value.asInstanceOf[js.Any])
    
    inline def setRightClassNameUndefined: Self = StObject.set(x, "rightClassName", js.undefined)
    
    inline def setRightStyle(value: CSSProperties): Self = StObject.set(x, "rightStyle", value.asInstanceOf[js.Any])
    
    inline def setRightStyleUndefined: Self = StObject.set(x, "rightStyle", js.undefined)
  }
}

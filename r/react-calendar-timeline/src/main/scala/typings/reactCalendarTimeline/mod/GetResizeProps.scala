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
  
  @scala.inline
  def apply(): GetResizeProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetResizeProps]
  }
  
  @scala.inline
  implicit class GetResizePropsMutableBuilder[Self <: GetResizeProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLeftClassName(value: String): Self = StObject.set(x, "leftClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftClassNameUndefined: Self = StObject.set(x, "leftClassName", js.undefined)
    
    @scala.inline
    def setLeftStyle(value: CSSProperties): Self = StObject.set(x, "leftStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftStyleUndefined: Self = StObject.set(x, "leftStyle", js.undefined)
    
    @scala.inline
    def setRightClassName(value: String): Self = StObject.set(x, "rightClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightClassNameUndefined: Self = StObject.set(x, "rightClassName", js.undefined)
    
    @scala.inline
    def setRightStyle(value: CSSProperties): Self = StObject.set(x, "rightStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightStyleUndefined: Self = StObject.set(x, "rightStyle", js.undefined)
  }
}

package typings.reactWindow.mod

import typings.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListChildComponentProps extends StObject {
  
  var data: js.Any
  
  var index: Double
  
  var isScrolling: js.UndefOr[Boolean] = js.undefined
  
  var style: CSSProperties
}
object ListChildComponentProps {
  
  @scala.inline
  def apply(data: js.Any, index: Double, style: CSSProperties): ListChildComponentProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListChildComponentProps]
  }
  
  @scala.inline
  implicit class ListChildComponentPropsMutableBuilder[Self <: ListChildComponentProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsScrolling(value: Boolean): Self = StObject.set(x, "isScrolling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsScrollingUndefined: Self = StObject.set(x, "isScrolling", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}

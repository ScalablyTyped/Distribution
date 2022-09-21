package typings.reactWindow.mod

import typings.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListChildComponentProps[T] extends StObject {
  
  var data: T
  
  var index: Double
  
  var isScrolling: js.UndefOr[Boolean] = js.undefined
  
  var style: CSSProperties
}
object ListChildComponentProps {
  
  inline def apply[T](data: T, index: Double, style: CSSProperties): ListChildComponentProps[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListChildComponentProps[T]]
  }
  
  extension [Self <: ListChildComponentProps[?], T](x: Self & ListChildComponentProps[T]) {
    
    inline def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIsScrolling(value: Boolean): Self = StObject.set(x, "isScrolling", value.asInstanceOf[js.Any])
    
    inline def setIsScrollingUndefined: Self = StObject.set(x, "isScrolling", js.undefined)
    
    inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}

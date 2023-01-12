package typings.reactWindow.mod

import typings.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridChildComponentProps[T] extends StObject {
  
  var columnIndex: Double
  
  var data: T
  
  var isScrolling: js.UndefOr[Boolean] = js.undefined
  
  var rowIndex: Double
  
  var style: CSSProperties
}
object GridChildComponentProps {
  
  inline def apply[T](columnIndex: Double, data: T, rowIndex: Double, style: CSSProperties): GridChildComponentProps[T] = {
    val __obj = js.Dynamic.literal(columnIndex = columnIndex.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridChildComponentProps[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GridChildComponentProps[?], T] (val x: Self & GridChildComponentProps[T]) extends AnyVal {
    
    inline def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
    
    inline def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setIsScrolling(value: Boolean): Self = StObject.set(x, "isScrolling", value.asInstanceOf[js.Any])
    
    inline def setIsScrollingUndefined: Self = StObject.set(x, "isScrolling", js.undefined)
    
    inline def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}

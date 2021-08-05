package typings.reactVirtualized.esTableMod

import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableHeaderRowProps extends StObject {
  
  var className: String
  
  var columns: js.Array[ReactNode]
  
  var height: Double
  
  var scrollbarWidth: Double
  
  var style: CSSProperties
  
  var width: Double
}
object TableHeaderRowProps {
  
  inline def apply(
    className: String,
    columns: js.Array[ReactNode],
    height: Double,
    scrollbarWidth: Double,
    style: CSSProperties,
    width: Double
  ): TableHeaderRowProps = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], columns = columns.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], scrollbarWidth = scrollbarWidth.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableHeaderRowProps]
  }
  
  extension [Self <: TableHeaderRowProps](x: Self) {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setColumns(value: js.Array[ReactNode]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsVarargs(value: ReactNode*): Self = StObject.set(x, "columns", js.Array(value :_*))
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setScrollbarWidth(value: Double): Self = StObject.set(x, "scrollbarWidth", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}

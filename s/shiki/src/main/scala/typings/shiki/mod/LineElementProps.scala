package typings.shiki.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LineElementProps
  extends StObject
     with ElementProps {
  
  var className: String
  
  var index: Double
  
  var line: js.Array[IThemedToken]
  
  var lines: js.Array[js.Array[IThemedToken]]
}
object LineElementProps {
  
  inline def apply(
    children: String,
    className: String,
    index: Double,
    line: js.Array[IThemedToken],
    lines: js.Array[js.Array[IThemedToken]]
  ): LineElementProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], lines = lines.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineElementProps]
  }
  
  extension [Self <: LineElementProps](x: Self) {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setLine(value: js.Array[IThemedToken]): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setLineVarargs(value: IThemedToken*): Self = StObject.set(x, "line", js.Array(value*))
    
    inline def setLines(value: js.Array[js.Array[IThemedToken]]): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
    
    inline def setLinesVarargs(value: js.Array[IThemedToken]*): Self = StObject.set(x, "lines", js.Array(value*))
  }
}

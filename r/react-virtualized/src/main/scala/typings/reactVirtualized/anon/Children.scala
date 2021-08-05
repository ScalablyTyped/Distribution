package typings.reactVirtualized.anon

import typings.react.mod.ReactNode
import typings.react.mod.Requireable
import typings.react.mod.Validator
import typings.reactVirtualized.esColumnSizerMod.SizedColumnProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Children extends StObject {
  
  var children: Validator[js.Function1[/* props */ SizedColumnProps, ReactNode]]
  
  var columnCount: Validator[Double]
  
  var columnMaxWidth: Requireable[Double]
  
  var columnMinWidth: Requireable[Double]
  
  var width: Validator[Double]
}
object Children {
  
  inline def apply(
    children: Validator[js.Function1[/* props */ SizedColumnProps, ReactNode]],
    columnCount: Validator[Double],
    columnMaxWidth: Requireable[Double],
    columnMinWidth: Requireable[Double],
    width: Validator[Double]
  ): Children = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], columnCount = columnCount.asInstanceOf[js.Any], columnMaxWidth = columnMaxWidth.asInstanceOf[js.Any], columnMinWidth = columnMinWidth.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Children]
  }
  
  extension [Self <: Children](x: Self) {
    
    inline def setChildren(value: Validator[js.Function1[/* props */ SizedColumnProps, ReactNode]]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setColumnCount(value: Validator[Double]): Self = StObject.set(x, "columnCount", value.asInstanceOf[js.Any])
    
    inline def setColumnMaxWidth(value: Requireable[Double]): Self = StObject.set(x, "columnMaxWidth", value.asInstanceOf[js.Any])
    
    inline def setColumnMinWidth(value: Requireable[Double]): Self = StObject.set(x, "columnMinWidth", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Validator[Double]): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}

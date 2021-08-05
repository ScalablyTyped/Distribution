package typings.reactNativeSvgCharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessorFunctionProps[T] extends StObject {
  
  var index: Double
  
  var item: T
}
object AccessorFunctionProps {
  
  inline def apply[T](index: Double, item: T): AccessorFunctionProps[T] = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessorFunctionProps[T]]
  }
  
  extension [Self <: AccessorFunctionProps[?], T](x: Self & AccessorFunctionProps[T]) {
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setItem(value: T): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
  }
}

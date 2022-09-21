package typings.splitpanes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaneComputed extends StObject {
  
  def maxSizeNumber(): Double
  
  def minSizeNumber(): Double
  
  def sizeNumber(): Double | Null
}
object PaneComputed {
  
  inline def apply(maxSizeNumber: () => Double, minSizeNumber: () => Double, sizeNumber: () => Double | Null): PaneComputed = {
    val __obj = js.Dynamic.literal(maxSizeNumber = js.Any.fromFunction0(maxSizeNumber), minSizeNumber = js.Any.fromFunction0(minSizeNumber), sizeNumber = js.Any.fromFunction0(sizeNumber))
    __obj.asInstanceOf[PaneComputed]
  }
  
  extension [Self <: PaneComputed](x: Self) {
    
    inline def setMaxSizeNumber(value: () => Double): Self = StObject.set(x, "maxSizeNumber", js.Any.fromFunction0(value))
    
    inline def setMinSizeNumber(value: () => Double): Self = StObject.set(x, "minSizeNumber", js.Any.fromFunction0(value))
    
    inline def setSizeNumber(value: () => Double | Null): Self = StObject.set(x, "sizeNumber", js.Any.fromFunction0(value))
  }
}

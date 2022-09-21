package typings.splitpanes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaneWatch extends StObject {
  
  def maxSizeNumber(max: Double): Unit
  
  def minSizeNumber(min: Double): Unit
  
  def sizeNumber(size: Double): Unit
}
object PaneWatch {
  
  inline def apply(maxSizeNumber: Double => Unit, minSizeNumber: Double => Unit, sizeNumber: Double => Unit): PaneWatch = {
    val __obj = js.Dynamic.literal(maxSizeNumber = js.Any.fromFunction1(maxSizeNumber), minSizeNumber = js.Any.fromFunction1(minSizeNumber), sizeNumber = js.Any.fromFunction1(sizeNumber))
    __obj.asInstanceOf[PaneWatch]
  }
  
  extension [Self <: PaneWatch](x: Self) {
    
    inline def setMaxSizeNumber(value: Double => Unit): Self = StObject.set(x, "maxSizeNumber", js.Any.fromFunction1(value))
    
    inline def setMinSizeNumber(value: Double => Unit): Self = StObject.set(x, "minSizeNumber", js.Any.fromFunction1(value))
    
    inline def setSizeNumber(value: Double => Unit): Self = StObject.set(x, "sizeNumber", js.Any.fromFunction1(value))
  }
}

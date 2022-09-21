package typings.reactShare.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Count extends StObject {
  
  def count(index: Double, count: Double): Unit
}
object Count {
  
  inline def apply(count: (Double, Double) => Unit): Count = {
    val __obj = js.Dynamic.literal(count = js.Any.fromFunction2(count))
    __obj.asInstanceOf[Count]
  }
  
  extension [Self <: Count](x: Self) {
    
    inline def setCount(value: (Double, Double) => Unit): Self = StObject.set(x, "count", js.Any.fromFunction2(value))
  }
}

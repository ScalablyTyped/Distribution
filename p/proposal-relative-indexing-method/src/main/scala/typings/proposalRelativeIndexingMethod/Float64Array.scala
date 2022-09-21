package typings.proposalRelativeIndexingMethod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Float64Array extends StObject {
  
  /**
    * Takes an integer value and returns the item at that index,
    * allowing for positive and negative integers.
    * Negative integers count back from the last item in the array.
    */
  def at(index: Double): js.UndefOr[Double]
}
object Float64Array {
  
  inline def apply(at: Double => js.UndefOr[Double]): Float64Array = {
    val __obj = js.Dynamic.literal(at = js.Any.fromFunction1(at))
    __obj.asInstanceOf[Float64Array]
  }
  
  extension [Self <: Float64Array](x: Self) {
    
    inline def setAt(value: Double => js.UndefOr[Double]): Self = StObject.set(x, "at", js.Any.fromFunction1(value))
  }
}

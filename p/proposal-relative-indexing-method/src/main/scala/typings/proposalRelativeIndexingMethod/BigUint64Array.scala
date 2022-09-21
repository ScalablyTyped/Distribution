package typings.proposalRelativeIndexingMethod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BigUint64Array extends StObject {
  
  /**
    * Takes an integer value and returns the item at that index,
    * allowing for positive and negative integers.
    * Negative integers count back from the last item in the array.
    */
  def at(index: Double): js.UndefOr[Double]
}
object BigUint64Array {
  
  inline def apply(at: Double => js.UndefOr[Double]): BigUint64Array = {
    val __obj = js.Dynamic.literal(at = js.Any.fromFunction1(at))
    __obj.asInstanceOf[BigUint64Array]
  }
  
  extension [Self <: BigUint64Array](x: Self) {
    
    inline def setAt(value: Double => js.UndefOr[Double]): Self = StObject.set(x, "at", js.Any.fromFunction1(value))
  }
}

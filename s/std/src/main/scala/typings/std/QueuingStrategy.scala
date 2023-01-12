package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueuingStrategy[T] extends StObject {
  
  /* standard dom */
  var highWaterMark: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var size: js.UndefOr[QueuingStrategySize[T]] = js.undefined
}
object QueuingStrategy {
  
  inline def apply[T](): QueuingStrategy[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueuingStrategy[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueuingStrategy[?], T] (val x: Self & QueuingStrategy[T]) extends AnyVal {
    
    inline def setHighWaterMark(value: Double): Self = StObject.set(x, "highWaterMark", value.asInstanceOf[js.Any])
    
    inline def setHighWaterMarkUndefined: Self = StObject.set(x, "highWaterMark", js.undefined)
    
    inline def setSize(value: T => Double): Self = StObject.set(x, "size", js.Any.fromFunction1(value))
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}

package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This Streams API interface provides a built-in byte length queuing strategy that can be used when constructing streams. */
trait CountQueuingStrategy
  extends StObject
     with QueuingStrategy[Any] {
  
  /* standard dom */
  @JSName("highWaterMark")
  val highWaterMark_CountQueuingStrategy: Double
  
  /* standard dom */
  @JSName("size")
  def size_MCountQueuingStrategy(chunk: Any): Double
}
object CountQueuingStrategy {
  
  inline def apply(highWaterMark: Double, size: Any => Double): CountQueuingStrategy = {
    val __obj = js.Dynamic.literal(highWaterMark = highWaterMark.asInstanceOf[js.Any], size = js.Any.fromFunction1(size))
    __obj.asInstanceOf[CountQueuingStrategy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CountQueuingStrategy] (val x: Self) extends AnyVal {
    
    inline def setHighWaterMark(value: Double): Self = StObject.set(x, "highWaterMark", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Any => Double): Self = StObject.set(x, "size", js.Any.fromFunction1(value))
  }
}

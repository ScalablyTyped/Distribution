package typings.std

import typings.std.stdNumbers.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This Streams API interface provides a built-in byte length queuing strategy that can be used when constructing streams. */
@js.native
trait CountQueuingStrategy
  extends QueuingStrategy[js.Any] {
  
  @JSName("highWaterMark")
  var highWaterMark_CountQueuingStrategy: Double = js.native
  
  @JSName("size")
  def size_MCountQueuingStrategy(chunk: js.Any): `1` = js.native
}
object CountQueuingStrategy {
  
  @scala.inline
  def apply(highWaterMark: Double, size: js.Any => `1`): CountQueuingStrategy = {
    val __obj = js.Dynamic.literal(highWaterMark = highWaterMark.asInstanceOf[js.Any], size = js.Any.fromFunction1(size))
    __obj.asInstanceOf[CountQueuingStrategy]
  }
  
  @scala.inline
  implicit class CountQueuingStrategyMutableBuilder[Self <: CountQueuingStrategy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHighWaterMark(value: Double): Self = StObject.set(x, "highWaterMark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: js.Any => `1`): Self = StObject.set(x, "size", js.Any.fromFunction1(value))
  }
}

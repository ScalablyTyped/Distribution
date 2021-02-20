package typings.rascal.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Counter extends StObject {
  
  var counter: String = js.native
  
  var limit: Double = js.native
  
  var timeout: js.UndefOr[Double] = js.native
}
object Counter {
  
  @scala.inline
  def apply(counter: String, limit: Double): Counter = {
    val __obj = js.Dynamic.literal(counter = counter.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Counter]
  }
  
  @scala.inline
  implicit class CounterMutableBuilder[Self <: Counter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCounter(value: String): Self = StObject.set(x, "counter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}

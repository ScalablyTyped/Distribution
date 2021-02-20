package typings.stellarBase.anon

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Counter extends StObject {
  
  var counter: Double = js.native
  
  var value: Buffer = js.native
}
object Counter {
  
  @scala.inline
  def apply(counter: Double, value: Buffer): Counter = {
    val __obj = js.Dynamic.literal(counter = counter.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Counter]
  }
  
  @scala.inline
  implicit class CounterMutableBuilder[Self <: Counter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCounter(value: Double): Self = StObject.set(x, "counter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Buffer): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}

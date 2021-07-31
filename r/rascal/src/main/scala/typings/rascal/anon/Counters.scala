package typings.rascal.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Counters extends StObject {
  
  var counters: InMemory
}
object Counters {
  
  @scala.inline
  def apply(counters: InMemory): Counters = {
    val __obj = js.Dynamic.literal(counters = counters.asInstanceOf[js.Any])
    __obj.asInstanceOf[Counters]
  }
  
  @scala.inline
  implicit class CountersMutableBuilder[Self <: Counters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCounters(value: InMemory): Self = StObject.set(x, "counters", value.asInstanceOf[js.Any])
  }
}

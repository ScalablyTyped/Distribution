package typings.redisSearch.distCommandsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChildIterator extends StObject {
  
  var childIterators: js.UndefOr[js.Array[ChildIterator]] = js.undefined
  
  var counter: js.UndefOr[Double] = js.undefined
  
  var size: js.UndefOr[Double] = js.undefined
  
  var term: js.UndefOr[String] = js.undefined
  
  var time: js.UndefOr[String] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object ChildIterator {
  
  inline def apply(): ChildIterator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChildIterator]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChildIterator] (val x: Self) extends AnyVal {
    
    inline def setChildIterators(value: js.Array[ChildIterator]): Self = StObject.set(x, "childIterators", value.asInstanceOf[js.Any])
    
    inline def setChildIteratorsUndefined: Self = StObject.set(x, "childIterators", js.undefined)
    
    inline def setChildIteratorsVarargs(value: ChildIterator*): Self = StObject.set(x, "childIterators", js.Array(value*))
    
    inline def setCounter(value: Double): Self = StObject.set(x, "counter", value.asInstanceOf[js.Any])
    
    inline def setCounterUndefined: Self = StObject.set(x, "counter", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setTerm(value: String): Self = StObject.set(x, "term", value.asInstanceOf[js.Any])
    
    inline def setTermUndefined: Self = StObject.set(x, "term", js.undefined)
    
    inline def setTime(value: String): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}

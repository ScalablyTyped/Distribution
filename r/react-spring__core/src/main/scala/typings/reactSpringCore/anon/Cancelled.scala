package typings.reactSpringCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cancelled extends StObject {
  
  var cancelled: Boolean
  
  var finished: Boolean
  
  var noop: Boolean
  
  var value: Any
}
object Cancelled {
  
  inline def apply(cancelled: Boolean, finished: Boolean, noop: Boolean, value: Any): Cancelled = {
    val __obj = js.Dynamic.literal(cancelled = cancelled.asInstanceOf[js.Any], finished = finished.asInstanceOf[js.Any], noop = noop.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cancelled]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Cancelled] (val x: Self) extends AnyVal {
    
    inline def setCancelled(value: Boolean): Self = StObject.set(x, "cancelled", value.asInstanceOf[js.Any])
    
    inline def setFinished(value: Boolean): Self = StObject.set(x, "finished", value.asInstanceOf[js.Any])
    
    inline def setNoop(value: Boolean): Self = StObject.set(x, "noop", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}

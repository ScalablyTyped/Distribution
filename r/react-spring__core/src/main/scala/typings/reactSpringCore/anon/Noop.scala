package typings.reactSpringCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Noop extends StObject {
  
  var cancelled: Boolean
  
  var finished: Boolean
  
  var noop: Boolean
  
  var value: Any
}
object Noop {
  
  inline def apply(cancelled: Boolean, finished: Boolean, noop: Boolean, value: Any): Noop = {
    val __obj = js.Dynamic.literal(cancelled = cancelled.asInstanceOf[js.Any], finished = finished.asInstanceOf[js.Any], noop = noop.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Noop]
  }
  
  extension [Self <: Noop](x: Self) {
    
    inline def setCancelled(value: Boolean): Self = StObject.set(x, "cancelled", value.asInstanceOf[js.Any])
    
    inline def setFinished(value: Boolean): Self = StObject.set(x, "finished", value.asInstanceOf[js.Any])
    
    inline def setNoop(value: Boolean): Self = StObject.set(x, "noop", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}

package typings.sentryBrowser.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Elapsedsincestartns extends StObject {
  
  var elapsed_since_start_ns: String
  
  var stack_id: Double
  
  var thread_id: String
}
object Elapsedsincestartns {
  
  inline def apply(elapsed_since_start_ns: String, stack_id: Double, thread_id: String): Elapsedsincestartns = {
    val __obj = js.Dynamic.literal(elapsed_since_start_ns = elapsed_since_start_ns.asInstanceOf[js.Any], stack_id = stack_id.asInstanceOf[js.Any], thread_id = thread_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Elapsedsincestartns]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Elapsedsincestartns] (val x: Self) extends AnyVal {
    
    inline def setElapsed_since_start_ns(value: String): Self = StObject.set(x, "elapsed_since_start_ns", value.asInstanceOf[js.Any])
    
    inline def setStack_id(value: Double): Self = StObject.set(x, "stack_id", value.asInstanceOf[js.Any])
    
    inline def setThread_id(value: String): Self = StObject.set(x, "thread_id", value.asInstanceOf[js.Any])
  }
}

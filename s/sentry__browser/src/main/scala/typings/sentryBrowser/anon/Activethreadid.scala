package typings.sentryBrowser.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Activethreadid extends StObject {
  
  var active_thread_id: String
  
  var id: String
  
  var name: String
  
  var relative_end_ns: String
  
  var relative_start_ns: String
  
  var trace_id: String
}
object Activethreadid {
  
  inline def apply(
    active_thread_id: String,
    id: String,
    name: String,
    relative_end_ns: String,
    relative_start_ns: String,
    trace_id: String
  ): Activethreadid = {
    val __obj = js.Dynamic.literal(active_thread_id = active_thread_id.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], relative_end_ns = relative_end_ns.asInstanceOf[js.Any], relative_start_ns = relative_start_ns.asInstanceOf[js.Any], trace_id = trace_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Activethreadid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Activethreadid] (val x: Self) extends AnyVal {
    
    inline def setActive_thread_id(value: String): Self = StObject.set(x, "active_thread_id", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRelative_end_ns(value: String): Self = StObject.set(x, "relative_end_ns", value.asInstanceOf[js.Any])
    
    inline def setRelative_start_ns(value: String): Self = StObject.set(x, "relative_start_ns", value.asInstanceOf[js.Any])
    
    inline def setTrace_id(value: String): Self = StObject.set(x, "trace_id", value.asInstanceOf[js.Any])
  }
}

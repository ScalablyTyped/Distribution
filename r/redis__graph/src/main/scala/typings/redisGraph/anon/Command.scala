package typings.redisGraph.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Command extends StObject {
  
  var command: String
  
  var query: String
  
  var timestamp: js.Date
  
  var took: Double
}
object Command {
  
  inline def apply(command: String, query: String, timestamp: js.Date, took: Double): Command = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], took = took.asInstanceOf[js.Any])
    __obj.asInstanceOf[Command]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Command] (val x: Self) extends AnyVal {
    
    inline def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: js.Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTook(value: Double): Self = StObject.set(x, "took", value.asInstanceOf[js.Any])
  }
}

package typings.puppeteerCore.anon

import typings.puppeteerCore.queryHandlerMod.InternalQueryHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryHandler extends StObject {
  
  var queryHandler: InternalQueryHandler
  
  var updatedSelector: String
}
object QueryHandler {
  
  inline def apply(queryHandler: InternalQueryHandler, updatedSelector: String): QueryHandler = {
    val __obj = js.Dynamic.literal(queryHandler = queryHandler.asInstanceOf[js.Any], updatedSelector = updatedSelector.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryHandler]
  }
  
  extension [Self <: QueryHandler](x: Self) {
    
    inline def setQueryHandler(value: InternalQueryHandler): Self = StObject.set(x, "queryHandler", value.asInstanceOf[js.Any])
    
    inline def setUpdatedSelector(value: String): Self = StObject.set(x, "updatedSelector", value.asInstanceOf[js.Any])
  }
}

package typings.puppeteerCore.anon

import typings.puppeteerCore.commonQueryHandlerMod.InternalQueryHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdatedSelector extends StObject {
  
  var queryHandler: InternalQueryHandler
  
  var updatedSelector: String
}
object UpdatedSelector {
  
  @scala.inline
  def apply(queryHandler: InternalQueryHandler, updatedSelector: String): UpdatedSelector = {
    val __obj = js.Dynamic.literal(queryHandler = queryHandler.asInstanceOf[js.Any], updatedSelector = updatedSelector.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatedSelector]
  }
  
  @scala.inline
  implicit class UpdatedSelectorMutableBuilder[Self <: UpdatedSelector] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQueryHandler(value: InternalQueryHandler): Self = StObject.set(x, "queryHandler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedSelector(value: String): Self = StObject.set(x, "updatedSelector", value.asInstanceOf[js.Any])
  }
}

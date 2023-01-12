package typings.puppeteerCore.anon

import typings.puppeteerCore.libEsmPuppeteerCommonQueryHandlerMod.PuppeteerQueryHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdatedSelector extends StObject {
  
  var queryHandler: PuppeteerQueryHandler
  
  var updatedSelector: String
}
object UpdatedSelector {
  
  inline def apply(queryHandler: PuppeteerQueryHandler, updatedSelector: String): UpdatedSelector = {
    val __obj = js.Dynamic.literal(queryHandler = queryHandler.asInstanceOf[js.Any], updatedSelector = updatedSelector.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatedSelector]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdatedSelector] (val x: Self) extends AnyVal {
    
    inline def setQueryHandler(value: PuppeteerQueryHandler): Self = StObject.set(x, "queryHandler", value.asInstanceOf[js.Any])
    
    inline def setUpdatedSelector(value: String): Self = StObject.set(x, "updatedSelector", value.asInstanceOf[js.Any])
  }
}

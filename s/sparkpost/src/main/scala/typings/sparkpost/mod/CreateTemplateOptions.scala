package typings.sparkpost.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTemplateOptions extends StObject {
  
  /** Enable or disable click tracking */
  var click_tracking: js.UndefOr[Boolean] = js.undefined
  
  /** Enable or disable open tracking */
  var open_tracking: js.UndefOr[Boolean] = js.undefined
  
  /** Distinguish between transactional and non-transactional messages for unsubscribe and suppression purposes */
  var transactional: js.UndefOr[Boolean] = js.undefined
}
object CreateTemplateOptions {
  
  inline def apply(): CreateTemplateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateTemplateOptions]
  }
  
  extension [Self <: CreateTemplateOptions](x: Self) {
    
    inline def setClick_tracking(value: Boolean): Self = StObject.set(x, "click_tracking", value.asInstanceOf[js.Any])
    
    inline def setClick_trackingUndefined: Self = StObject.set(x, "click_tracking", js.undefined)
    
    inline def setOpen_tracking(value: Boolean): Self = StObject.set(x, "open_tracking", value.asInstanceOf[js.Any])
    
    inline def setOpen_trackingUndefined: Self = StObject.set(x, "open_tracking", js.undefined)
    
    inline def setTransactional(value: Boolean): Self = StObject.set(x, "transactional", value.asInstanceOf[js.Any])
    
    inline def setTransactionalUndefined: Self = StObject.set(x, "transactional", js.undefined)
  }
}

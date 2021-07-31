package typings.sparkpost.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TemplateOptions extends StObject {
  
  /** Enable or disable click tracking */
  var click_tracking: Boolean
  
  /** Enable or disable open tracking */
  var open_tracking: Boolean
  
  /** Distinguish between transactional and non-transactional messages for unsubscribe and suppression purposes */
  var transactional: Boolean
}
object TemplateOptions {
  
  @scala.inline
  def apply(click_tracking: Boolean, open_tracking: Boolean, transactional: Boolean): TemplateOptions = {
    val __obj = js.Dynamic.literal(click_tracking = click_tracking.asInstanceOf[js.Any], open_tracking = open_tracking.asInstanceOf[js.Any], transactional = transactional.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateOptions]
  }
  
  @scala.inline
  implicit class TemplateOptionsMutableBuilder[Self <: TemplateOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClick_tracking(value: Boolean): Self = StObject.set(x, "click_tracking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpen_tracking(value: Boolean): Self = StObject.set(x, "open_tracking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactional(value: Boolean): Self = StObject.set(x, "transactional", value.asInstanceOf[js.Any])
  }
}

package typings.ractive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObserverBaseOpts extends StObject {
  
  /**
  	 * The context to be used for the callback.
  	 */
  var context: js.UndefOr[Any] = js.undefined
  
  /**
  	 * Whether or not to defer calling the callback until after the DOM has been updated.
  	 */
  var defer: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Whether or not to call the callback with the initial value.
  	 */
  var init: js.UndefOr[Boolean] = js.undefined
}
object ObserverBaseOpts {
  
  inline def apply(): ObserverBaseOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObserverBaseOpts]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ObserverBaseOpts] (val x: Self) extends AnyVal {
    
    inline def setContext(value: Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setDefer(value: Boolean): Self = StObject.set(x, "defer", value.asInstanceOf[js.Any])
    
    inline def setDeferUndefined: Self = StObject.set(x, "defer", js.undefined)
    
    inline def setInit(value: Boolean): Self = StObject.set(x, "init", value.asInstanceOf[js.Any])
    
    inline def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
  }
}

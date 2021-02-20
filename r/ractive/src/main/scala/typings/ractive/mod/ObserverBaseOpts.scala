package typings.ractive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObserverBaseOpts extends StObject {
  
  /**
  	 * The context to be used for the callback.
  	 */
  var context: js.UndefOr[js.Any] = js.native
  
  /**
  	 * Whether or not to defer calling the callback until after the DOM has been updated.
  	 */
  var defer: js.UndefOr[Boolean] = js.native
  
  /**
  	 * Whether or not to call the callback with the initial value.
  	 */
  var init: js.UndefOr[Boolean] = js.native
}
object ObserverBaseOpts {
  
  @scala.inline
  def apply(): ObserverBaseOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObserverBaseOpts]
  }
  
  @scala.inline
  implicit class ObserverBaseOptsMutableBuilder[Self <: ObserverBaseOpts] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContext(value: js.Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    @scala.inline
    def setDefer(value: Boolean): Self = StObject.set(x, "defer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeferUndefined: Self = StObject.set(x, "defer", js.undefined)
    
    @scala.inline
    def setInit(value: Boolean): Self = StObject.set(x, "init", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
  }
}

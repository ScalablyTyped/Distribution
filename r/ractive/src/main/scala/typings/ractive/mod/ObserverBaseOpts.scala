package typings.ractive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObserverBaseOpts extends js.Object {
  
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
  implicit class ObserverBaseOptsOps[Self <: ObserverBaseOpts] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setContext(value: js.Any): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    
    @scala.inline
    def setDefer(value: Boolean): Self = this.set("defer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefer: Self = this.set("defer", js.undefined)
    
    @scala.inline
    def setInit(value: Boolean): Self = this.set("init", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInit: Self = this.set("init", js.undefined)
  }
}

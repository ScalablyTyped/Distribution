package typings.sentryBrowser.globalhandlersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** JSDoc */
@js.native
trait GlobalHandlersIntegrations extends js.Object {
  
  var onerror: Boolean = js.native
  
  var onunhandledrejection: Boolean = js.native
}
object GlobalHandlersIntegrations {
  
  @scala.inline
  def apply(onerror: Boolean, onunhandledrejection: Boolean): GlobalHandlersIntegrations = {
    val __obj = js.Dynamic.literal(onerror = onerror.asInstanceOf[js.Any], onunhandledrejection = onunhandledrejection.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalHandlersIntegrations]
  }
  
  @scala.inline
  implicit class GlobalHandlersIntegrationsOps[Self <: GlobalHandlersIntegrations] (val x: Self) extends AnyVal {
    
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
    def setOnerror(value: Boolean): Self = this.set("onerror", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnunhandledrejection(value: Boolean): Self = this.set("onunhandledrejection", value.asInstanceOf[js.Any])
  }
}

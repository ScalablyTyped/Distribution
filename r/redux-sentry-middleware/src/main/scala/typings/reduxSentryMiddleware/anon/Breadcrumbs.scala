package typings.reduxSentryMiddleware.anon

import typings.sentryBrowser.anon.TypeofBreadcrumbs
import typings.sentryBrowser.anon.TypeofCoreIntegrations
import typings.sentryBrowser.anon.TypeofCoreIntegrationsInstantiable
import typings.sentryBrowser.anon.TypeofGlobalHandlers
import typings.sentryBrowser.anon.TypeofLinkedErrors
import typings.sentryBrowser.anon.TypeofTryCatch
import typings.sentryBrowser.anon.TypeofUserAgent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Breadcrumbs extends js.Object {
  
  var Breadcrumbs: TypeofBreadcrumbs = js.native
  
  var FunctionToString: TypeofCoreIntegrations = js.native
  
  var GlobalHandlers: TypeofGlobalHandlers = js.native
  
  var InboundFilters: TypeofCoreIntegrationsInstantiable = js.native
  
  var LinkedErrors: TypeofLinkedErrors = js.native
  
  var TryCatch: TypeofTryCatch = js.native
  
  var UserAgent: TypeofUserAgent = js.native
}
object Breadcrumbs {
  
  @scala.inline
  def apply(
    Breadcrumbs: TypeofBreadcrumbs,
    FunctionToString: TypeofCoreIntegrations,
    GlobalHandlers: TypeofGlobalHandlers,
    InboundFilters: TypeofCoreIntegrationsInstantiable,
    LinkedErrors: TypeofLinkedErrors,
    TryCatch: TypeofTryCatch,
    UserAgent: TypeofUserAgent
  ): Breadcrumbs = {
    val __obj = js.Dynamic.literal(Breadcrumbs = Breadcrumbs.asInstanceOf[js.Any], FunctionToString = FunctionToString.asInstanceOf[js.Any], GlobalHandlers = GlobalHandlers.asInstanceOf[js.Any], InboundFilters = InboundFilters.asInstanceOf[js.Any], LinkedErrors = LinkedErrors.asInstanceOf[js.Any], TryCatch = TryCatch.asInstanceOf[js.Any], UserAgent = UserAgent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Breadcrumbs]
  }
  
  @scala.inline
  implicit class BreadcrumbsOps[Self <: Breadcrumbs] (val x: Self) extends AnyVal {
    
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
    def setBreadcrumbs(value: TypeofBreadcrumbs): Self = this.set("Breadcrumbs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFunctionToString(value: TypeofCoreIntegrations): Self = this.set("FunctionToString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalHandlers(value: TypeofGlobalHandlers): Self = this.set("GlobalHandlers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInboundFilters(value: TypeofCoreIntegrationsInstantiable): Self = this.set("InboundFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkedErrors(value: TypeofLinkedErrors): Self = this.set("LinkedErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTryCatch(value: TypeofTryCatch): Self = this.set("TryCatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserAgent(value: TypeofUserAgent): Self = this.set("UserAgent", value.asInstanceOf[js.Any])
  }
}

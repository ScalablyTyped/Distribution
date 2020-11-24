package typings.sentryUtils.anon

import typings.sentryTypes.integrationMod.Integration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Integrations extends js.Object {
  
  var Integrations: js.UndefOr[js.Array[Integration]] = js.native
}
object Integrations {
  
  @scala.inline
  def apply(): Integrations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Integrations]
  }
  
  @scala.inline
  implicit class IntegrationsOps[Self <: Integrations] (val x: Self) extends AnyVal {
    
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
    def setIntegrationsVarargs(value: Integration*): Self = this.set("Integrations", js.Array(value :_*))
    
    @scala.inline
    def setIntegrations(value: js.Array[Integration]): Self = this.set("Integrations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIntegrations: Self = this.set("Integrations", js.undefined)
  }
}

package typings.pulumiAws.inputMod.worklink

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FleetIdentityProvider extends js.Object {
  
  /**
    * The SAML metadata document provided by the customer’s identity provider.
    */
  var samlMetadata: Input[String] = js.native
  
  /**
    * The type of identity provider.
    */
  var `type`: Input[String] = js.native
}
object FleetIdentityProvider {
  
  @scala.inline
  def apply(samlMetadata: Input[String], `type`: Input[String]): FleetIdentityProvider = {
    val __obj = js.Dynamic.literal(samlMetadata = samlMetadata.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FleetIdentityProvider]
  }
  
  @scala.inline
  implicit class FleetIdentityProviderOps[Self <: FleetIdentityProvider] (val x: Self) extends AnyVal {
    
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
    def setSamlMetadata(value: Input[String]): Self = this.set("samlMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Input[String]): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}

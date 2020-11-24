package typings.pulumiAws.inputMod.eks

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClusterIdentityOidc extends js.Object {
  
  /**
    * Issuer URL for the OpenID Connect identity provider.
    */
  var issuer: js.UndefOr[Input[String]] = js.native
}
object ClusterIdentityOidc {
  
  @scala.inline
  def apply(): ClusterIdentityOidc = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterIdentityOidc]
  }
  
  @scala.inline
  implicit class ClusterIdentityOidcOps[Self <: ClusterIdentityOidc] (val x: Self) extends AnyVal {
    
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
    def setIssuer(value: Input[String]): Self = this.set("issuer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIssuer: Self = this.set("issuer", js.undefined)
  }
}

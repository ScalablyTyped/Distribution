package typings.pulumiAws.ecrGetAuthorizationTokenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetAuthorizationTokenArgs extends js.Object {
  
  /**
    * AWS account ID of the ECR Repository. If not specified the default account is assumed.
    */
  val registryId: js.UndefOr[String] = js.native
}
object GetAuthorizationTokenArgs {
  
  @scala.inline
  def apply(): GetAuthorizationTokenArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAuthorizationTokenArgs]
  }
  
  @scala.inline
  implicit class GetAuthorizationTokenArgsOps[Self <: GetAuthorizationTokenArgs] (val x: Self) extends AnyVal {
    
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
    def setRegistryId(value: String): Self = this.set("registryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegistryId: Self = this.set("registryId", js.undefined)
  }
}

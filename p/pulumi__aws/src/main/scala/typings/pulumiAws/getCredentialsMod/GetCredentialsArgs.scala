package typings.pulumiAws.getCredentialsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetCredentialsArgs extends js.Object {
  
  val registryId: String = js.native
}
object GetCredentialsArgs {
  
  @scala.inline
  def apply(registryId: String): GetCredentialsArgs = {
    val __obj = js.Dynamic.literal(registryId = registryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCredentialsArgs]
  }
  
  @scala.inline
  implicit class GetCredentialsArgsOps[Self <: GetCredentialsArgs] (val x: Self) extends AnyVal {
    
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
  }
}

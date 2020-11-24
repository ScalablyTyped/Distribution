package typings.pulumiAws.getSecretMod

import typings.pulumiAws.inputMod.kms.GetSecretSecret
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSecretArgs extends js.Object {
  
  val secrets: js.Array[GetSecretSecret] = js.native
}
object GetSecretArgs {
  
  @scala.inline
  def apply(secrets: js.Array[GetSecretSecret]): GetSecretArgs = {
    val __obj = js.Dynamic.literal(secrets = secrets.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSecretArgs]
  }
  
  @scala.inline
  implicit class GetSecretArgsOps[Self <: GetSecretArgs] (val x: Self) extends AnyVal {
    
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
    def setSecretsVarargs(value: GetSecretSecret*): Self = this.set("secrets", js.Array(value :_*))
    
    @scala.inline
    def setSecrets(value: js.Array[GetSecretSecret]): Self = this.set("secrets", value.asInstanceOf[js.Any])
  }
}

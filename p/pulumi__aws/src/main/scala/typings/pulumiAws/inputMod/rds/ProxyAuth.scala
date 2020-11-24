package typings.pulumiAws.inputMod.rds

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProxyAuth extends js.Object {
  
  /**
    * The type of authentication that the proxy uses for connections from the proxy to the underlying database. One of `SECRETS`.
    */
  var authScheme: js.UndefOr[Input[String]] = js.native
  
  /**
    * A user-specified description about the authentication used by a proxy to log in as a specific database user.
    */
  var description: js.UndefOr[Input[String]] = js.native
  
  /**
    * Whether to require or disallow AWS Identity and Access Management (IAM) authentication for connections to the proxy. One of `DISABLED`, `REQUIRED`.
    */
  var iamAuth: js.UndefOr[Input[String]] = js.native
  
  /**
    * The Amazon Resource Name (ARN) representing the secret that the proxy uses to authenticate to the RDS DB instance or Aurora DB cluster. These secrets are stored within Amazon Secrets Manager.
    */
  var secretArn: js.UndefOr[Input[String]] = js.native
}
object ProxyAuth {
  
  @scala.inline
  def apply(): ProxyAuth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProxyAuth]
  }
  
  @scala.inline
  implicit class ProxyAuthOps[Self <: ProxyAuth] (val x: Self) extends AnyVal {
    
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
    def setAuthScheme(value: Input[String]): Self = this.set("authScheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthScheme: Self = this.set("authScheme", js.undefined)
    
    @scala.inline
    def setDescription(value: Input[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setIamAuth(value: Input[String]): Self = this.set("iamAuth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIamAuth: Self = this.set("iamAuth", js.undefined)
    
    @scala.inline
    def setSecretArn(value: Input[String]): Self = this.set("secretArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecretArn: Self = this.set("secretArn", js.undefined)
  }
}

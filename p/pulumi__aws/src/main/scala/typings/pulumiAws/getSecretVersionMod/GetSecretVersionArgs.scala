package typings.pulumiAws.getSecretVersionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSecretVersionArgs extends js.Object {
  
  /**
    * Specifies the secret containing the version that you want to retrieve. You can specify either the Amazon Resource Name (ARN) or the friendly name of the secret.
    */
  val secretId: String = js.native
  
  /**
    * Specifies the unique identifier of the version of the secret that you want to retrieve. Overrides `versionStage`.
    */
  val versionId: js.UndefOr[String] = js.native
  
  /**
    * Specifies the secret version that you want to retrieve by the staging label attached to the version. Defaults to `AWSCURRENT`.
    */
  val versionStage: js.UndefOr[String] = js.native
}
object GetSecretVersionArgs {
  
  @scala.inline
  def apply(secretId: String): GetSecretVersionArgs = {
    val __obj = js.Dynamic.literal(secretId = secretId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSecretVersionArgs]
  }
  
  @scala.inline
  implicit class GetSecretVersionArgsOps[Self <: GetSecretVersionArgs] (val x: Self) extends AnyVal {
    
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
    def setSecretId(value: String): Self = this.set("secretId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionId(value: String): Self = this.set("versionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersionId: Self = this.set("versionId", js.undefined)
    
    @scala.inline
    def setVersionStage(value: String): Self = this.set("versionStage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersionStage: Self = this.set("versionStage", js.undefined)
  }
}

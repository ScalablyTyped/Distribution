package typings.pulumiAws.getSecretVersionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSecretVersionResult extends js.Object {
  
  /**
    * The ARN of the secret.
    */
  val arn: String = js.native
  
  /**
    * The provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  
  /**
    * The decrypted part of the protected secret information that was originally provided as a binary. Base64 encoded.
    */
  val secretBinary: String = js.native
  
  val secretId: String = js.native
  
  /**
    * The decrypted part of the protected secret information that was originally provided as a string.
    */
  val secretString: String = js.native
  
  /**
    * The unique identifier of this version of the secret.
    */
  val versionId: String = js.native
  
  val versionStage: js.UndefOr[String] = js.native
  
  val versionStages: js.Array[String] = js.native
}
object GetSecretVersionResult {
  
  @scala.inline
  def apply(
    arn: String,
    id: String,
    secretBinary: String,
    secretId: String,
    secretString: String,
    versionId: String,
    versionStages: js.Array[String]
  ): GetSecretVersionResult = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], secretBinary = secretBinary.asInstanceOf[js.Any], secretId = secretId.asInstanceOf[js.Any], secretString = secretString.asInstanceOf[js.Any], versionId = versionId.asInstanceOf[js.Any], versionStages = versionStages.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSecretVersionResult]
  }
  
  @scala.inline
  implicit class GetSecretVersionResultOps[Self <: GetSecretVersionResult] (val x: Self) extends AnyVal {
    
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
    def setArn(value: String): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecretBinary(value: String): Self = this.set("secretBinary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecretId(value: String): Self = this.set("secretId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecretString(value: String): Self = this.set("secretString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionId(value: String): Self = this.set("versionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionStagesVarargs(value: String*): Self = this.set("versionStages", js.Array(value :_*))
    
    @scala.inline
    def setVersionStages(value: js.Array[String]): Self = this.set("versionStages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionStage(value: String): Self = this.set("versionStage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersionStage: Self = this.set("versionStage", js.undefined)
  }
}

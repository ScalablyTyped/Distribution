package typings.pulumiAws.secretRotationMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.secretsmanager.SecretRotationRotationRules
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SecretRotationState extends js.Object {
  
  /**
    * Specifies whether automatic rotation is enabled for this secret.
    */
  val rotationEnabled: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * Specifies the ARN of the Lambda function that can rotate the secret.
    */
  val rotationLambdaArn: js.UndefOr[Input[String]] = js.native
  
  /**
    * A structure that defines the rotation configuration for this secret. Defined below.
    */
  val rotationRules: js.UndefOr[Input[SecretRotationRotationRules]] = js.native
  
  /**
    * Specifies the secret to which you want to add a new version. You can specify either the Amazon Resource Name (ARN) or the friendly name of the secret. The secret must already exist.
    */
  val secretId: js.UndefOr[Input[String]] = js.native
  
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
}
object SecretRotationState {
  
  @scala.inline
  def apply(): SecretRotationState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecretRotationState]
  }
  
  @scala.inline
  implicit class SecretRotationStateOps[Self <: SecretRotationState] (val x: Self) extends AnyVal {
    
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
    def setRotationEnabled(value: Input[Boolean]): Self = this.set("rotationEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRotationEnabled: Self = this.set("rotationEnabled", js.undefined)
    
    @scala.inline
    def setRotationLambdaArn(value: Input[String]): Self = this.set("rotationLambdaArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRotationLambdaArn: Self = this.set("rotationLambdaArn", js.undefined)
    
    @scala.inline
    def setRotationRules(value: Input[SecretRotationRotationRules]): Self = this.set("rotationRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRotationRules: Self = this.set("rotationRules", js.undefined)
    
    @scala.inline
    def setSecretId(value: Input[String]): Self = this.set("secretId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecretId: Self = this.set("secretId", js.undefined)
    
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}

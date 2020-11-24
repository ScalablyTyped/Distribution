package typings.pulumiAws.secretMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.secretsmanager.SecretRotationRules
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SecretArgs extends js.Object {
  
  /**
    * A description of the secret.
    */
  val description: js.UndefOr[Input[String]] = js.native
  
  /**
    * Specifies the ARN or Id of the AWS KMS customer master key (CMK) to be used to encrypt the secret values in the versions stored in this secret. If you don't specify this value, then Secrets Manager defaults to using the AWS account's default CMK (the one named `aws/secretsmanager`). If the default KMS CMK with that name doesn't yet exist, then AWS Secrets Manager creates it for you automatically the first time.
    */
  val kmsKeyId: js.UndefOr[Input[String]] = js.native
  
  /**
    * Specifies the friendly name of the new secret. The secret name can consist of uppercase letters, lowercase letters, digits, and any of the following characters: `/_+=.@-` Conflicts with `namePrefix`.
    */
  val name: js.UndefOr[Input[String]] = js.native
  
  /**
    * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
    */
  val namePrefix: js.UndefOr[Input[String]] = js.native
  
  /**
    * A valid JSON document representing a [resource policy](https://docs.aws.amazon.com/secretsmanager/latest/userguide/auth-and-access_resource-based-policies.html).
    */
  val policy: js.UndefOr[Input[String]] = js.native
  
  /**
    * Specifies the number of days that AWS Secrets Manager waits before it can delete the secret. This value can be `0` to force deletion without recovery or range from `7` to `30` days. The default value is `30`.
    */
  val recoveryWindowInDays: js.UndefOr[Input[Double]] = js.native
  
  /**
    * Specifies the ARN of the Lambda function that can rotate the secret. Use the `aws.secretsmanager.SecretRotation` resource to manage this configuration instead. As of version 2.67.0, removal of this configuration will no longer remove rotation due to supporting the new resource. Either import the new resource and remove the configuration or manually remove rotation.
    *
    * @deprecated Use the aws_secretsmanager_secret_rotation resource instead
    */
  val rotationLambdaArn: js.UndefOr[Input[String]] = js.native
  
  /**
    * A structure that defines the rotation configuration for this secret. Defined below. Use the `aws.secretsmanager.SecretRotation` resource to manage this configuration instead. As of version 2.67.0, removal of this configuration will no longer remove rotation due to supporting the new resource. Either import the new resource and remove the configuration or manually remove rotation.
    *
    * @deprecated Use the aws_secretsmanager_secret_rotation resource instead
    */
  val rotationRules: js.UndefOr[Input[SecretRotationRules]] = js.native
  
  /**
    * Specifies a key-value map of user-defined tags that are attached to the secret.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
}
object SecretArgs {
  
  @scala.inline
  def apply(): SecretArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecretArgs]
  }
  
  @scala.inline
  implicit class SecretArgsOps[Self <: SecretArgs] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: Input[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setKmsKeyId(value: Input[String]): Self = this.set("kmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKmsKeyId: Self = this.set("kmsKeyId", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNamePrefix(value: Input[String]): Self = this.set("namePrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNamePrefix: Self = this.set("namePrefix", js.undefined)
    
    @scala.inline
    def setPolicy(value: Input[String]): Self = this.set("policy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicy: Self = this.set("policy", js.undefined)
    
    @scala.inline
    def setRecoveryWindowInDays(value: Input[Double]): Self = this.set("recoveryWindowInDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecoveryWindowInDays: Self = this.set("recoveryWindowInDays", js.undefined)
    
    @scala.inline
    def setRotationLambdaArn(value: Input[String]): Self = this.set("rotationLambdaArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRotationLambdaArn: Self = this.set("rotationLambdaArn", js.undefined)
    
    @scala.inline
    def setRotationRules(value: Input[SecretRotationRules]): Self = this.set("rotationRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRotationRules: Self = this.set("rotationRules", js.undefined)
    
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}

package typings.pulumiAws.secretRotationMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.secretsmanager.SecretRotationRotationRules
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SecretRotationArgs extends js.Object {
  /**
    * Specifies the ARN of the Lambda function that can rotate the secret.
    */
  val rotationLambdaArn: Input[String] = js.native
  /**
    * A structure that defines the rotation configuration for this secret. Defined below.
    */
  val rotationRules: Input[SecretRotationRotationRules] = js.native
  /**
    * Specifies the secret to which you want to add a new version. You can specify either the Amazon Resource Name (ARN) or the friendly name of the secret. The secret must already exist.
    */
  val secretId: Input[String] = js.native
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
}

object SecretRotationArgs {
  @scala.inline
  def apply(
    rotationLambdaArn: Input[String],
    rotationRules: Input[SecretRotationRotationRules],
    secretId: Input[String]
  ): SecretRotationArgs = {
    val __obj = js.Dynamic.literal(rotationLambdaArn = rotationLambdaArn.asInstanceOf[js.Any], rotationRules = rotationRules.asInstanceOf[js.Any], secretId = secretId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecretRotationArgs]
  }
  @scala.inline
  implicit class SecretRotationArgsOps[Self <: SecretRotationArgs] (val x: Self) extends AnyVal {
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
    def setRotationLambdaArn(value: Input[String]): Self = this.set("rotationLambdaArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setRotationRules(value: Input[SecretRotationRotationRules]): Self = this.set("rotationRules", value.asInstanceOf[js.Any])
    @scala.inline
    def setSecretId(value: Input[String]): Self = this.set("secretId", value.asInstanceOf[js.Any])
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}


package typings.atPulumiAws.secretsmanagerSecretMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.Anon_AutomaticallyAfterDaysInput
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SecretArgs extends js.Object {
  /**
    * A description of the secret.
    */
  val description: js.UndefOr[Input[String]] = js.undefined
  /**
    * Specifies the ARN or alias of the AWS KMS customer master key (CMK) to be used to encrypt the secret values in the versions stored in this secret. If you don't specify this value, then Secrets Manager defaults to using the AWS account's default CMK (the one named `aws/secretsmanager`). If the default KMS CMK with that name doesn't yet exist, then AWS Secrets Manager creates it for you automatically the first time.
    */
  val kmsKeyId: js.UndefOr[Input[String]] = js.undefined
  /**
    * Specifies the friendly name of the new secret. The secret name can consist of uppercase letters, lowercase letters, digits, and any of the following characters: `/_+=.@-` Conflicts with `name_prefix`.
    */
  val name: js.UndefOr[Input[String]] = js.undefined
  /**
    * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
    */
  val namePrefix: js.UndefOr[Input[String]] = js.undefined
  /**
    * A valid JSON document representing a [resource policy](https://docs.aws.amazon.com/secretsmanager/latest/userguide/auth-and-access_resource-based-policies.html).
    */
  val policy: js.UndefOr[Input[String]] = js.undefined
  /**
    * Specifies the number of days that AWS Secrets Manager waits before it can delete the secret. This value can be `0` to force deletion without recovery or range from `7` to `30` days. The default value is `30`.
    */
  val recoveryWindowInDays: js.UndefOr[Input[Double]] = js.undefined
  /**
    * Specifies the ARN of the Lambda function that can rotate the secret.
    */
  val rotationLambdaArn: js.UndefOr[Input[String]] = js.undefined
  /**
    * A structure that defines the rotation configuration for this secret. Defined below.
    */
  val rotationRules: js.UndefOr[Input[Anon_AutomaticallyAfterDaysInput]] = js.undefined
  /**
    * Specifies a key-value map of user-defined tags that are attached to the secret.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.undefined
}

object SecretArgs {
  @scala.inline
  def apply(
    description: Input[String] = null,
    kmsKeyId: Input[String] = null,
    name: Input[String] = null,
    namePrefix: Input[String] = null,
    policy: Input[String] = null,
    recoveryWindowInDays: Input[Double] = null,
    rotationLambdaArn: Input[String] = null,
    rotationRules: Input[Anon_AutomaticallyAfterDaysInput] = null,
    tags: Input[StringDictionary[_]] = null
  ): SecretArgs = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (kmsKeyId != null) __obj.updateDynamic("kmsKeyId")(kmsKeyId.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (namePrefix != null) __obj.updateDynamic("namePrefix")(namePrefix.asInstanceOf[js.Any])
    if (policy != null) __obj.updateDynamic("policy")(policy.asInstanceOf[js.Any])
    if (recoveryWindowInDays != null) __obj.updateDynamic("recoveryWindowInDays")(recoveryWindowInDays.asInstanceOf[js.Any])
    if (rotationLambdaArn != null) __obj.updateDynamic("rotationLambdaArn")(rotationLambdaArn.asInstanceOf[js.Any])
    if (rotationRules != null) __obj.updateDynamic("rotationRules")(rotationRules.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecretArgs]
  }
}


package typings.pulumiAws.notebookInstanceMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotebookInstanceArgs extends js.Object {
  /**
    * Set to `Disabled` to disable internet access to notebook. Requires `securityGroups` and `subnetId` to be set. Supported values: `Enabled` (Default) or `Disabled`. If set to `Disabled`, the notebook instance will be able to access resources only in your VPC, and will not be able to connect to Amazon SageMaker training and endpoint services unless your configure a NAT Gateway in your VPC.
    */
  val directInternetAccess: js.UndefOr[Input[String]] = js.native
  /**
    * The name of ML compute instance type.
    */
  val instanceType: Input[String] = js.native
  /**
    * The AWS Key Management Service (AWS KMS) key that Amazon SageMaker uses to encrypt the model artifacts at rest using Amazon S3 server-side encryption.
    */
  val kmsKeyId: js.UndefOr[Input[String]] = js.native
  /**
    * The name of a lifecycle configuration to associate with the notebook instance.
    */
  val lifecycleConfigName: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the notebook instance (must be unique).
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * The ARN of the IAM role to be used by the notebook instance which allows SageMaker to call other services on your behalf.
    */
  val roleArn: Input[String] = js.native
  /**
    * The associated security groups.
    */
  val securityGroups: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The VPC subnet ID.
    */
  val subnetId: js.UndefOr[Input[String]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object NotebookInstanceArgs {
  @scala.inline
  def apply(
    instanceType: Input[String],
    roleArn: Input[String],
    directInternetAccess: Input[String] = null,
    kmsKeyId: Input[String] = null,
    lifecycleConfigName: Input[String] = null,
    name: Input[String] = null,
    securityGroups: Input[js.Array[Input[String]]] = null,
    subnetId: Input[String] = null,
    tags: Input[StringDictionary[_]] = null
  ): NotebookInstanceArgs = {
    val __obj = js.Dynamic.literal(instanceType = instanceType.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    if (directInternetAccess != null) __obj.updateDynamic("directInternetAccess")(directInternetAccess.asInstanceOf[js.Any])
    if (kmsKeyId != null) __obj.updateDynamic("kmsKeyId")(kmsKeyId.asInstanceOf[js.Any])
    if (lifecycleConfigName != null) __obj.updateDynamic("lifecycleConfigName")(lifecycleConfigName.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (securityGroups != null) __obj.updateDynamic("securityGroups")(securityGroups.asInstanceOf[js.Any])
    if (subnetId != null) __obj.updateDynamic("subnetId")(subnetId.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotebookInstanceArgs]
  }
}


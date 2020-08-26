package typings.pulumiAws.notebookInstanceMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotebookInstanceState extends js.Object {
  /**
    * The Amazon Resource Name (ARN) assigned by AWS to this notebook instance.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * Set to `Disabled` to disable internet access to notebook. Requires `securityGroups` and `subnetId` to be set. Supported values: `Enabled` (Default) or `Disabled`. If set to `Disabled`, the notebook instance will be able to access resources only in your VPC, and will not be able to connect to Amazon SageMaker training and endpoint services unless your configure a NAT Gateway in your VPC.
    */
  val directInternetAccess: js.UndefOr[Input[String]] = js.native
  /**
    * The name of ML compute instance type.
    */
  val instanceType: js.UndefOr[Input[String]] = js.native
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
  val roleArn: js.UndefOr[Input[String]] = js.native
  /**
    * The associated security groups.
    */
  val securityGroups: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The VPC subnet ID.
    */
  val subnetId: js.UndefOr[Input[String]] = js.native
  /**
    * A map of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
}

object NotebookInstanceState {
  @scala.inline
  def apply(): NotebookInstanceState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotebookInstanceState]
  }
  @scala.inline
  implicit class NotebookInstanceStateOps[Self <: NotebookInstanceState] (val x: Self) extends AnyVal {
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
    def setArn(value: Input[String]): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    @scala.inline
    def setDirectInternetAccess(value: Input[String]): Self = this.set("directInternetAccess", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirectInternetAccess: Self = this.set("directInternetAccess", js.undefined)
    @scala.inline
    def setInstanceType(value: Input[String]): Self = this.set("instanceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceType: Self = this.set("instanceType", js.undefined)
    @scala.inline
    def setKmsKeyId(value: Input[String]): Self = this.set("kmsKeyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKmsKeyId: Self = this.set("kmsKeyId", js.undefined)
    @scala.inline
    def setLifecycleConfigName(value: Input[String]): Self = this.set("lifecycleConfigName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLifecycleConfigName: Self = this.set("lifecycleConfigName", js.undefined)
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setRoleArn(value: Input[String]): Self = this.set("roleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoleArn: Self = this.set("roleArn", js.undefined)
    @scala.inline
    def setSecurityGroupsVarargs(value: Input[String]*): Self = this.set("securityGroups", js.Array(value :_*))
    @scala.inline
    def setSecurityGroups(value: Input[js.Array[Input[String]]]): Self = this.set("securityGroups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecurityGroups: Self = this.set("securityGroups", js.undefined)
    @scala.inline
    def setSubnetId(value: Input[String]): Self = this.set("subnetId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubnetId: Self = this.set("subnetId", js.undefined)
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}


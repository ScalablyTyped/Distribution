package typings.pulumiAws.s3AccessPointMod

import typings.pulumiAws.outputMod.s3.AccessPointPublicAccessBlockConfiguration
import typings.pulumiAws.outputMod.s3.AccessPointVpcConfiguration
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/s3/accessPoint", "AccessPoint")
@js.native
class AccessPoint protected () extends CustomResource {
  /**
    * Create a AccessPoint resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: AccessPointArgs) = this()
  def this(name: String, args: AccessPointArgs, opts: CustomResourceOptions) = this()
  /**
    * The AWS account ID for the owner of the bucket for which you want to create an access point. Defaults to automatically determined account ID of the provider.
    */
  val accountId: Output_[String] = js.native
  /**
    * Amazon Resource Name (ARN) of the S3 Access Point.
    */
  val arn: Output_[String] = js.native
  /**
    * The name of the bucket that you want to associate this access point with.
    */
  val bucket: Output_[String] = js.native
  /**
    * The DNS domain name of the S3 Access Point in the format _`name`_-_`accountId`_.s3-accesspoint._region_.amazonaws.com.
    * Note: S3 access points only support secure access by HTTPS. HTTP isn't supported.
    */
  val domainName: Output_[String] = js.native
  /**
    * Indicates whether this access point currently has a policy that allows public access.
    */
  val hasPublicAccessPolicy: Output_[Boolean] = js.native
  /**
    * The name you want to assign to this access point.
    */
  val name: Output_[String] = js.native
  /**
    * Indicates whether this access point allows access from the public Internet. Values are `VPC` (the access point doesn't allow access from the public Internet) and `Internet` (the access point allows access from the public Internet, subject to the access point and bucket access policies).
    */
  val networkOrigin: Output_[String] = js.native
  /**
    * A valid JSON document that specifies the policy that you want to apply to this access point.
    */
  val policy: Output_[js.UndefOr[String]] = js.native
  /**
    * Configuration block to manage the `PublicAccessBlock` configuration that you want to apply to this Amazon S3 bucket. You can enable the configuration options in any combination. Detailed below.
    */
  val publicAccessBlockConfiguration: Output_[js.UndefOr[AccessPointPublicAccessBlockConfiguration]] = js.native
  /**
    * Configuration block to restrict access to this access point to requests from the specified Virtual Private Cloud (VPC). Detailed below.
    */
  val vpcConfiguration: Output_[js.UndefOr[AccessPointVpcConfiguration]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/s3/accessPoint", "AccessPoint")
@js.native
object AccessPoint extends js.Object {
  /**
    * Get an existing AccessPoint resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): AccessPoint = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): AccessPoint = js.native
  def get(name: String, id: Input[ID], state: AccessPointState): AccessPoint = js.native
  def get(name: String, id: Input[ID], state: AccessPointState, opts: CustomResourceOptions): AccessPoint = js.native
  /**
    * Returns true if the given object is an instance of AccessPoint.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/s3/accessPoint.AccessPoint */ Boolean = js.native
}


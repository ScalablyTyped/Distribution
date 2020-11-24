package typings.pulumiAws.devEndpointMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/glue/devEndpoint", "DevEndpoint")
@js.native
class DevEndpoint protected () extends CustomResource {
  /**
    * Create a DevEndpoint resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: DevEndpointArgs) = this()
  def this(name: String, args: DevEndpointArgs, opts: CustomResourceOptions) = this()
  
  /**
    * A map of arguments used to configure the endpoint.
    */
  val arguments: Output_[js.UndefOr[StringDictionary[_]]] = js.native
  
  /**
    * The ARN of the endpoint.
    */
  val arn: Output_[String] = js.native
  
  /**
    * The AWS availability zone where this endpoint is located.
    */
  val availabilityZone: Output_[String] = js.native
  
  /**
    * Path to one or more Java Jars in an S3 bucket that should be loaded in this endpoint.
    */
  val extraJarsS3Path: Output_[js.UndefOr[String]] = js.native
  
  /**
    * Path(s) to one or more Python libraries in an S3 bucket that should be loaded in this endpoint. Multiple values must be complete paths separated by a comma.
    */
  val extraPythonLibsS3Path: Output_[js.UndefOr[String]] = js.native
  
  /**
    * The reason for a current failure in this endpoint.
    */
  val failureReason: Output_[String] = js.native
  
  /**
    * -  Specifies the versions of Python and Apache Spark to use. Defaults to AWS Glue version 0.9.
    */
  val glueVersion: Output_[js.UndefOr[String]] = js.native
  
  /**
    * The name of this endpoint. It must be unique in your account.
    */
  val name: Output_[String] = js.native
  
  /**
    * The number of AWS Glue Data Processing Units (DPUs) to allocate to this endpoint. Conflicts with `workerType`.
    */
  val numberOfNodes: Output_[js.UndefOr[Double]] = js.native
  
  /**
    * The number of workers of a defined worker type that are allocated to this endpoint. This field is available only when you choose worker type G.1X or G.2X.
    */
  val numberOfWorkers: Output_[js.UndefOr[Double]] = js.native
  
  /**
    * A private IP address to access the endpoint within a VPC, if this endpoint is created within one.
    */
  val privateAddress: Output_[String] = js.native
  
  /**
    * The public IP address used by this endpoint. The PublicAddress field is present only when you create a non-VPC endpoint.
    */
  val publicAddress: Output_[String] = js.native
  
  /**
    * The public key to be used by this endpoint for authentication.
    */
  val publicKey: Output_[js.UndefOr[String]] = js.native
  
  /**
    * A list of public keys to be used by this endpoint for authentication.
    */
  val publicKeys: Output_[js.UndefOr[js.Array[String]]] = js.native
  
  /**
    * The IAM role for this endpoint.
    */
  val roleArn: Output_[String] = js.native
  
  /**
    * The name of the Security Configuration structure to be used with this endpoint.
    */
  val securityConfiguration: Output_[js.UndefOr[String]] = js.native
  
  /**
    * Security group IDs for the security groups to be used by this endpoint.
    */
  val securityGroupIds: Output_[js.UndefOr[js.Array[String]]] = js.native
  
  /**
    * The current status of this endpoint.
    */
  val status: Output_[String] = js.native
  
  /**
    * The subnet ID for the new endpoint to use.
    */
  val subnetId: Output_[js.UndefOr[String]] = js.native
  
  /**
    * Key-value map of resource tags.
    */
  val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  
  /**
    * he ID of the VPC used by this endpoint.
    */
  val vpcId: Output_[String] = js.native
  
  /**
    * The type of predefined worker that is allocated to this endpoint. Accepts a value of Standard, G.1X, or G.2X.
    */
  val workerType: Output_[js.UndefOr[String]] = js.native
  
  /**
    * The YARN endpoint address used by this endpoint.
    */
  val yarnEndpointAddress: Output_[String] = js.native
  
  /**
    * The Apache Zeppelin port for the remote Apache Spark interpreter.
    */
  val zeppelinRemoteSparkInterpreterPort: Output_[Double] = js.native
}
/* static members */
@JSImport("@pulumi/aws/glue/devEndpoint", "DevEndpoint")
@js.native
object DevEndpoint extends js.Object {
  
  /**
    * Get an existing DevEndpoint resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): DevEndpoint = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): DevEndpoint = js.native
  def get(name: String, id: Input[ID], state: DevEndpointState): DevEndpoint = js.native
  def get(name: String, id: Input[ID], state: DevEndpointState, opts: CustomResourceOptions): DevEndpoint = js.native
  
  /**
    * Returns true if the given object is an instance of DevEndpoint.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/glue/devEndpoint.DevEndpoint */ Boolean = js.native
}

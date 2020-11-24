package typings.pulumiAws.s3outpostsEndpointMod

import typings.pulumiAws.outputMod.s3outposts.EndpointNetworkInterface
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/s3outposts/endpoint", "Endpoint")
@js.native
class Endpoint protected () extends CustomResource {
  /**
    * Create a Endpoint resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: EndpointArgs) = this()
  def this(name: String, args: EndpointArgs, opts: CustomResourceOptions) = this()
  
  /**
    * Amazon Resource Name (ARN) of the endpoint.
    */
  val arn: Output_[String] = js.native
  
  /**
    * VPC CIDR block of the endpoint.
    */
  val cidrBlock: Output_[String] = js.native
  
  /**
    * UTC creation time in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8).
    */
  val creationTime: Output_[String] = js.native
  
  /**
    * Set of nested attributes for associated Elastic Network Interfaces (ENIs).
    */
  val networkInterfaces: Output_[js.Array[EndpointNetworkInterface]] = js.native
  
  /**
    * Identifier of the Outpost to contain this endpoint.
    */
  val outpostId: Output_[String] = js.native
  
  /**
    * Identifier of the EC2 Security Group.
    */
  val securityGroupId: Output_[String] = js.native
  
  /**
    * Identifier of the EC2 Subnet.
    */
  val subnetId: Output_[String] = js.native
}
/* static members */
@JSImport("@pulumi/aws/s3outposts/endpoint", "Endpoint")
@js.native
object Endpoint extends js.Object {
  
  /**
    * Get an existing Endpoint resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): Endpoint = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Endpoint = js.native
  def get(name: String, id: Input[ID], state: EndpointState): Endpoint = js.native
  def get(name: String, id: Input[ID], state: EndpointState, opts: CustomResourceOptions): Endpoint = js.native
  
  /**
    * Returns true if the given object is an instance of Endpoint.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/s3outposts/endpoint.Endpoint */ Boolean = js.native
}

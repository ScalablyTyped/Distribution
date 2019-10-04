package typings.atPulumiAws.route53ResolverEndpointMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesOutputMod.route53Ns.ResolverEndpointIpAddress
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/route53/resolverEndpoint", "ResolverEndpoint")
@js.native
class ResolverEndpoint protected () extends CustomResource {
  /**
    * Create a ResolverEndpoint resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: ResolverEndpointArgs) = this()
  def this(name: String, args: ResolverEndpointArgs, opts: CustomResourceOptions) = this()
  /**
    * The ARN of the Route 53 Resolver endpoint.
    */
  val arn: Output[String] = js.native
  /**
    * The direction of DNS queries to or from the Route 53 Resolver endpoint.
    * Valid values are `INBOUND` (resolver forwards DNS queries to the DNS service for a VPC from your network or another VPC)
    * or `OUTBOUND` (resolver forwards DNS queries from the DNS service for a VPC to your network or another VPC).
    */
  val direction: Output[String] = js.native
  /**
    * The ID of the VPC that you want to create the resolver endpoint in.
    */
  val hostVpcId: Output[String] = js.native
  /**
    * The subnets and IP addresses in your VPC that you want DNS queries to pass through on the way from your VPCs
    * to your network (for outbound endpoints) or on the way from your network to your VPCs (for inbound endpoints). Described below.
    */
  val ipAddresses: Output[js.Array[ResolverEndpointIpAddress]] = js.native
  /**
    * The friendly name of the Route 53 Resolver endpoint.
    */
  val name: Output[String] = js.native
  /**
    * The ID of one or more security groups that you want to use to control access to this VPC.
    */
  val securityGroupIds: Output[js.Array[String]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: Output[js.UndefOr[StringDictionary[_]]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/route53/resolverEndpoint", "ResolverEndpoint")
@js.native
object ResolverEndpoint extends js.Object {
  /**
    * Get an existing ResolverEndpoint resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): ResolverEndpoint = js.native
  def get(name: String, id: Input[ID], state: ResolverEndpointState): ResolverEndpoint = js.native
  def get(name: String, id: Input[ID], state: ResolverEndpointState, opts: CustomResourceOptions): ResolverEndpoint = js.native
  /**
    * Returns true if the given object is an instance of ResolverEndpoint.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/route53/resolverEndpoint.ResolverEndpoint */ Boolean = js.native
}


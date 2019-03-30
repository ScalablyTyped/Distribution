package typings
package atPulumiAwsLib.route53ResolverEndpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/route53/resolverEndpoint", "ResolverEndpoint")
@js.native
class ResolverEndpoint protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a ResolverEndpoint resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: ResolverEndpointArgs) = this()
  def this(name: java.lang.String, args: ResolverEndpointArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * The ARN of the Route 53 Resolver endpoint.
    */
  val arn: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The direction of DNS queries to or from the Route 53 Resolver endpoint.
    * Valid values are `INBOUND` (resolver forwards DNS queries to the DNS service for a VPC from your network or another VPC)
    * or `OUTBOUND` (resolver forwards DNS queries from the DNS service for a VPC to your network or another VPC).
    */
  val direction: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The ID of the VPC that you want to create the resolver endpoint in.
    */
  val hostVpcId: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The subnets and IP addresses in your VPC that you want DNS queries to pass through on the way from your VPCs
    * to your network (for outbound endpoints) or on the way from your network to your VPCs (for inbound endpoints). Described below.
    */
  val ipAddresses: atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiAwsLib.Anon_Ip]] = js.native
  /**
    * The friendly name of the Route 53 Resolver endpoint.
    */
  val name: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The ID of one or more security groups that you want to use to control access to this VPC.
    */
  val securityGroupIds: atPulumiPulumiLib.outputMod.Output[js.Array[java.lang.String]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: atPulumiPulumiLib.outputMod.Output[js.UndefOr[org.scalablytyped.runtime.StringDictionary[_]]] = js.native
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
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.route53ResolverEndpointMod.ResolverEndpoint = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.route53ResolverEndpointMod.ResolverEndpointState
  ): atPulumiAwsLib.route53ResolverEndpointMod.ResolverEndpoint = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.route53ResolverEndpointMod.ResolverEndpointState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.route53ResolverEndpointMod.ResolverEndpoint = js.native
}


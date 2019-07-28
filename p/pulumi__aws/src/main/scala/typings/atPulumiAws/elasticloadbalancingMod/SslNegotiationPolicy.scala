package typings.atPulumiAws.elasticloadbalancingMod

import typings.atPulumiAws.elasticloadbalancingSslNegotiationPolicyMod.SslNegotiationPolicyArgs
import typings.atPulumiAws.elasticloadbalancingSslNegotiationPolicyMod.SslNegotiationPolicyState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/elasticloadbalancing", "SslNegotiationPolicy")
@js.native
class SslNegotiationPolicy protected ()
  extends typings.atPulumiAws.elasticloadbalancingSslNegotiationPolicyMod.SslNegotiationPolicy {
  /**
    * Create a SslNegotiationPolicy resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: SslNegotiationPolicyArgs) = this()
  def this(name: String, args: SslNegotiationPolicyArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/elasticloadbalancing", "SslNegotiationPolicy")
@js.native
object SslNegotiationPolicy extends js.Object {
  /**
    * Get an existing SslNegotiationPolicy resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typings.atPulumiAws.elasticloadbalancingSslNegotiationPolicyMod.SslNegotiationPolicy = js.native
  def get(name: String, id: Input[ID], state: SslNegotiationPolicyState): typings.atPulumiAws.elasticloadbalancingSslNegotiationPolicyMod.SslNegotiationPolicy = js.native
  def get(name: String, id: Input[ID], state: SslNegotiationPolicyState, opts: CustomResourceOptions): typings.atPulumiAws.elasticloadbalancingSslNegotiationPolicyMod.SslNegotiationPolicy = js.native
  /**
    * Returns true if the given object is an instance of SslNegotiationPolicy.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elasticloadbalancing/sslNegotiationPolicy.SslNegotiationPolicy */ Boolean = js.native
}


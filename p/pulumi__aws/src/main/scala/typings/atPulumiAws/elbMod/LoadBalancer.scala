package typings.atPulumiAws.elbMod

import typings.atPulumiAws.elbLoadBalancerMod.LoadBalancerArgs
import typings.atPulumiAws.elbLoadBalancerMod.LoadBalancerState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/elb", "LoadBalancer")
@js.native
class LoadBalancer protected ()
  extends typings.atPulumiAws.elbLoadBalancerMod.LoadBalancer {
  /**
    * Create a LoadBalancer resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: LoadBalancerArgs) = this()
  def this(name: String, args: LoadBalancerArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/elb", "LoadBalancer")
@js.native
object LoadBalancer extends js.Object {
  /**
    * Get an existing LoadBalancer resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typings.atPulumiAws.elbLoadBalancerMod.LoadBalancer = js.native
  def get(name: String, id: Input[ID], state: LoadBalancerState): typings.atPulumiAws.elbLoadBalancerMod.LoadBalancer = js.native
  def get(name: String, id: Input[ID], state: LoadBalancerState, opts: CustomResourceOptions): typings.atPulumiAws.elbLoadBalancerMod.LoadBalancer = js.native
  /**
    * Returns true if the given object is an instance of LoadBalancer.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elb/loadBalancer.LoadBalancer */ Boolean = js.native
}


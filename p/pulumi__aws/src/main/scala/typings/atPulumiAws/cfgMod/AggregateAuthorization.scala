package typings.atPulumiAws.cfgMod

import typings.atPulumiAws.cfgAggregateAuthorizationMod.AggregateAuthorizationArgs
import typings.atPulumiAws.cfgAggregateAuthorizationMod.AggregateAuthorizationState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/cfg", "AggregateAuthorization")
@js.native
class AggregateAuthorization protected ()
  extends typings.atPulumiAws.cfgAggregateAuthorizationMod.AggregateAuthorization {
  /**
    * Create a AggregateAuthorization resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: AggregateAuthorizationArgs) = this()
  def this(name: String, args: AggregateAuthorizationArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/cfg", "AggregateAuthorization")
@js.native
object AggregateAuthorization extends js.Object {
  /**
    * Get an existing AggregateAuthorization resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typings.atPulumiAws.cfgAggregateAuthorizationMod.AggregateAuthorization = js.native
  def get(name: String, id: Input[ID], state: AggregateAuthorizationState): typings.atPulumiAws.cfgAggregateAuthorizationMod.AggregateAuthorization = js.native
  def get(name: String, id: Input[ID], state: AggregateAuthorizationState, opts: CustomResourceOptions): typings.atPulumiAws.cfgAggregateAuthorizationMod.AggregateAuthorization = js.native
  /**
    * Returns true if the given object is an instance of AggregateAuthorization.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cfg/aggregateAuthorization.AggregateAuthorization */ Boolean = js.native
}


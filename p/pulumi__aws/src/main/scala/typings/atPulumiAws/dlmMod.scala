package typings.atPulumiAws

import typings.atPulumiAws.dlmLifecyclePolicyMod.LifecyclePolicyArgs
import typings.atPulumiAws.dlmLifecyclePolicyMod.LifecyclePolicyState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/dlm", JSImport.Namespace)
@js.native
object dlmMod extends js.Object {
  @js.native
  class LifecyclePolicy protected ()
    extends typings.atPulumiAws.dlmLifecyclePolicyMod.LifecyclePolicy {
    /**
      * Create a LifecyclePolicy resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: LifecyclePolicyArgs) = this()
    def this(name: String, args: LifecyclePolicyArgs, opts: CustomResourceOptions) = this()
  }
  
  /* static members */
  @js.native
  object LifecyclePolicy extends js.Object {
    /**
      * Get an existing LifecyclePolicy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.dlmLifecyclePolicyMod.LifecyclePolicy = js.native
    def get(name: String, id: Input[ID], state: LifecyclePolicyState): typings.atPulumiAws.dlmLifecyclePolicyMod.LifecyclePolicy = js.native
    def get(name: String, id: Input[ID], state: LifecyclePolicyState, opts: CustomResourceOptions): typings.atPulumiAws.dlmLifecyclePolicyMod.LifecyclePolicy = js.native
    /**
      * Returns true if the given object is an instance of LifecyclePolicy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/dlm/lifecyclePolicy.LifecyclePolicy */ Boolean = js.native
  }
  
}


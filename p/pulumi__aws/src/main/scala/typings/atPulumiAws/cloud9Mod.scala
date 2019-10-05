package typings.atPulumiAws

import typings.atPulumiAws.cloud9EnvironmentEC2Mod.EnvironmentEC2Args
import typings.atPulumiAws.cloud9EnvironmentEC2Mod.EnvironmentEC2State
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/cloud9", JSImport.Namespace)
@js.native
object cloud9Mod extends js.Object {
  @js.native
  class EnvironmentEC2 protected ()
    extends typings.atPulumiAws.cloud9EnvironmentEC2Mod.EnvironmentEC2 {
    /**
      * Create a EnvironmentEC2 resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: EnvironmentEC2Args) = this()
    def this(name: String, args: EnvironmentEC2Args, opts: CustomResourceOptions) = this()
  }
  
  /* static members */
  @js.native
  object EnvironmentEC2 extends js.Object {
    /**
      * Get an existing EnvironmentEC2 resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.cloud9EnvironmentEC2Mod.EnvironmentEC2 = js.native
    def get(name: String, id: Input[ID], state: EnvironmentEC2State): typings.atPulumiAws.cloud9EnvironmentEC2Mod.EnvironmentEC2 = js.native
    def get(name: String, id: Input[ID], state: EnvironmentEC2State, opts: CustomResourceOptions): typings.atPulumiAws.cloud9EnvironmentEC2Mod.EnvironmentEC2 = js.native
    /**
      * Returns true if the given object is an instance of EnvironmentEC2.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloud9/environmentEC2.EnvironmentEC2 */ Boolean = js.native
  }
  
}


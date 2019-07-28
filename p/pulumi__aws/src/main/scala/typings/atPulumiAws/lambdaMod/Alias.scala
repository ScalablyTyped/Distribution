package typings.atPulumiAws.lambdaMod

import typings.atPulumiAws.lambdaAliasMod.AliasArgs
import typings.atPulumiAws.lambdaAliasMod.AliasState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/lambda", "Alias")
@js.native
class Alias protected ()
  extends typings.atPulumiAws.lambdaAliasMod.Alias {
  /**
    * Create a Alias resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: AliasArgs) = this()
  def this(name: String, args: AliasArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/lambda", "Alias")
@js.native
object Alias extends js.Object {
  /**
    * Get an existing Alias resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typings.atPulumiAws.lambdaAliasMod.Alias = js.native
  def get(name: String, id: Input[ID], state: AliasState): typings.atPulumiAws.lambdaAliasMod.Alias = js.native
  def get(name: String, id: Input[ID], state: AliasState, opts: CustomResourceOptions): typings.atPulumiAws.lambdaAliasMod.Alias = js.native
  /**
    * Returns true if the given object is an instance of Alias.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/lambda/alias.Alias */ Boolean = js.native
}


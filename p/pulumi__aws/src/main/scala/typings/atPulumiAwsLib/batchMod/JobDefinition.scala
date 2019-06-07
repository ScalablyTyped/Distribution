package typings
package atPulumiAwsLib.batchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/batch", "JobDefinition")
@js.native
class JobDefinition protected ()
  extends atPulumiAwsLib.batchJobDefinitionMod.JobDefinition {
  /**
    * Create a JobDefinition resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: atPulumiAwsLib.batchJobDefinitionMod.JobDefinitionArgs) = this()
  def this(name: java.lang.String, args: atPulumiAwsLib.batchJobDefinitionMod.JobDefinitionArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/batch", "JobDefinition")
@js.native
object JobDefinition extends js.Object {
  /**
    * Get an existing JobDefinition resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.batchJobDefinitionMod.JobDefinition = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.batchJobDefinitionMod.JobDefinitionState
  ): atPulumiAwsLib.batchJobDefinitionMod.JobDefinition = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.batchJobDefinitionMod.JobDefinitionState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.batchJobDefinitionMod.JobDefinition = js.native
  /**
    * Returns true if the given object is an instance of JobDefinition.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/batch/jobDefinition.JobDefinition */ scala.Boolean = js.native
}


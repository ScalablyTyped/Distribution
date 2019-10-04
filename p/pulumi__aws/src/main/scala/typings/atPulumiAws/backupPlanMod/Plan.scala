package typings.atPulumiAws.backupPlanMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesOutputMod.backupNs.PlanRule
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/backup/plan", "Plan")
@js.native
class Plan protected () extends CustomResource {
  /**
    * Create a Plan resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: PlanArgs) = this()
  def this(name: String, args: PlanArgs, opts: CustomResourceOptions) = this()
  /**
    * The ARN of the backup plan.
    */
  val arn: Output[String] = js.native
  /**
    * The display name of a backup plan.
    */
  val name: Output[String] = js.native
  /**
    * A rule object that specifies a scheduled task that is used to back up a selection of resources.
    */
  val rules: Output[js.Array[PlanRule]] = js.native
  /**
    * Metadata that you can assign to help organize the plans you create.
    */
  val tags: Output[js.UndefOr[StringDictionary[_]]] = js.native
  /**
    * Unique, randomly generated, Unicode, UTF-8 encoded string that serves as the version ID of the backup plan.
    */
  val version: Output[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/backup/plan", "Plan")
@js.native
object Plan extends js.Object {
  /**
    * Get an existing Plan resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): Plan = js.native
  def get(name: String, id: Input[ID], state: PlanState): Plan = js.native
  def get(name: String, id: Input[ID], state: PlanState, opts: CustomResourceOptions): Plan = js.native
  /**
    * Returns true if the given object is an instance of Plan.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/backup/plan.Plan */ Boolean = js.native
}


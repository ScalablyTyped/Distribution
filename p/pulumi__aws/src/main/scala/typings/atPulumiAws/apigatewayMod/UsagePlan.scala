package typings.atPulumiAws.apigatewayMod

import typings.atPulumiAws.apigatewayUsagePlanMod.UsagePlanArgs
import typings.atPulumiAws.apigatewayUsagePlanMod.UsagePlanState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/apigateway", "UsagePlan")
@js.native
class UsagePlan protected ()
  extends typings.atPulumiAws.apigatewayUsagePlanMod.UsagePlan {
  /**
    * Create a UsagePlan resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: UsagePlanArgs) = this()
  def this(name: String, args: UsagePlanArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/apigateway", "UsagePlan")
@js.native
object UsagePlan extends js.Object {
  /**
    * Get an existing UsagePlan resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typings.atPulumiAws.apigatewayUsagePlanMod.UsagePlan = js.native
  def get(name: String, id: Input[ID], state: UsagePlanState): typings.atPulumiAws.apigatewayUsagePlanMod.UsagePlan = js.native
  def get(name: String, id: Input[ID], state: UsagePlanState, opts: CustomResourceOptions): typings.atPulumiAws.apigatewayUsagePlanMod.UsagePlan = js.native
  /**
    * Returns true if the given object is an instance of UsagePlan.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigateway/usagePlan.UsagePlan */ Boolean = js.native
}


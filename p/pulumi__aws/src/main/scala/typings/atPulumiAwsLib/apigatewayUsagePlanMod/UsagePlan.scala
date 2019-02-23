package typings
package atPulumiAwsLib.apigatewayUsagePlanMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/apigateway/usagePlan", "UsagePlan")
@js.native
class UsagePlan protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a UsagePlan resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String) = this()
  def this(name: java.lang.String, args: UsagePlanArgs) = this()
  def this(name: java.lang.String, args: UsagePlanArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * The associated API stages of the usage plan.
    */
  val apiStages: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[js.Array[atPulumiAwsLib.Anon_ApiId]]] = js.native
  /**
    * The description of a usage plan.
    */
  val description: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The name of the usage plan.
    */
  val name: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * The AWS Markeplace product identifier to associate with the usage plan as a SaaS product on AWS Marketplace.
    */
  val productCode: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The quota settings of the usage plan.
    */
  val quotaSettings: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[atPulumiAwsLib.Anon_Limit]] = js.native
  /**
    * The throttling limits of the usage plan.
    */
  val throttleSettings: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[atPulumiAwsLib.Anon_BurstLimitRateLimitNumber]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/apigateway/usagePlan", "UsagePlan")
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
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.apigatewayUsagePlanMod.UsagePlan = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.apigatewayUsagePlanMod.UsagePlanState
  ): atPulumiAwsLib.apigatewayUsagePlanMod.UsagePlan = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.apigatewayUsagePlanMod.UsagePlanState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.apigatewayUsagePlanMod.UsagePlan = js.native
}


package typings
package atPulumiAwsLib.servicequotasServiceQuotaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/servicequotas/serviceQuota", "ServiceQuota")
@js.native
class ServiceQuota protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a ServiceQuota resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: ServiceQuotaArgs) = this()
  def this(name: java.lang.String, args: ServiceQuotaArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * Whether the service quota can be increased.
    */
  val adjustable: atPulumiPulumiLib.outputMod.Output[scala.Boolean] = js.native
  /**
    * Amazon Resource Name (ARN) of the service quota.
    */
  val arn: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * Default value of the service quota.
    */
  val defaultValue: atPulumiPulumiLib.outputMod.Output[scala.Double] = js.native
  /**
    * Code of the service quota to track. For example: `L-F678F1CE`. Available values can be found with the [AWS CLI service-quotas list-service-quotas command](https://docs.aws.amazon.com/cli/latest/reference/service-quotas/list-service-quotas.html).
    */
  val quotaCode: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * Name of the quota.
    */
  val quotaName: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  val requestId: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  val requestStatus: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * Code of the service to track. For example: `vpc`. Available values can be found with the [AWS CLI service-quotas list-services command](https://docs.aws.amazon.com/cli/latest/reference/service-quotas/list-services.html).
    */
  val serviceCode: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * Name of the service.
    */
  val serviceName: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * Float specifying the desired value for the service quota. If the desired value is higher than the current value, a quota increase request is submitted. When a known request is submitted and pending, the value reflects the desired value of the pending request.
    */
  val value: atPulumiPulumiLib.outputMod.Output[scala.Double] = js.native
}

/* static members */
@JSImport("@pulumi/aws/servicequotas/serviceQuota", "ServiceQuota")
@js.native
object ServiceQuota extends js.Object {
  /**
    * Get an existing ServiceQuota resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.servicequotasServiceQuotaMod.ServiceQuota = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.servicequotasServiceQuotaMod.ServiceQuotaState
  ): atPulumiAwsLib.servicequotasServiceQuotaMod.ServiceQuota = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.servicequotasServiceQuotaMod.ServiceQuotaState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.servicequotasServiceQuotaMod.ServiceQuota = js.native
  /**
    * Returns true if the given object is an instance of ServiceQuota.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/servicequotas/serviceQuota.ServiceQuota */ scala.Boolean = js.native
}


package typings.atPulumiAws.servicequotasServiceQuotaMod

import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/servicequotas/serviceQuota", "ServiceQuota")
@js.native
class ServiceQuota protected () extends CustomResource {
  /**
    * Create a ServiceQuota resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: ServiceQuotaArgs) = this()
  def this(name: String, args: ServiceQuotaArgs, opts: CustomResourceOptions) = this()
  /**
    * Whether the service quota can be increased.
    */
  val adjustable: Output[Boolean] = js.native
  /**
    * Amazon Resource Name (ARN) of the service quota.
    */
  val arn: Output[String] = js.native
  /**
    * Default value of the service quota.
    */
  val defaultValue: Output[Double] = js.native
  /**
    * Code of the service quota to track. For example: `L-F678F1CE`. Available values can be found with the [AWS CLI service-quotas list-service-quotas command](https://docs.aws.amazon.com/cli/latest/reference/service-quotas/list-service-quotas.html).
    */
  val quotaCode: Output[String] = js.native
  /**
    * Name of the quota.
    */
  val quotaName: Output[String] = js.native
  val requestId: Output[String] = js.native
  val requestStatus: Output[String] = js.native
  /**
    * Code of the service to track. For example: `vpc`. Available values can be found with the [AWS CLI service-quotas list-services command](https://docs.aws.amazon.com/cli/latest/reference/service-quotas/list-services.html).
    */
  val serviceCode: Output[String] = js.native
  /**
    * Name of the service.
    */
  val serviceName: Output[String] = js.native
  /**
    * Float specifying the desired value for the service quota. If the desired value is higher than the current value, a quota increase request is submitted. When a known request is submitted and pending, the value reflects the desired value of the pending request.
    */
  val value: Output[Double] = js.native
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
  def get(name: String, id: Input[ID]): ServiceQuota = js.native
  def get(name: String, id: Input[ID], state: ServiceQuotaState): ServiceQuota = js.native
  def get(name: String, id: Input[ID], state: ServiceQuotaState, opts: CustomResourceOptions): ServiceQuota = js.native
  /**
    * Returns true if the given object is an instance of ServiceQuota.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/servicequotas/serviceQuota.ServiceQuota */ Boolean = js.native
}


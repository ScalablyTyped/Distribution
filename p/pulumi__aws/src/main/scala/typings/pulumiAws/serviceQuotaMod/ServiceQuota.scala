package typings.pulumiAws.serviceQuotaMod

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
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
  val adjustable: Output_[Boolean] = js.native
  /**
    * Amazon Resource Name (ARN) of the service quota.
    */
  val arn: Output_[String] = js.native
  /**
    * Default value of the service quota.
    */
  val defaultValue: Output_[Double] = js.native
  /**
    * Code of the service quota to track. For example: `L-F678F1CE`. Available values can be found with the [AWS CLI service-quotas list-service-quotas command](https://docs.aws.amazon.com/cli/latest/reference/service-quotas/list-service-quotas.html).
    */
  val quotaCode: Output_[String] = js.native
  /**
    * Name of the quota.
    */
  val quotaName: Output_[String] = js.native
  val requestId: Output_[String] = js.native
  val requestStatus: Output_[String] = js.native
  /**
    * Code of the service to track. For example: `vpc`. Available values can be found with the [AWS CLI service-quotas list-services command](https://docs.aws.amazon.com/cli/latest/reference/service-quotas/list-services.html).
    */
  val serviceCode: Output_[String] = js.native
  /**
    * Name of the service.
    */
  val serviceName: Output_[String] = js.native
  /**
    * Float specifying the desired value for the service quota. If the desired value is higher than the current value, a quota increase request is submitted. When a known request is submitted and pending, the value reflects the desired value of the pending request.
    */
  val value: Output_[Double] = js.native
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
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): ServiceQuota = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): ServiceQuota = js.native
  def get(name: String, id: Input[ID], state: ServiceQuotaState): ServiceQuota = js.native
  def get(name: String, id: Input[ID], state: ServiceQuotaState, opts: CustomResourceOptions): ServiceQuota = js.native
  /**
    * Returns true if the given object is an instance of ServiceQuota.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/servicequotas/serviceQuota.ServiceQuota */ Boolean = js.native
}


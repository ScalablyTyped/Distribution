package typings.pulumiAws.targetMod

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/appautoscaling/target", "Target")
@js.native
class Target protected () extends CustomResource {
  /**
    * Create a Target resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: TargetArgs) = this()
  def this(name: String, args: TargetArgs, opts: CustomResourceOptions) = this()
  /**
    * The max capacity of the scalable target.
    */
  val maxCapacity: Output_[Double] = js.native
  /**
    * The min capacity of the scalable target.
    */
  val minCapacity: Output_[Double] = js.native
  /**
    * The resource type and unique identifier string for the resource associated with the scaling policy. Documentation can be found in the `ResourceId` parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_RegisterScalableTarget.html#API_RegisterScalableTarget_RequestParameters)
    */
  val resourceId: Output_[String] = js.native
  /**
    * The ARN of the IAM role that allows Application AutoScaling to modify your scalable target on your behalf. This defaults to an IAM Service-Linked Role for most services and custom IAM Roles are ignored by the API for those namespaces. See the [AWS Application Auto Scaling documentation](https://docs.aws.amazon.com/autoscaling/application/userguide/security_iam_service-with-iam.html#security_iam_service-with-iam-roles) for more information about how this service interacts with IAM.
    */
  val roleArn: Output_[String] = js.native
  /**
    * The scalable dimension of the scalable target. Documentation can be found in the `ScalableDimension` parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_RegisterScalableTarget.html#API_RegisterScalableTarget_RequestParameters)
    */
  val scalableDimension: Output_[String] = js.native
  /**
    * The AWS service namespace of the scalable target. Documentation can be found in the `ServiceNamespace` parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_RegisterScalableTarget.html#API_RegisterScalableTarget_RequestParameters)
    */
  val serviceNamespace: Output_[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/appautoscaling/target", "Target")
@js.native
object Target extends js.Object {
  /**
    * Get an existing Target resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): Target = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Target = js.native
  def get(name: String, id: Input[ID], state: TargetState): Target = js.native
  def get(name: String, id: Input[ID], state: TargetState, opts: CustomResourceOptions): Target = js.native
  /**
    * Returns true if the given object is an instance of Target.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/appautoscaling/target.Target */ Boolean = js.native
}


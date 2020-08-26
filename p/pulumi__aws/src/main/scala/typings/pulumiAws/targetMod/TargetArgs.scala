package typings.pulumiAws.targetMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TargetArgs extends js.Object {
  /**
    * The max capacity of the scalable target.
    */
  val maxCapacity: Input[Double] = js.native
  /**
    * The min capacity of the scalable target.
    */
  val minCapacity: Input[Double] = js.native
  /**
    * The resource type and unique identifier string for the resource associated with the scaling policy. Documentation can be found in the `ResourceId` parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_RegisterScalableTarget.html#API_RegisterScalableTarget_RequestParameters)
    */
  val resourceId: Input[String] = js.native
  /**
    * The ARN of the IAM role that allows Application AutoScaling to modify your scalable target on your behalf. This defaults to an IAM Service-Linked Role for most services and custom IAM Roles are ignored by the API for those namespaces. See the [AWS Application Auto Scaling documentation](https://docs.aws.amazon.com/autoscaling/application/userguide/security_iam_service-with-iam.html#security_iam_service-with-iam-roles) for more information about how this service interacts with IAM.
    */
  val roleArn: js.UndefOr[Input[String]] = js.native
  /**
    * The scalable dimension of the scalable target. Documentation can be found in the `ScalableDimension` parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_RegisterScalableTarget.html#API_RegisterScalableTarget_RequestParameters)
    */
  val scalableDimension: Input[String] = js.native
  /**
    * The AWS service namespace of the scalable target. Documentation can be found in the `ServiceNamespace` parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_RegisterScalableTarget.html#API_RegisterScalableTarget_RequestParameters)
    */
  val serviceNamespace: Input[String] = js.native
}

object TargetArgs {
  @scala.inline
  def apply(
    maxCapacity: Input[Double],
    minCapacity: Input[Double],
    resourceId: Input[String],
    scalableDimension: Input[String],
    serviceNamespace: Input[String]
  ): TargetArgs = {
    val __obj = js.Dynamic.literal(maxCapacity = maxCapacity.asInstanceOf[js.Any], minCapacity = minCapacity.asInstanceOf[js.Any], resourceId = resourceId.asInstanceOf[js.Any], scalableDimension = scalableDimension.asInstanceOf[js.Any], serviceNamespace = serviceNamespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetArgs]
  }
  @scala.inline
  implicit class TargetArgsOps[Self <: TargetArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMaxCapacity(value: Input[Double]): Self = this.set("maxCapacity", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinCapacity(value: Input[Double]): Self = this.set("minCapacity", value.asInstanceOf[js.Any])
    @scala.inline
    def setResourceId(value: Input[String]): Self = this.set("resourceId", value.asInstanceOf[js.Any])
    @scala.inline
    def setScalableDimension(value: Input[String]): Self = this.set("scalableDimension", value.asInstanceOf[js.Any])
    @scala.inline
    def setServiceNamespace(value: Input[String]): Self = this.set("serviceNamespace", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoleArn(value: Input[String]): Self = this.set("roleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoleArn: Self = this.set("roleArn", js.undefined)
  }
  
}


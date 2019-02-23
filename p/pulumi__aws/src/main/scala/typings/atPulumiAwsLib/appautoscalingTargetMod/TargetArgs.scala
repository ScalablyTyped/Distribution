package typings
package atPulumiAwsLib.appautoscalingTargetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetArgs extends js.Object {
  /**
    * The max capacity of the scalable target.
    */
  val maxCapacity: atPulumiPulumiLib.outputMod.Input[scala.Double]
  /**
    * The min capacity of the scalable target.
    */
  val minCapacity: atPulumiPulumiLib.outputMod.Input[scala.Double]
  /**
    * The resource type and unique identifier string for the resource associated with the scaling policy. Documentation can be found in the `ResourceId` parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_RegisterScalableTarget.html#API_RegisterScalableTarget_RequestParameters)
    */
  val resourceId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The ARN of the IAM role that allows Application
    * AutoScaling to modify your scalable target on your behalf.
    */
  val roleArn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The scalable dimension of the scalable target. Documentation can be found in the `ScalableDimension` parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_RegisterScalableTarget.html#API_RegisterScalableTarget_RequestParameters)
    */
  val scalableDimension: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The AWS service namespace of the scalable target. Documentation can be found in the `ServiceNamespace` parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_RegisterScalableTarget.html#API_RegisterScalableTarget_RequestParameters)
    */
  val serviceNamespace: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}


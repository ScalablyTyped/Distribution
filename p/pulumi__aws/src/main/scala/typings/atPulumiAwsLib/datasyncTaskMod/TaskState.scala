package typings
package atPulumiAwsLib.datasyncTaskMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskState extends js.Object {
  /**
    * Amazon Resource Name (ARN) of the DataSync Task.
    */
  val arn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Amazon Resource Name (ARN) of the CloudWatch Log Group that is used to monitor and log events in the sync task.
    */
  val cloudwatchLogGroupArn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.arnMod.ARN]] = js.undefined
  /**
    * Amazon Resource Name (ARN) of destination DataSync Location.
    */
  val destinationLocationArn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.arnMod.ARN]] = js.undefined
  /**
    * Name of the DataSync Task.
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Configuration block containing option that controls the default behavior when you start an execution of this DataSync Task. For each individual task execution, you can override these options by specifying an overriding configuration in those executions.
    */
  val options: js.UndefOr[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_AtimeBytesPerSecond]] = js.undefined
  /**
    * Amazon Resource Name (ARN) of source DataSync Location.
    */
  val sourceLocationArn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.arnMod.ARN]] = js.undefined
  /**
    * Key-value pairs of resource tags to assign to the DataSync Task.
    */
  val tags: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[
      org.scalablytyped.runtime.StringDictionary[atPulumiPulumiLib.outputMod.Input[java.lang.String]]
    ]
  ] = js.undefined
}


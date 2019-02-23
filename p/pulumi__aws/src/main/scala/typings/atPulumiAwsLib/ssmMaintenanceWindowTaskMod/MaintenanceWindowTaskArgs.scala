package typings
package atPulumiAwsLib.ssmMaintenanceWindowTaskMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaintenanceWindowTaskArgs extends js.Object {
  /**
    * The description of the maintenance window task.
    */
  val description: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * A structure containing information about an Amazon S3 bucket to write instance-level logs to. Documented below.
    */
  val loggingInfo: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_S3BucketNameS3BucketPrefixS3Region]
  ] = js.undefined
  /**
    * The maximum number of targets this task can be run for in parallel.
    */
  val maxConcurrency: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The maximum number of errors allowed before this task stops being scheduled.
    */
  val maxErrors: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The priority of the task in the Maintenance Window, the lower the number the higher the priority. Tasks in a Maintenance Window are scheduled in priority order with tasks that have the same priority scheduled in parallel.
    */
  val priority: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  /**
    * The role that should be assumed when executing the task.
    */
  val serviceRoleArn: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The targets (either instances or window target ids). Instances are specified using Key=InstanceIds,Values=instanceid1,instanceid2. Window target ids are specified using Key=WindowTargetIds,Values=window target id1, window target id2.
    */
  val targets: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_KeyValuesArray]]]
  /**
    * The ARN of the task to execute.
    */
  val taskArn: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * A structure containing information about parameters required by the particular `task_arn`. Documented below.
    */
  val taskParameters: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_NameValuesArray]]]
  ] = js.undefined
  /**
    * The type of task being registered. The only allowed value is `RUN_COMMAND`.
    */
  val taskType: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The Id of the maintenance window to register the task with.
    */
  val windowId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}


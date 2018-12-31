package typings
package atPulumiAwsLib.ssmMaintenanceWindowTaskMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaintenanceWindowTaskArgs extends js.Object {
  /**
    * The description of the maintenance window task.
    */
  val description: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * A structure containing information about an Amazon S3 bucket to write instance-level logs to. Documented below.
    */
  val loggingInfo: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_S3BucketName]] = js.undefined
  /**
    * The maximum number of targets this task can be run for in parallel.
    */
  val maxConcurrency: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * The maximum number of errors allowed before this task stops being scheduled.
    */
  val maxErrors: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  val name: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The priority of the task in the Maintenance Window, the lower the number the higher the priority. Tasks in a Maintenance Window are scheduled in priority order with tasks that have the same priority scheduled in parallel.
    */
  val priority: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
  /**
    * The role that should be assumed when executing the task.
    */
  val serviceRoleArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * The targets (either instances or window target ids). Instances are specified using Key=InstanceIds,Values=instanceid1,instanceid2. Window target ids are specified using Key=WindowTargetIds,Values=window target id1, window target id2.
    */
  val targets: atPulumiPulumiLib.resourceMod.Input[
    js.Array[atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_ValuesKeyInput]]
  ]
  /**
    * The ARN of the task to execute.
    */
  val taskArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * A structure containing information about parameters required by the particular `task_arn`. Documented below.
    */
  val taskParameters: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_ValuesName]]]
  ] = js.undefined
  /**
    * The type of task being registered. The only allowed value is `RUN_COMMAND`.
    */
  val taskType: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * The Id of the maintenance window to register the task with.
    */
  val windowId: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}


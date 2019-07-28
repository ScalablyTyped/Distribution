package typings.atPulumiAws.glueTriggerMod

import typings.atPulumiAws.Anon_ArgumentsJobName
import typings.atPulumiAws.Anon_ConditionsLogical
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TriggerState extends js.Object {
  /**
    * List of actions initiated by this trigger when it fires. Defined below.
    */
  val actions: js.UndefOr[Input[js.Array[Input[Anon_ArgumentsJobName]]]] = js.undefined
  /**
    * A description of the new trigger.
    */
  val description: js.UndefOr[Input[String]] = js.undefined
  /**
    * Start the trigger. Defaults to `true`. Not valid to disable for `ON_DEMAND` type.
    */
  val enabled: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * The name of the trigger.
    */
  val name: js.UndefOr[Input[String]] = js.undefined
  /**
    * A predicate to specify when the new trigger should fire. Required when trigger type is `CONDITIONAL`. Defined below.
    */
  val predicate: js.UndefOr[Input[Anon_ConditionsLogical]] = js.undefined
  /**
    * A cron expression used to specify the schedule. [Time-Based Schedules for Jobs and Crawlers](https://docs.aws.amazon.com/glue/latest/dg/monitor-data-warehouse-schedule.html)
    */
  val schedule: js.UndefOr[Input[String]] = js.undefined
  /**
    * The type of trigger. Valid values are `CONDITIONAL`, `ON_DEMAND`, and `SCHEDULED`.
    */
  val `type`: js.UndefOr[Input[String]] = js.undefined
}

object TriggerState {
  @scala.inline
  def apply(
    actions: Input[js.Array[Input[Anon_ArgumentsJobName]]] = null,
    description: Input[String] = null,
    enabled: Input[Boolean] = null,
    name: Input[String] = null,
    predicate: Input[Anon_ConditionsLogical] = null,
    schedule: Input[String] = null,
    `type`: Input[String] = null
  ): TriggerState = {
    val __obj = js.Dynamic.literal()
    if (actions != null) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (enabled != null) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (predicate != null) __obj.updateDynamic("predicate")(predicate.asInstanceOf[js.Any])
    if (schedule != null) __obj.updateDynamic("schedule")(schedule.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TriggerState]
  }
}


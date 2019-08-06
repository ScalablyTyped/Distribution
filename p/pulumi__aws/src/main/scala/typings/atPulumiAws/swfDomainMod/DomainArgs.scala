package typings.atPulumiAws.swfDomainMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DomainArgs extends js.Object {
  /**
    * The domain description.
    */
  val description: js.UndefOr[Input[String]] = js.undefined
  /**
    * The name of the domain. If omitted, this provider will assign a random, unique name.
    */
  val name: js.UndefOr[Input[String]] = js.undefined
  /**
    * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
    */
  val namePrefix: js.UndefOr[Input[String]] = js.undefined
  /**
    * Length of time that SWF will continue to retain information about the workflow execution after the workflow execution is complete, must be between 0 and 90 days.
    */
  val workflowExecutionRetentionPeriodInDays: Input[String]
}

object DomainArgs {
  @scala.inline
  def apply(
    workflowExecutionRetentionPeriodInDays: Input[String],
    description: Input[String] = null,
    name: Input[String] = null,
    namePrefix: Input[String] = null
  ): DomainArgs = {
    val __obj = js.Dynamic.literal(workflowExecutionRetentionPeriodInDays = workflowExecutionRetentionPeriodInDays.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (namePrefix != null) __obj.updateDynamic("namePrefix")(namePrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainArgs]
  }
}


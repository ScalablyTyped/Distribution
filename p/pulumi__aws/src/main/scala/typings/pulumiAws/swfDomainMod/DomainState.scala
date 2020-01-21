package typings.pulumiAws.swfDomainMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomainState extends js.Object {
  /**
    * Amazon Resource Name (ARN)
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * The domain description.
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the domain. If omitted, this provider will assign a random, unique name.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
    */
  val namePrefix: js.UndefOr[Input[String]] = js.native
  /**
    * Key-value mapping of resource tags
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * Length of time that SWF will continue to retain information about the workflow execution after the workflow execution is complete, must be between 0 and 90 days.
    */
  val workflowExecutionRetentionPeriodInDays: js.UndefOr[Input[String]] = js.native
}

object DomainState {
  @scala.inline
  def apply(
    arn: Input[String] = null,
    description: Input[String] = null,
    name: Input[String] = null,
    namePrefix: Input[String] = null,
    tags: Input[StringDictionary[_]] = null,
    workflowExecutionRetentionPeriodInDays: Input[String] = null
  ): DomainState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (namePrefix != null) __obj.updateDynamic("namePrefix")(namePrefix.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (workflowExecutionRetentionPeriodInDays != null) __obj.updateDynamic("workflowExecutionRetentionPeriodInDays")(workflowExecutionRetentionPeriodInDays.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainState]
  }
}


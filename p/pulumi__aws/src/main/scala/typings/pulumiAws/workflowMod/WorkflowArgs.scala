package typings.pulumiAws.workflowMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkflowArgs extends js.Object {
  /**
    * A map of default run properties for this workflow. These properties are passed to all jobs associated to the workflow.
    */
  val defaultRunProperties: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * Description of the workflow.
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * The name you assign to this workflow.
    */
  val name: js.UndefOr[Input[String]] = js.native
}

object WorkflowArgs {
  @scala.inline
  def apply(
    defaultRunProperties: Input[StringDictionary[_]] = null,
    description: Input[String] = null,
    name: Input[String] = null
  ): WorkflowArgs = {
    val __obj = js.Dynamic.literal()
    if (defaultRunProperties != null) __obj.updateDynamic("defaultRunProperties")(defaultRunProperties.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkflowArgs]
  }
}


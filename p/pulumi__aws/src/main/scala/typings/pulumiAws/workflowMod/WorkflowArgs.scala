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
  def apply(): WorkflowArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkflowArgs]
  }
  @scala.inline
  implicit class WorkflowArgsOps[Self <: WorkflowArgs] (val x: Self) extends AnyVal {
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
    def setDefaultRunProperties(value: Input[StringDictionary[_]]): Self = this.set("defaultRunProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultRunProperties: Self = this.set("defaultRunProperties", js.undefined)
    @scala.inline
    def setDescription(value: Input[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}


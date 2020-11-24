package typings.pulumiAws.workflowMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkflowState extends js.Object {
  
  /**
    * Amazon Resource Name (ARN) of Glue Workflow
    */
  val arn: js.UndefOr[Input[String]] = js.native
  
  /**
    * A map of default run properties for this workflow. These properties are passed to all jobs associated to the workflow.
    */
  val defaultRunProperties: js.UndefOr[Input[StringDictionary[_]]] = js.native
  
  /**
    * Description of the workflow.
    */
  val description: js.UndefOr[Input[String]] = js.native
  
  /**
    * Prevents exceeding the maximum number of concurrent runs of any of the component jobs. If you leave this parameter blank, there is no limit to the number of concurrent workflow runs.
    */
  val maxConcurrentRuns: js.UndefOr[Input[Double]] = js.native
  
  /**
    * The name you assign to this workflow.
    */
  val name: js.UndefOr[Input[String]] = js.native
  
  /**
    * Key-value map of resource tags
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
}
object WorkflowState {
  
  @scala.inline
  def apply(): WorkflowState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkflowState]
  }
  
  @scala.inline
  implicit class WorkflowStateOps[Self <: WorkflowState] (val x: Self) extends AnyVal {
    
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
    def setArn(value: Input[String]): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    
    @scala.inline
    def setDefaultRunProperties(value: Input[StringDictionary[_]]): Self = this.set("defaultRunProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultRunProperties: Self = this.set("defaultRunProperties", js.undefined)
    
    @scala.inline
    def setDescription(value: Input[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setMaxConcurrentRuns(value: Input[Double]): Self = this.set("maxConcurrentRuns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxConcurrentRuns: Self = this.set("maxConcurrentRuns", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}

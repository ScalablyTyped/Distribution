package typings.pulumiAws.jobQueueMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JobQueueArgs extends js.Object {
  
  /**
    * Specifies the set of compute environments
    * mapped to a job queue and their order.  The position of the compute environments
    * in the list will dictate the order. You can associate up to 3 compute environments
    * with a job queue.
    */
  val computeEnvironments: Input[js.Array[Input[String]]] = js.native
  
  /**
    * Specifies the name of the job queue.
    */
  val name: js.UndefOr[Input[String]] = js.native
  
  /**
    * The priority of the job queue. Job queues with a higher priority
    * are evaluated first when associated with the same compute environment.
    */
  val priority: Input[Double] = js.native
  
  /**
    * The state of the job queue. Must be one of: `ENABLED` or `DISABLED`
    */
  val state: Input[String] = js.native
  
  /**
    * Key-value map of resource tags
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
}
object JobQueueArgs {
  
  @scala.inline
  def apply(computeEnvironments: Input[js.Array[Input[String]]], priority: Input[Double], state: Input[String]): JobQueueArgs = {
    val __obj = js.Dynamic.literal(computeEnvironments = computeEnvironments.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobQueueArgs]
  }
  
  @scala.inline
  implicit class JobQueueArgsOps[Self <: JobQueueArgs] (val x: Self) extends AnyVal {
    
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
    def setComputeEnvironmentsVarargs(value: Input[String]*): Self = this.set("computeEnvironments", js.Array(value :_*))
    
    @scala.inline
    def setComputeEnvironments(value: Input[js.Array[Input[String]]]): Self = this.set("computeEnvironments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriority(value: Input[Double]): Self = this.set("priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: Input[String]): Self = this.set("state", value.asInstanceOf[js.Any])
    
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

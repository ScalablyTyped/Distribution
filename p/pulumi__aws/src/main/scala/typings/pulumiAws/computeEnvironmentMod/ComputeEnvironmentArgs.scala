package typings.pulumiAws.computeEnvironmentMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.batch.ComputeEnvironmentComputeResources
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComputeEnvironmentArgs extends js.Object {
  
  /**
    * The name for your compute environment. Up to 128 letters (uppercase and lowercase), numbers, and underscores are allowed. If omitted, this provider will assign a random, unique name.
    */
  val computeEnvironmentName: js.UndefOr[Input[String]] = js.native
  
  /**
    * Creates a unique compute environment name beginning with the specified prefix. Conflicts with `computeEnvironmentName`.
    */
  val computeEnvironmentNamePrefix: js.UndefOr[Input[String]] = js.native
  
  /**
    * Details of the compute resources managed by the compute environment. This parameter is required for managed compute environments. See details below.
    */
  val computeResources: js.UndefOr[Input[ComputeEnvironmentComputeResources]] = js.native
  
  /**
    * The full Amazon Resource Name (ARN) of the IAM role that allows AWS Batch to make calls to other AWS services on your behalf.
    */
  val serviceRole: Input[String] = js.native
  
  /**
    * The state of the compute environment. If the state is `ENABLED`, then the compute environment accepts jobs from a queue and can scale out automatically based on queues. Valid items are `ENABLED` or `DISABLED`. Defaults to `ENABLED`.
    */
  val state: js.UndefOr[Input[String]] = js.native
  
  /**
    * Key-value pair tags to be applied to resources that are launched in the compute environment.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  
  /**
    * The type of compute environment. Valid items are `EC2` or `SPOT`.
    */
  val `type`: Input[String] = js.native
}
object ComputeEnvironmentArgs {
  
  @scala.inline
  def apply(serviceRole: Input[String], `type`: Input[String]): ComputeEnvironmentArgs = {
    val __obj = js.Dynamic.literal(serviceRole = serviceRole.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComputeEnvironmentArgs]
  }
  
  @scala.inline
  implicit class ComputeEnvironmentArgsOps[Self <: ComputeEnvironmentArgs] (val x: Self) extends AnyVal {
    
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
    def setServiceRole(value: Input[String]): Self = this.set("serviceRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Input[String]): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComputeEnvironmentName(value: Input[String]): Self = this.set("computeEnvironmentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComputeEnvironmentName: Self = this.set("computeEnvironmentName", js.undefined)
    
    @scala.inline
    def setComputeEnvironmentNamePrefix(value: Input[String]): Self = this.set("computeEnvironmentNamePrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComputeEnvironmentNamePrefix: Self = this.set("computeEnvironmentNamePrefix", js.undefined)
    
    @scala.inline
    def setComputeResources(value: Input[ComputeEnvironmentComputeResources]): Self = this.set("computeResources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComputeResources: Self = this.set("computeResources", js.undefined)
    
    @scala.inline
    def setState(value: Input[String]): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}

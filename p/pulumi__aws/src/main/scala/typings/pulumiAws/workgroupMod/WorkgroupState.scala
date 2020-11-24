package typings.pulumiAws.workgroupMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.athena.WorkgroupConfiguration
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkgroupState extends js.Object {
  
  /**
    * Amazon Resource Name (ARN) of the workgroup
    */
  val arn: js.UndefOr[Input[String]] = js.native
  
  /**
    * Configuration block with various settings for the workgroup. Documented below.
    */
  val configuration: js.UndefOr[Input[WorkgroupConfiguration]] = js.native
  
  /**
    * Description of the workgroup.
    */
  val description: js.UndefOr[Input[String]] = js.native
  
  /**
    * The option to delete the workgroup and its contents even if the workgroup contains any named queries.
    */
  val forceDestroy: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * Name of the workgroup.
    */
  val name: js.UndefOr[Input[String]] = js.native
  
  /**
    * State of the workgroup. Valid values are `DISABLED` or `ENABLED`. Defaults to `ENABLED`.
    */
  val state: js.UndefOr[Input[String]] = js.native
  
  /**
    * Key-value map of resource tags for the workgroup.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
}
object WorkgroupState {
  
  @scala.inline
  def apply(): WorkgroupState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkgroupState]
  }
  
  @scala.inline
  implicit class WorkgroupStateOps[Self <: WorkgroupState] (val x: Self) extends AnyVal {
    
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
    def setConfiguration(value: Input[WorkgroupConfiguration]): Self = this.set("configuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfiguration: Self = this.set("configuration", js.undefined)
    
    @scala.inline
    def setDescription(value: Input[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setForceDestroy(value: Input[Boolean]): Self = this.set("forceDestroy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForceDestroy: Self = this.set("forceDestroy", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
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

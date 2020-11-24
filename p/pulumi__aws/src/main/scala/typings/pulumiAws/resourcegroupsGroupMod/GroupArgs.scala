package typings.pulumiAws.resourcegroupsGroupMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.resourcegroups.GroupResourceQuery
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GroupArgs extends js.Object {
  
  /**
    * A description of the resource group.
    */
  val description: js.UndefOr[Input[String]] = js.native
  
  /**
    * The resource group's name. A resource group name can have a maximum of 127 characters, including letters, numbers, hyphens, dots, and underscores. The name cannot start with `AWS` or `aws`.
    */
  val name: js.UndefOr[Input[String]] = js.native
  
  /**
    * A `resourceQuery` block. Resource queries are documented below.
    */
  val resourceQuery: Input[GroupResourceQuery] = js.native
  
  /**
    * Key-value map of resource tags
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
}
object GroupArgs {
  
  @scala.inline
  def apply(resourceQuery: Input[GroupResourceQuery]): GroupArgs = {
    val __obj = js.Dynamic.literal(resourceQuery = resourceQuery.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupArgs]
  }
  
  @scala.inline
  implicit class GroupArgsOps[Self <: GroupArgs] (val x: Self) extends AnyVal {
    
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
    def setResourceQuery(value: Input[GroupResourceQuery]): Self = this.set("resourceQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: Input[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
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

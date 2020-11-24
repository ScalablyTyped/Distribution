package typings.pulumiAws.getResourceShareMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.ram.GetResourceShareFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetResourceShareArgs extends js.Object {
  
  /**
    * A filter used to scope the list e.g. by tags. See [related docs] (https://docs.aws.amazon.com/ram/latest/APIReference/API_TagFilter.html).
    */
  val filters: js.UndefOr[js.Array[GetResourceShareFilter]] = js.native
  
  /**
    * The name of the tag key to filter on.
    */
  val name: String = js.native
  
  /**
    * The owner of the resource share. Valid values are SELF or OTHER-ACCOUNTS
    */
  val resourceOwner: String = js.native
  
  /**
    * The Tags attached to the RAM share
    */
  val tags: js.UndefOr[StringDictionary[String]] = js.native
}
object GetResourceShareArgs {
  
  @scala.inline
  def apply(name: String, resourceOwner: String): GetResourceShareArgs = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], resourceOwner = resourceOwner.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResourceShareArgs]
  }
  
  @scala.inline
  implicit class GetResourceShareArgsOps[Self <: GetResourceShareArgs] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceOwner(value: String): Self = this.set("resourceOwner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersVarargs(value: GetResourceShareFilter*): Self = this.set("filters", js.Array(value :_*))
    
    @scala.inline
    def setFilters(value: js.Array[GetResourceShareFilter]): Self = this.set("filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    
    @scala.inline
    def setTags(value: StringDictionary[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}

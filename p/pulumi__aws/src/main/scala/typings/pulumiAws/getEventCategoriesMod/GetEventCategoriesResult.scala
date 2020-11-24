package typings.pulumiAws.getEventCategoriesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetEventCategoriesResult extends js.Object {
  
  /**
    * A list of the event categories.
    */
  val eventCategories: js.Array[String] = js.native
  
  /**
    * The provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  
  val sourceType: js.UndefOr[String] = js.native
}
object GetEventCategoriesResult {
  
  @scala.inline
  def apply(eventCategories: js.Array[String], id: String): GetEventCategoriesResult = {
    val __obj = js.Dynamic.literal(eventCategories = eventCategories.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetEventCategoriesResult]
  }
  
  @scala.inline
  implicit class GetEventCategoriesResultOps[Self <: GetEventCategoriesResult] (val x: Self) extends AnyVal {
    
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
    def setEventCategoriesVarargs(value: String*): Self = this.set("eventCategories", js.Array(value :_*))
    
    @scala.inline
    def setEventCategories(value: js.Array[String]): Self = this.set("eventCategories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceType(value: String): Self = this.set("sourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceType: Self = this.set("sourceType", js.undefined)
  }
}

package typings.pulumiAws.getPlanMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetPlanArgs extends js.Object {
  
  /**
    * The backup plan ID.
    */
  val planId: String = js.native
  
  /**
    * Metadata that you can assign to help organize the plans you create.
    */
  val tags: js.UndefOr[StringDictionary[String]] = js.native
}
object GetPlanArgs {
  
  @scala.inline
  def apply(planId: String): GetPlanArgs = {
    val __obj = js.Dynamic.literal(planId = planId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPlanArgs]
  }
  
  @scala.inline
  implicit class GetPlanArgsOps[Self <: GetPlanArgs] (val x: Self) extends AnyVal {
    
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
    def setPlanId(value: String): Self = this.set("planId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: StringDictionary[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}

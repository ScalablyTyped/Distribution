package typings.psi.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Experience extends js.Object {
  
  var id: String = js.native
  
  var initial_url: String = js.native
  
  var metrics: StringDictionary[typings.psi.anon.Category] = js.native
  
  var overall_category: String = js.native
}
object Experience {
  
  @scala.inline
  def apply(
    id: String,
    initial_url: String,
    metrics: StringDictionary[typings.psi.anon.Category],
    overall_category: String
  ): Experience = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], initial_url = initial_url.asInstanceOf[js.Any], metrics = metrics.asInstanceOf[js.Any], overall_category = overall_category.asInstanceOf[js.Any])
    __obj.asInstanceOf[Experience]
  }
  
  @scala.inline
  implicit class ExperienceOps[Self <: Experience] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitial_url(value: String): Self = this.set("initial_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetrics(value: StringDictionary[typings.psi.anon.Category]): Self = this.set("metrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverall_category(value: String): Self = this.set("overall_category", value.asInstanceOf[js.Any])
  }
}

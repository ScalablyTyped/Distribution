package typings.sentryTypes.breadcrumbMod

import org.scalablytyped.runtime.StringDictionary
import typings.sentryTypes.severityMod.Severity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Breadcrumb extends js.Object {
  
  var category: js.UndefOr[String] = js.native
  
  var data: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  var event_id: js.UndefOr[String] = js.native
  
  var level: js.UndefOr[Severity] = js.native
  
  var message: js.UndefOr[String] = js.native
  
  var timestamp: js.UndefOr[Double] = js.native
  
  var `type`: js.UndefOr[String] = js.native
}
object Breadcrumb {
  
  @scala.inline
  def apply(): Breadcrumb = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Breadcrumb]
  }
  
  @scala.inline
  implicit class BreadcrumbOps[Self <: Breadcrumb] (val x: Self) extends AnyVal {
    
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
    def setCategory(value: String): Self = this.set("category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCategory: Self = this.set("category", js.undefined)
    
    @scala.inline
    def setData(value: StringDictionary[js.Any]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setEvent_id(value: String): Self = this.set("event_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvent_id: Self = this.set("event_id", js.undefined)
    
    @scala.inline
    def setLevel(value: Severity): Self = this.set("level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLevel: Self = this.set("level", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    
    @scala.inline
    def setTimestamp(value: Double): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimestamp: Self = this.set("timestamp", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}

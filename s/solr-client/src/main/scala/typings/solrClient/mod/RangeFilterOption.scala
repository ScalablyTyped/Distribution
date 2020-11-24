package typings.solrClient.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RangeFilterOption extends js.Object {
  
  var end: String | Double | Date = js.native
  
  var field: String = js.native
  
  var start: String | Double | Date = js.native
}
object RangeFilterOption {
  
  @scala.inline
  def apply(end: String | Double | Date, field: String, start: String | Double | Date): RangeFilterOption = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeFilterOption]
  }
  
  @scala.inline
  implicit class RangeFilterOptionOps[Self <: RangeFilterOption] (val x: Self) extends AnyVal {
    
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
    def setEnd(value: String | Double | Date): Self = this.set("end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setField(value: String): Self = this.set("field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: String | Double | Date): Self = this.set("start", value.asInstanceOf[js.Any])
  }
}

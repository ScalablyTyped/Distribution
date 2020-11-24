package typings.reactBootstrapTable.anon

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComparatorDate extends js.Object {
  
  var comparator: CSSProperties = js.native
  
  var date: CSSProperties = js.native
}
object ComparatorDate {
  
  @scala.inline
  def apply(comparator: CSSProperties, date: CSSProperties): ComparatorDate = {
    val __obj = js.Dynamic.literal(comparator = comparator.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComparatorDate]
  }
  
  @scala.inline
  implicit class ComparatorDateOps[Self <: ComparatorDate] (val x: Self) extends AnyVal {
    
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
    def setComparator(value: CSSProperties): Self = this.set("comparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDate(value: CSSProperties): Self = this.set("date", value.asInstanceOf[js.Any])
  }
}

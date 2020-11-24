package typings.seatsio.Seatsio

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BestAvailable extends js.Object {
  
  var category: String | js.Array[String] = js.native
  
  var clearSelection: Boolean = js.native
  
  var number: js.UndefOr[Double] = js.native
  
  var ticketTypes: StringDictionary[Double] = js.native
}
object BestAvailable {
  
  @scala.inline
  def apply(
    category: String | js.Array[String],
    clearSelection: Boolean,
    ticketTypes: StringDictionary[Double]
  ): BestAvailable = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], clearSelection = clearSelection.asInstanceOf[js.Any], ticketTypes = ticketTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[BestAvailable]
  }
  
  @scala.inline
  implicit class BestAvailableOps[Self <: BestAvailable] (val x: Self) extends AnyVal {
    
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
    def setCategoryVarargs(value: String*): Self = this.set("category", js.Array(value :_*))
    
    @scala.inline
    def setCategory(value: String | js.Array[String]): Self = this.set("category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClearSelection(value: Boolean): Self = this.set("clearSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTicketTypes(value: StringDictionary[Double]): Self = this.set("ticketTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumber(value: Double): Self = this.set("number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumber: Self = this.set("number", js.undefined)
  }
}

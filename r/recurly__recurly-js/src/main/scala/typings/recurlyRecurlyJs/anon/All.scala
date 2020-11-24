package typings.recurlyRecurlyJs.anon

import typings.recurlyRecurlyJs.elementsMod.IndividualElementOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait All extends js.Object {
  
  var all: js.UndefOr[IndividualElementOptions] = js.native
  
  var card: js.UndefOr[CardElementOptionsselecto] = js.native
  
  var cvv: js.UndefOr[IndividualElementOptionss] = js.native
  
  var month: js.UndefOr[IndividualElementOptionss] = js.native
  
  var number: js.UndefOr[IndividualElementOptionss] = js.native
  
  var year: js.UndefOr[IndividualElementOptionss] = js.native
}
object All {
  
  @scala.inline
  def apply(): All = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[All]
  }
  
  @scala.inline
  implicit class AllOps[Self <: All] (val x: Self) extends AnyVal {
    
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
    def setAll(value: IndividualElementOptions): Self = this.set("all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAll: Self = this.set("all", js.undefined)
    
    @scala.inline
    def setCard(value: CardElementOptionsselecto): Self = this.set("card", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCard: Self = this.set("card", js.undefined)
    
    @scala.inline
    def setCvv(value: IndividualElementOptionss): Self = this.set("cvv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCvv: Self = this.set("cvv", js.undefined)
    
    @scala.inline
    def setMonth(value: IndividualElementOptionss): Self = this.set("month", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonth: Self = this.set("month", js.undefined)
    
    @scala.inline
    def setNumber(value: IndividualElementOptionss): Self = this.set("number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumber: Self = this.set("number", js.undefined)
    
    @scala.inline
    def setYear(value: IndividualElementOptionss): Self = this.set("year", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYear: Self = this.set("year", js.undefined)
  }
}

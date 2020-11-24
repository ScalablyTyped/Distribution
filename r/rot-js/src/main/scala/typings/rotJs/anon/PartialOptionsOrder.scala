package typings.rotJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<rot-js.rot-js/lib/stringgenerator.Options> */
@js.native
trait PartialOptionsOrder extends js.Object {
  
  var order: js.UndefOr[Double] = js.native
  
  var prior: js.UndefOr[Double] = js.native
  
  var words: js.UndefOr[Boolean] = js.native
}
object PartialOptionsOrder {
  
  @scala.inline
  def apply(): PartialOptionsOrder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOptionsOrder]
  }
  
  @scala.inline
  implicit class PartialOptionsOrderOps[Self <: PartialOptionsOrder] (val x: Self) extends AnyVal {
    
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
    def setOrder(value: Double): Self = this.set("order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrder: Self = this.set("order", js.undefined)
    
    @scala.inline
    def setPrior(value: Double): Self = this.set("prior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrior: Self = this.set("prior", js.undefined)
    
    @scala.inline
    def setWords(value: Boolean): Self = this.set("words", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWords: Self = this.set("words", js.undefined)
  }
}

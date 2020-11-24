package typings.reactMathjax.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Formula extends js.Object {
  
  var formula: String = js.native
  
  var `inline`: js.UndefOr[Boolean] = js.native
  
  var onRender: js.UndefOr[js.Function0[Unit]] = js.native
}
object Formula {
  
  @scala.inline
  def apply(formula: String): Formula = {
    val __obj = js.Dynamic.literal(formula = formula.asInstanceOf[js.Any])
    __obj.asInstanceOf[Formula]
  }
  
  @scala.inline
  implicit class FormulaOps[Self <: Formula] (val x: Self) extends AnyVal {
    
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
    def setFormula(value: String): Self = this.set("formula", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInline(value: Boolean): Self = this.set("inline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInline: Self = this.set("inline", js.undefined)
    
    @scala.inline
    def setOnRender(value: () => Unit): Self = this.set("onRender", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnRender: Self = this.set("onRender", js.undefined)
  }
}

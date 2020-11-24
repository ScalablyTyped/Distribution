package typings.reactBootstrap.formControlMod

import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
import typings.react.mod.ReactType
import typings.reactBootstrap.mod.Sizes
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormControlProps
  extends AllHTMLAttributes[FormControl]
     with ClassAttributes[FormControl] {
  
  var bsClass: js.UndefOr[String] = js.native
  
  var bsSize: js.UndefOr[Sizes] = js.native
  
  var componentClass: js.UndefOr[ReactType[_]] = js.native
  
  var inputRef: js.UndefOr[js.Function1[/* instance */ HTMLInputElement, Unit]] = js.native
}
object FormControlProps {
  
  @scala.inline
  def apply(): FormControlProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormControlProps]
  }
  
  @scala.inline
  implicit class FormControlPropsOps[Self <: FormControlProps] (val x: Self) extends AnyVal {
    
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
    def setBsClass(value: String): Self = this.set("bsClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBsClass: Self = this.set("bsClass", js.undefined)
    
    @scala.inline
    def setBsSize(value: Sizes): Self = this.set("bsSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBsSize: Self = this.set("bsSize", js.undefined)
    
    @scala.inline
    def setComponentClass(value: ReactType[_]): Self = this.set("componentClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponentClass: Self = this.set("componentClass", js.undefined)
    
    @scala.inline
    def setInputRef(value: /* instance */ HTMLInputElement => Unit): Self = this.set("inputRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteInputRef: Self = this.set("inputRef", js.undefined)
  }
}

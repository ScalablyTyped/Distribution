package typings.reactBootstrapTypeahead.mod

import typings.react.mod.KeyboardEvent
import typings.react.mod.ReactNode
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HintProps extends js.Object {
  
  var children: ReactNode = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var shouldSelect: js.UndefOr[ShouldSelect] = js.native
}
object HintProps {
  
  @scala.inline
  def apply(): HintProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HintProps]
  }
  
  @scala.inline
  implicit class HintPropsOps[Self <: HintProps] (val x: Self) extends AnyVal {
    
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
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setShouldSelect(value: (/* shouldSelect */ Boolean, /* e */ KeyboardEvent[HTMLInputElement]) => Boolean): Self = this.set("shouldSelect", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteShouldSelect: Self = this.set("shouldSelect", js.undefined)
  }
}

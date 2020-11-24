package typings.reactColor.checkboardMod

import typings.react.mod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CheckboardProps extends ClassAttributes[Checkboard] {
  
  var grey: js.UndefOr[String] = js.native
  
  var size: js.UndefOr[Double] = js.native
  
  var white: js.UndefOr[String] = js.native
}
object CheckboardProps {
  
  @scala.inline
  def apply(): CheckboardProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CheckboardProps]
  }
  
  @scala.inline
  implicit class CheckboardPropsOps[Self <: CheckboardProps] (val x: Self) extends AnyVal {
    
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
    def setGrey(value: String): Self = this.set("grey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGrey: Self = this.set("grey", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setWhite(value: String): Self = this.set("white", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWhite: Self = this.set("white", js.undefined)
  }
}

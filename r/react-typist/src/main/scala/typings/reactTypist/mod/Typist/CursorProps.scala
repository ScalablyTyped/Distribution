package typings.reactTypist.mod.Typist

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CursorProps extends js.Object {
  
  var blink: js.UndefOr[Boolean] = js.native
  
  var element: js.UndefOr[String] = js.native
  
  var hideWhenDone: js.UndefOr[Boolean] = js.native
  
  var hideWhenDoneDelay: js.UndefOr[Double] = js.native
  
  var show: js.UndefOr[Boolean] = js.native
}
object CursorProps {
  
  @scala.inline
  def apply(): CursorProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CursorProps]
  }
  
  @scala.inline
  implicit class CursorPropsOps[Self <: CursorProps] (val x: Self) extends AnyVal {
    
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
    def setBlink(value: Boolean): Self = this.set("blink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlink: Self = this.set("blink", js.undefined)
    
    @scala.inline
    def setElement(value: String): Self = this.set("element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElement: Self = this.set("element", js.undefined)
    
    @scala.inline
    def setHideWhenDone(value: Boolean): Self = this.set("hideWhenDone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideWhenDone: Self = this.set("hideWhenDone", js.undefined)
    
    @scala.inline
    def setHideWhenDoneDelay(value: Double): Self = this.set("hideWhenDoneDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideWhenDoneDelay: Self = this.set("hideWhenDoneDelay", js.undefined)
    
    @scala.inline
    def setShow(value: Boolean): Self = this.set("show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
  }
}

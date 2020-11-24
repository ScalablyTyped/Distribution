package typings.reactImageMagnifiers.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MagnifierContainerProps extends js.Object {
  
  var autoInPlace: js.UndefOr[Boolean] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var inPlaceMinBreakpoint: js.UndefOr[Double] = js.native
  
  var style: js.UndefOr[String] = js.native
}
object MagnifierContainerProps {
  
  @scala.inline
  def apply(): MagnifierContainerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MagnifierContainerProps]
  }
  
  @scala.inline
  implicit class MagnifierContainerPropsOps[Self <: MagnifierContainerProps] (val x: Self) extends AnyVal {
    
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
    def setAutoInPlace(value: Boolean): Self = this.set("autoInPlace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoInPlace: Self = this.set("autoInPlace", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setInPlaceMinBreakpoint(value: Double): Self = this.set("inPlaceMinBreakpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInPlaceMinBreakpoint: Self = this.set("inPlaceMinBreakpoint", js.undefined)
    
    @scala.inline
    def setStyle(value: String): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
}

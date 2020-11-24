package typings.rmcDrawer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OverlayClicked extends js.Object {
  
  var overlayClicked: Boolean = js.native
}
object OverlayClicked {
  
  @scala.inline
  def apply(overlayClicked: Boolean): OverlayClicked = {
    val __obj = js.Dynamic.literal(overlayClicked = overlayClicked.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverlayClicked]
  }
  
  @scala.inline
  implicit class OverlayClickedOps[Self <: OverlayClicked] (val x: Self) extends AnyVal {
    
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
    def setOverlayClicked(value: Boolean): Self = this.set("overlayClicked", value.asInstanceOf[js.Any])
  }
}

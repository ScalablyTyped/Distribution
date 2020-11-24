package typings.semanticUiPopup.anon

import typings.semanticUiPopup.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-popup.SemanticUI.PopupSettings._Impl, 'boundary'> */
@js.native
trait PickImplboundary extends js.Object {
  
  var boundary: String | JQuery = js.native
}
object PickImplboundary {
  
  @scala.inline
  def apply(boundary: String | JQuery): PickImplboundary = {
    val __obj = js.Dynamic.literal(boundary = boundary.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplboundary]
  }
  
  @scala.inline
  implicit class PickImplboundaryOps[Self <: PickImplboundary] (val x: Self) extends AnyVal {
    
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
    def setBoundary(value: String | JQuery): Self = this.set("boundary", value.asInstanceOf[js.Any])
  }
}

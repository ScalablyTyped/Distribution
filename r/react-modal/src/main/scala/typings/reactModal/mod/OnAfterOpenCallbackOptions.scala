package typings.reactModal.mod

import typings.std.Element
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Describes overlay and content element references passed to onAfterOpen function */
@js.native
trait OnAfterOpenCallbackOptions extends js.Object {
  
  /** content element reference */
  var contentEl: HTMLDivElement = js.native
  
  /** overlay element reference */
  var overlayEl: Element = js.native
}
object OnAfterOpenCallbackOptions {
  
  @scala.inline
  def apply(contentEl: HTMLDivElement, overlayEl: Element): OnAfterOpenCallbackOptions = {
    val __obj = js.Dynamic.literal(contentEl = contentEl.asInstanceOf[js.Any], overlayEl = overlayEl.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnAfterOpenCallbackOptions]
  }
  
  @scala.inline
  implicit class OnAfterOpenCallbackOptionsOps[Self <: OnAfterOpenCallbackOptions] (val x: Self) extends AnyVal {
    
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
    def setContentEl(value: HTMLDivElement): Self = this.set("contentEl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverlayEl(value: Element): Self = this.set("overlayEl", value.asInstanceOf[js.Any])
  }
}

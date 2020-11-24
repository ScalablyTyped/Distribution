package typings.resizeObserverBrowser

import typings.resizeObserverBrowser.resizeObserverBrowserStrings.`border-box`
import typings.resizeObserverBrowser.resizeObserverBrowserStrings.`content-box`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResizeObserverOptions extends js.Object {
  
  /**
    * Sets which box model the observer will observe changes to. Possible values
    * are `content-box` (the default), and `border-box`.
    *
    * @default 'content-box'
    */
  var box: js.UndefOr[`content-box` | `border-box`] = js.native
}
object ResizeObserverOptions {
  
  @scala.inline
  def apply(): ResizeObserverOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResizeObserverOptions]
  }
  
  @scala.inline
  implicit class ResizeObserverOptionsOps[Self <: ResizeObserverOptions] (val x: Self) extends AnyVal {
    
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
    def setBox(value: `content-box` | `border-box`): Self = this.set("box", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBox: Self = this.set("box", js.undefined)
  }
}

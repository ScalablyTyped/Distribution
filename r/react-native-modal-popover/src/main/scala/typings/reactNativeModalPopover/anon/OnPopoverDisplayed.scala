package typings.reactNativeModalPopover.anon

import typings.propTypes.mod.Requireable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnPopoverDisplayed extends js.Object {
  
  var onPopoverDisplayed: Requireable[js.Function1[/* repeated */ _, _]] = js.native
}
object OnPopoverDisplayed {
  
  @scala.inline
  def apply(onPopoverDisplayed: Requireable[js.Function1[/* repeated */ _, _]]): OnPopoverDisplayed = {
    val __obj = js.Dynamic.literal(onPopoverDisplayed = onPopoverDisplayed.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnPopoverDisplayed]
  }
  
  @scala.inline
  implicit class OnPopoverDisplayedOps[Self <: OnPopoverDisplayed] (val x: Self) extends AnyVal {
    
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
    def setOnPopoverDisplayed(value: Requireable[js.Function1[/* repeated */ _, _]]): Self = this.set("onPopoverDisplayed", value.asInstanceOf[js.Any])
  }
}

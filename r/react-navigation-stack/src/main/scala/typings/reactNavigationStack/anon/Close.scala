package typings.reactNavigationStack.anon

import typings.reactNavigationStack.vendorTypesMod.TransitionSpec
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Close extends js.Object {
  /**
    * Transition configuration when removing a screen.
    */
  var close: TransitionSpec = js.native
  /**
    * Transition configuration when adding a screen.
    */
  var open: TransitionSpec = js.native
}

object Close {
  @scala.inline
  def apply(close: TransitionSpec, open: TransitionSpec): Close = {
    val __obj = js.Dynamic.literal(close = close.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any])
    __obj.asInstanceOf[Close]
  }
  @scala.inline
  implicit class CloseOps[Self <: Close] (val x: Self) extends AnyVal {
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
    def setClose(value: TransitionSpec): Self = this.set("close", value.asInstanceOf[js.Any])
    @scala.inline
    def setOpen(value: TransitionSpec): Self = this.set("open", value.asInstanceOf[js.Any])
  }
  
}


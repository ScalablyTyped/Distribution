package typings.reactMdStates.usePressedStatesMod

import typings.reactMdStates.typesMod.MergableRippleHandlers
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PressedStatesOptions[E /* <: HTMLElement */] extends js.Object {
  
  var disableSpacebarClick: js.UndefOr[Boolean] = js.native
  
  var handlers: js.UndefOr[MergableRippleHandlers[E]] = js.native
}
object PressedStatesOptions {
  
  @scala.inline
  def apply[E /* <: HTMLElement */](): PressedStatesOptions[E] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PressedStatesOptions[E]]
  }
  
  @scala.inline
  implicit class PressedStatesOptionsOps[Self <: PressedStatesOptions[_], E /* <: HTMLElement */] (val x: Self with PressedStatesOptions[E]) extends AnyVal {
    
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
    def setDisableSpacebarClick(value: Boolean): Self = this.set("disableSpacebarClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableSpacebarClick: Self = this.set("disableSpacebarClick", js.undefined)
    
    @scala.inline
    def setHandlers(value: MergableRippleHandlers[E]): Self = this.set("handlers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHandlers: Self = this.set("handlers", js.undefined)
  }
}

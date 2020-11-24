package typings.reachRouter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigateOptions[TState] extends js.Object {
  
  var replace: js.UndefOr[Boolean] = js.native
  
  var state: js.UndefOr[TState] = js.native
}
object NavigateOptions {
  
  @scala.inline
  def apply[TState](): NavigateOptions[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigateOptions[TState]]
  }
  
  @scala.inline
  implicit class NavigateOptionsOps[Self <: NavigateOptions[_], TState] (val x: Self with NavigateOptions[TState]) extends AnyVal {
    
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
    def setReplace(value: Boolean): Self = this.set("replace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplace: Self = this.set("replace", js.undefined)
    
    @scala.inline
    def setState(value: TState): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
}

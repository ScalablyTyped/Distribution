package typings.reactNavigationNative.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetInitialState extends js.Object {
  
  def getInitialState(): js.Thenable[js.UndefOr[PartialPickReadonlykeystrHistory]] = js.native
}
object GetInitialState {
  
  @scala.inline
  def apply(getInitialState: () => js.Thenable[js.UndefOr[PartialPickReadonlykeystrHistory]]): GetInitialState = {
    val __obj = js.Dynamic.literal(getInitialState = js.Any.fromFunction0(getInitialState))
    __obj.asInstanceOf[GetInitialState]
  }
  
  @scala.inline
  implicit class GetInitialStateOps[Self <: GetInitialState] (val x: Self) extends AnyVal {
    
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
    def setGetInitialState(value: () => js.Thenable[js.UndefOr[PartialPickReadonlykeystrHistory]]): Self = this.set("getInitialState", js.Any.fromFunction0(value))
  }
}

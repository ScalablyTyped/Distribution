package typings.reduxUi.mod

import typings.reduxUi.anon.Pure
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait uiParams[UIStateShape] extends js.Object {
  
  // optional key which is used to determine the UI path in which state will
  // be stored. if omitted this is randomly generated.
  var key: js.UndefOr[String] = js.native
  
  // optional mergeProps passed to react-redux' @connect
  var mergeProps: js.UndefOr[
    js.Function3[/* stateProps */ js.Any, /* dispatchProps */ js.Any, /* ownProps */ js.Any, _]
  ] = js.native
  
  // optional `options` passed to react-redux @connect
  var options: js.UndefOr[Pure] = js.native
  
  // optional persist, defaults to false. if set to true persist will keep UI
  // state for this component after it unmounts. if set to false the UI state
  // will be deleted and recreated when the component remounts
  var persist: js.UndefOr[Boolean] = js.native
  
  // customReducer: you can handle the UI state for this component's scope
  // by dispatching actions
  var reducer: js.UndefOr[js.Function2[/* state */ js.Any, /* action */ js.Any, _]] = js.native
  
  // **required**: UI state for the component
  var state: UIStateShape = js.native
}
object uiParams {
  
  @scala.inline
  def apply[UIStateShape](state: UIStateShape): uiParams[UIStateShape] = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[uiParams[UIStateShape]]
  }
  
  @scala.inline
  implicit class uiParamsOps[Self <: uiParams[_], UIStateShape] (val x: Self with uiParams[UIStateShape]) extends AnyVal {
    
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
    def setState(value: UIStateShape): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setMergeProps(value: (/* stateProps */ js.Any, /* dispatchProps */ js.Any, /* ownProps */ js.Any) => _): Self = this.set("mergeProps", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteMergeProps: Self = this.set("mergeProps", js.undefined)
    
    @scala.inline
    def setOptions(value: Pure): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    
    @scala.inline
    def setPersist(value: Boolean): Self = this.set("persist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePersist: Self = this.set("persist", js.undefined)
    
    @scala.inline
    def setReducer(value: (/* state */ js.Any, /* action */ js.Any) => _): Self = this.set("reducer", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteReducer: Self = this.set("reducer", js.undefined)
  }
}

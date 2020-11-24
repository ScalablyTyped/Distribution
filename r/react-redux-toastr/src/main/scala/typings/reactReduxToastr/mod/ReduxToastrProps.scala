package typings.reactReduxToastr.mod

import typings.reactReduxToastr.anon.CancelText
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReduxToastrProps extends js.Object {
  
  var className: js.UndefOr[String] = js.native
  
  var closeOnToastrClick: js.UndefOr[Boolean] = js.native
  
  var confirmOptions: js.UndefOr[CancelText] = js.native
  
  var newestOnTop: js.UndefOr[Boolean] = js.native
  
  var options: js.UndefOr[js.Any] = js.native
  
   // This is currently not used, waiting for response from the package author to remove
  var position: js.UndefOr[positionType] = js.native
  
  var preventDuplicates: js.UndefOr[Boolean] = js.native
  
  var progressBar: js.UndefOr[Boolean] = js.native
  
  var timeOut: js.UndefOr[Double] = js.native
  
  var toastr: js.UndefOr[ToastrState] = js.native
  
  var transitionIn: js.UndefOr[transitionInType] = js.native
  
  var transitionOut: js.UndefOr[transitionOutType] = js.native
}
object ReduxToastrProps {
  
  @scala.inline
  def apply(): ReduxToastrProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReduxToastrProps]
  }
  
  @scala.inline
  implicit class ReduxToastrPropsOps[Self <: ReduxToastrProps] (val x: Self) extends AnyVal {
    
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setCloseOnToastrClick(value: Boolean): Self = this.set("closeOnToastrClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseOnToastrClick: Self = this.set("closeOnToastrClick", js.undefined)
    
    @scala.inline
    def setConfirmOptions(value: CancelText): Self = this.set("confirmOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfirmOptions: Self = this.set("confirmOptions", js.undefined)
    
    @scala.inline
    def setNewestOnTop(value: Boolean): Self = this.set("newestOnTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNewestOnTop: Self = this.set("newestOnTop", js.undefined)
    
    @scala.inline
    def setOptions(value: js.Any): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    
    @scala.inline
    def setPosition(value: positionType): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setPreventDuplicates(value: Boolean): Self = this.set("preventDuplicates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreventDuplicates: Self = this.set("preventDuplicates", js.undefined)
    
    @scala.inline
    def setProgressBar(value: Boolean): Self = this.set("progressBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProgressBar: Self = this.set("progressBar", js.undefined)
    
    @scala.inline
    def setTimeOut(value: Double): Self = this.set("timeOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeOut: Self = this.set("timeOut", js.undefined)
    
    @scala.inline
    def setToastr(value: ToastrState): Self = this.set("toastr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToastr: Self = this.set("toastr", js.undefined)
    
    @scala.inline
    def setTransitionIn(value: transitionInType): Self = this.set("transitionIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitionIn: Self = this.set("transitionIn", js.undefined)
    
    @scala.inline
    def setTransitionOut(value: transitionOutType): Self = this.set("transitionOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitionOut: Self = this.set("transitionOut", js.undefined)
  }
}

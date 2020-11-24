package typings.sharepoint.SP.Application.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefaultFormsInformationRequestor extends js.Object {
  
  def onDefaultFormsInformationRetrieveFailure(): Unit = js.native
  
  def onDefaultFormsInformationRetrieveSuccess(defaultForms: DefaultFormsInformation): Unit = js.native
}
object DefaultFormsInformationRequestor {
  
  @scala.inline
  def apply(
    onDefaultFormsInformationRetrieveFailure: () => Unit,
    onDefaultFormsInformationRetrieveSuccess: DefaultFormsInformation => Unit
  ): DefaultFormsInformationRequestor = {
    val __obj = js.Dynamic.literal(onDefaultFormsInformationRetrieveFailure = js.Any.fromFunction0(onDefaultFormsInformationRetrieveFailure), onDefaultFormsInformationRetrieveSuccess = js.Any.fromFunction1(onDefaultFormsInformationRetrieveSuccess))
    __obj.asInstanceOf[DefaultFormsInformationRequestor]
  }
  
  @scala.inline
  implicit class DefaultFormsInformationRequestorOps[Self <: DefaultFormsInformationRequestor] (val x: Self) extends AnyVal {
    
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
    def setOnDefaultFormsInformationRetrieveFailure(value: () => Unit): Self = this.set("onDefaultFormsInformationRetrieveFailure", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnDefaultFormsInformationRetrieveSuccess(value: DefaultFormsInformation => Unit): Self = this.set("onDefaultFormsInformationRetrieveSuccess", js.Any.fromFunction1(value))
  }
}

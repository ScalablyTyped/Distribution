package typings.sharepoint.SP.Application.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultFormsInformationRequestor extends js.Object {
  def onDefaultFormsInformationRetrieveFailure(): Unit
  def onDefaultFormsInformationRetrieveSuccess(defaultForms: DefaultFormsInformation): Unit
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
}


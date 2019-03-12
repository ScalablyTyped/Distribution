package typings
package sharepointLib.SPNs.ApplicationNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultFormsInformationRequestor extends js.Object {
  def onDefaultFormsInformationRetrieveFailure(): scala.Unit
  def onDefaultFormsInformationRetrieveSuccess(defaultForms: DefaultFormsInformation): scala.Unit
}

object DefaultFormsInformationRequestor {
  @scala.inline
  def apply(
    onDefaultFormsInformationRetrieveFailure: () => scala.Unit,
    onDefaultFormsInformationRetrieveSuccess: DefaultFormsInformation => scala.Unit
  ): DefaultFormsInformationRequestor = {
    val __obj = js.Dynamic.literal(onDefaultFormsInformationRetrieveFailure = js.Any.fromFunction0(onDefaultFormsInformationRetrieveFailure), onDefaultFormsInformationRetrieveSuccess = js.Any.fromFunction1(onDefaultFormsInformationRetrieveSuccess))
  
    __obj.asInstanceOf[DefaultFormsInformationRequestor]
  }
}


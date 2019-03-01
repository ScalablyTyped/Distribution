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
    onDefaultFormsInformationRetrieveFailure: js.Function0[scala.Unit],
    onDefaultFormsInformationRetrieveSuccess: js.Function1[DefaultFormsInformation, scala.Unit]
  ): DefaultFormsInformationRequestor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onDefaultFormsInformationRetrieveFailure")(onDefaultFormsInformationRetrieveFailure)
    __obj.updateDynamic("onDefaultFormsInformationRetrieveSuccess")(onDefaultFormsInformationRetrieveSuccess)
    __obj.asInstanceOf[DefaultFormsInformationRequestor]
  }
}


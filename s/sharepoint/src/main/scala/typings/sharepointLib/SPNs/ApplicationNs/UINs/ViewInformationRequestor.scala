package typings
package sharepointLib.SPNs.ApplicationNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewInformationRequestor extends js.Object {
  def onViewInformationReturned(viewGroups: ViewSelectorGroups): scala.Unit
}

object ViewInformationRequestor {
  @scala.inline
  def apply(onViewInformationReturned: js.Function1[ViewSelectorGroups, scala.Unit]): ViewInformationRequestor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onViewInformationReturned")(onViewInformationReturned)
    __obj.asInstanceOf[ViewInformationRequestor]
  }
}


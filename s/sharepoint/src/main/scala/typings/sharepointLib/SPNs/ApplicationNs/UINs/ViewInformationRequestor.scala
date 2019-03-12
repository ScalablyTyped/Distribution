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
  def apply(onViewInformationReturned: ViewSelectorGroups => scala.Unit): ViewInformationRequestor = {
    val __obj = js.Dynamic.literal(onViewInformationReturned = js.Any.fromFunction1(onViewInformationReturned))
  
    __obj.asInstanceOf[ViewInformationRequestor]
  }
}


package typings.sharepoint.SPNs.ApplicationNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewInformationRequestor extends js.Object {
  def onViewInformationReturned(viewGroups: ViewSelectorGroups): Unit
}

object ViewInformationRequestor {
  @scala.inline
  def apply(onViewInformationReturned: ViewSelectorGroups => Unit): ViewInformationRequestor = {
    val __obj = js.Dynamic.literal(onViewInformationReturned = js.Any.fromFunction1(onViewInformationReturned))
  
    __obj.asInstanceOf[ViewInformationRequestor]
  }
}


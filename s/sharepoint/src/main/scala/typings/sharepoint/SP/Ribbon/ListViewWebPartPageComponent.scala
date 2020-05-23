package typings.sharepoint.SP.Ribbon

import typings.sharepoint.CUI.Page.PageComponent
import typings.sharepoint.SP.Application.UI.DefaultFormsInformation
import typings.sharepoint.SP.Application.UI.DefaultFormsInformationRequestor
import typings.sharepoint.SP.Application.UI.ViewInformationRequestor
import typings.sharepoint.SP.Application.UI.ViewSelectorGroups
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListViewWebPartPageComponent
  extends PageComponent
     with ViewInformationRequestor
     with DefaultFormsInformationRequestor

object ListViewWebPartPageComponent {
  @scala.inline
  def apply(
    canHandleCommand: String => Boolean,
    getFocusedCommands: () => js.Array[String],
    getGlobalCommands: () => js.Array[String],
    getId: () => String,
    handleCommand: (String, js.Any, Double) => Boolean,
    init: () => Unit,
    isFocusable: () => Boolean,
    onDefaultFormsInformationRetrieveFailure: () => Unit,
    onDefaultFormsInformationRetrieveSuccess: DefaultFormsInformation => Unit,
    onViewInformationReturned: ViewSelectorGroups => Unit,
    receiveFocus: () => Boolean,
    yieldFocus: () => Boolean
  ): ListViewWebPartPageComponent = {
    val __obj = js.Dynamic.literal(canHandleCommand = js.Any.fromFunction1(canHandleCommand), getFocusedCommands = js.Any.fromFunction0(getFocusedCommands), getGlobalCommands = js.Any.fromFunction0(getGlobalCommands), getId = js.Any.fromFunction0(getId), handleCommand = js.Any.fromFunction3(handleCommand), init = js.Any.fromFunction0(init), isFocusable = js.Any.fromFunction0(isFocusable), onDefaultFormsInformationRetrieveFailure = js.Any.fromFunction0(onDefaultFormsInformationRetrieveFailure), onDefaultFormsInformationRetrieveSuccess = js.Any.fromFunction1(onDefaultFormsInformationRetrieveSuccess), onViewInformationReturned = js.Any.fromFunction1(onViewInformationReturned), receiveFocus = js.Any.fromFunction0(receiveFocus), yieldFocus = js.Any.fromFunction0(yieldFocus))
    __obj.asInstanceOf[ListViewWebPartPageComponent]
  }
}


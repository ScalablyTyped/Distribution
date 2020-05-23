package typings.sharepoint.SP.Application.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WikiPageNameInPlaceEditor extends js.Object {
  def editingPageCallback(): Unit
  def savingPageCallback(): Unit
}

object WikiPageNameInPlaceEditor {
  @scala.inline
  def apply(editingPageCallback: () => Unit, savingPageCallback: () => Unit): WikiPageNameInPlaceEditor = {
    val __obj = js.Dynamic.literal(editingPageCallback = js.Any.fromFunction0(editingPageCallback), savingPageCallback = js.Any.fromFunction0(savingPageCallback))
    __obj.asInstanceOf[WikiPageNameInPlaceEditor]
  }
}


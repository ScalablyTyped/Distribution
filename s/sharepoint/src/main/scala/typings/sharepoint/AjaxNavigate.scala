package typings.sharepoint

import org.scalablytyped.runtime.StringDictionary
import typings.std.HTMLFormElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AjaxNavigate extends js.Object {
  def add_navigate(handler: js.Function2[/* obj */ js.Any, /* eventArgs */ js.Any, Unit]): Unit
  def convertMDSURLtoRegularURL(mdsPath: String): String
  def getParam(paramName: String): String
  def getSavedFormAction(): String
  def get_hash(): String
  def get_href(): String
  def get_search(): String
  def remove_navigate(handler: js.Function2[/* obj */ js.Any, /* eventArgs */ js.Any, Unit]): Unit
  def submit(formToSubmit: HTMLFormElement): Unit
  def update(
    url: String,
    updateParts: StringDictionary[String | Double],
    fullNavigate: Boolean,
    anchorName: String
  ): Unit
}

object AjaxNavigate {
  @scala.inline
  def apply(
    add_navigate: js.Function2[/* obj */ js.Any, /* eventArgs */ js.Any, Unit] => Unit,
    convertMDSURLtoRegularURL: String => String,
    getParam: String => String,
    getSavedFormAction: () => String,
    get_hash: () => String,
    get_href: () => String,
    get_search: () => String,
    remove_navigate: js.Function2[/* obj */ js.Any, /* eventArgs */ js.Any, Unit] => Unit,
    submit: HTMLFormElement => Unit,
    update: (String, StringDictionary[String | Double], Boolean, String) => Unit
  ): AjaxNavigate = {
    val __obj = js.Dynamic.literal(add_navigate = js.Any.fromFunction1(add_navigate), convertMDSURLtoRegularURL = js.Any.fromFunction1(convertMDSURLtoRegularURL), getParam = js.Any.fromFunction1(getParam), getSavedFormAction = js.Any.fromFunction0(getSavedFormAction), get_hash = js.Any.fromFunction0(get_hash), get_href = js.Any.fromFunction0(get_href), get_search = js.Any.fromFunction0(get_search), remove_navigate = js.Any.fromFunction1(remove_navigate), submit = js.Any.fromFunction1(submit), update = js.Any.fromFunction4(update))
    __obj.asInstanceOf[AjaxNavigate]
  }
}


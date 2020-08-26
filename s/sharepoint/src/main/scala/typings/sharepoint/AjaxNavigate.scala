package typings.sharepoint

import org.scalablytyped.runtime.StringDictionary
import typings.std.HTMLFormElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AjaxNavigate extends js.Object {
  def add_navigate(handler: js.Function2[/* obj */ js.Any, /* eventArgs */ js.Any, Unit]): Unit = js.native
  def convertMDSURLtoRegularURL(mdsPath: String): String = js.native
  def getParam(paramName: String): String = js.native
  def getSavedFormAction(): String = js.native
  def get_hash(): String = js.native
  def get_href(): String = js.native
  def get_search(): String = js.native
  def remove_navigate(handler: js.Function2[/* obj */ js.Any, /* eventArgs */ js.Any, Unit]): Unit = js.native
  def submit(formToSubmit: HTMLFormElement): Unit = js.native
  def update(
    url: String,
    updateParts: StringDictionary[String | Double],
    fullNavigate: Boolean,
    anchorName: String
  ): Unit = js.native
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
  @scala.inline
  implicit class AjaxNavigateOps[Self <: AjaxNavigate] (val x: Self) extends AnyVal {
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
    def setAdd_navigate(value: js.Function2[/* obj */ js.Any, /* eventArgs */ js.Any, Unit] => Unit): Self = this.set("add_navigate", js.Any.fromFunction1(value))
    @scala.inline
    def setConvertMDSURLtoRegularURL(value: String => String): Self = this.set("convertMDSURLtoRegularURL", js.Any.fromFunction1(value))
    @scala.inline
    def setGetParam(value: String => String): Self = this.set("getParam", js.Any.fromFunction1(value))
    @scala.inline
    def setGetSavedFormAction(value: () => String): Self = this.set("getSavedFormAction", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_hash(value: () => String): Self = this.set("get_hash", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_href(value: () => String): Self = this.set("get_href", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_search(value: () => String): Self = this.set("get_search", js.Any.fromFunction0(value))
    @scala.inline
    def setRemove_navigate(value: js.Function2[/* obj */ js.Any, /* eventArgs */ js.Any, Unit] => Unit): Self = this.set("remove_navigate", js.Any.fromFunction1(value))
    @scala.inline
    def setSubmit(value: HTMLFormElement => Unit): Self = this.set("submit", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdate(value: (String, StringDictionary[String | Double], Boolean, String) => Unit): Self = this.set("update", js.Any.fromFunction4(value))
  }
  
}


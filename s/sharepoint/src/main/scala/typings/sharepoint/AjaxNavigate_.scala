package typings.sharepoint

import org.scalablytyped.runtime.StringDictionary
import typings.std.HTMLFormElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AjaxNavigate")
@js.native
class AjaxNavigate_ () extends js.Object {
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


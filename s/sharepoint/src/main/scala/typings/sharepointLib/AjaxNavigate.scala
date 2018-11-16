package typings
package sharepointLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AjaxNavigate")
@js.native
class AjaxNavigate () extends js.Object {
  def add_navigate(handler: js.Function2[/* obj */ js.Any, /* eventArgs */ js.Any, scala.Unit]): scala.Unit = js.native
  def convertMDSURLtoRegularURL(mdsPath: java.lang.String): java.lang.String = js.native
  def getParam(paramName: java.lang.String): java.lang.String = js.native
  def getSavedFormAction(): java.lang.String = js.native
  def get_hash(): java.lang.String = js.native
  def get_href(): java.lang.String = js.native
  def get_search(): java.lang.String = js.native
  def remove_navigate(handler: js.Function2[/* obj */ js.Any, /* eventArgs */ js.Any, scala.Unit]): scala.Unit = js.native
  def submit(formToSubmit: stdLib.HTMLFormElement): scala.Unit = js.native
  def update(
    url: java.lang.String,
    updateParts: ScalablyTyped.runtime.StringDictionary[java.lang.String | scala.Double],
    fullNavigate: scala.Boolean,
    anchorName: java.lang.String
  ): scala.Unit = js.native
}


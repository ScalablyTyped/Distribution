package typings
package semanticDashUiDashFormLib.SemanticUINs.FormNs.TemplatesSettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Impl extends js.Object {
  def error(errors: js.Array[java.lang.String]): semanticDashUiDashFormLib.JQuery
  def prompt(errors: js.Array[java.lang.String]): semanticDashUiDashFormLib.JQuery
}

object _Impl {
  @scala.inline
  def apply(
    error: js.Function1[js.Array[java.lang.String], semanticDashUiDashFormLib.JQuery],
    prompt: js.Function1[js.Array[java.lang.String], semanticDashUiDashFormLib.JQuery]
  ): _Impl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("error")(error)
    __obj.updateDynamic("prompt")(prompt)
    __obj.asInstanceOf[_Impl]
  }
}


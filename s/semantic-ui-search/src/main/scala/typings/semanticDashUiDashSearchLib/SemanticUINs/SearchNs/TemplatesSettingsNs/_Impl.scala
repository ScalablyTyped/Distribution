package typings
package semanticDashUiDashSearchLib.SemanticUINs.SearchNs.TemplatesSettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Impl extends js.Object {
  def category(response: js.Any): java.lang.String
  def escape(string: java.lang.String): java.lang.String
  def message(message: java.lang.String, `type`: java.lang.String): java.lang.String
  def standard(response: js.Any): java.lang.String
}

object _Impl {
  @scala.inline
  def apply(
    category: js.Function1[js.Any, java.lang.String],
    escape: js.Function1[java.lang.String, java.lang.String],
    message: js.Function2[java.lang.String, java.lang.String, java.lang.String],
    standard: js.Function1[js.Any, java.lang.String]
  ): _Impl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("category")(category)
    __obj.updateDynamic("escape")(escape)
    __obj.updateDynamic("message")(message)
    __obj.updateDynamic("standard")(standard)
    __obj.asInstanceOf[_Impl]
  }
}


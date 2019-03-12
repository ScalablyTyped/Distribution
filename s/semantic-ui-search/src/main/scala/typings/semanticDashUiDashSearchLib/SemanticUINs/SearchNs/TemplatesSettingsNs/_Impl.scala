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
    category: js.Any => java.lang.String,
    escape: java.lang.String => java.lang.String,
    message: (java.lang.String, java.lang.String) => java.lang.String,
    standard: js.Any => java.lang.String
  ): _Impl = {
    val __obj = js.Dynamic.literal(category = js.Any.fromFunction1(category), escape = js.Any.fromFunction1(escape), message = js.Any.fromFunction2(message), standard = js.Any.fromFunction1(standard))
  
    __obj.asInstanceOf[_Impl]
  }
}


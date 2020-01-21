package typings.semanticUiSearch.SemanticUI.Search.TemplatesSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Impl extends js.Object {
  def category(response: js.Any): String
  def escape(string: String): String
  def message(message: String, `type`: String): String
  def standard(response: js.Any): String
}

object Impl {
  @scala.inline
  def apply(
    category: js.Any => String,
    escape: String => String,
    message: (String, String) => String,
    standard: js.Any => String
  ): Impl = {
    val __obj = js.Dynamic.literal(category = js.Any.fromFunction1(category), escape = js.Any.fromFunction1(escape), message = js.Any.fromFunction2(message), standard = js.Any.fromFunction1(standard))
  
    __obj.asInstanceOf[Impl]
  }
}


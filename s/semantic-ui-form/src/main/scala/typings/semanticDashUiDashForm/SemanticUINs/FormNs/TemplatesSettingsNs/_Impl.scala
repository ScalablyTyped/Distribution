package typings.semanticDashUiDashForm.SemanticUINs.FormNs.TemplatesSettingsNs

import typings.semanticDashUiDashForm.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Impl extends js.Object {
  def error(errors: js.Array[String]): JQuery
  def prompt(errors: js.Array[String]): JQuery
}

object _Impl {
  @scala.inline
  def apply(error: js.Array[String] => JQuery, prompt: js.Array[String] => JQuery): _Impl = {
    val __obj = js.Dynamic.literal(error = js.Any.fromFunction1(error), prompt = js.Any.fromFunction1(prompt))
  
    __obj.asInstanceOf[_Impl]
  }
}


package typings.semanticUiApi.SemanticUI.Api.SelectorSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Impl extends js.Object {
  /**
    * @default '.disabled'
    */
  var disabled: String
  /**
    * @default 'form'
    */
  var form: String
}

object Impl {
  @scala.inline
  def apply(disabled: String, form: String): Impl = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], form = form.asInstanceOf[js.Any])
    __obj.asInstanceOf[Impl]
  }
}


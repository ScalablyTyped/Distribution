package typings.semanticDashUiDashApi.SemanticUI.Api.SelectorSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Impl extends js.Object {
  /**
    * @default '.disabled'
    */
  var disabled: String
  /**
    * @default 'form'
    */
  var form: String
}

object _Impl {
  @scala.inline
  def apply(disabled: String, form: String): _Impl = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], form = form.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_Impl]
  }
}


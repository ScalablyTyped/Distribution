package typings.semanticDashUiDashProgress.SemanticUINs.ProgressNs.ErrorSettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Impl extends js.Object {
  /**
    * @default 'The method you called is not defined.'
    */
  var method: String
  /**
    * @default 'Progress value is non numeric'
    */
  var nonNumeric: String
}

object _Impl {
  @scala.inline
  def apply(method: String, nonNumeric: String): _Impl = {
    val __obj = js.Dynamic.literal(method = method, nonNumeric = nonNumeric)
  
    __obj.asInstanceOf[_Impl]
  }
}


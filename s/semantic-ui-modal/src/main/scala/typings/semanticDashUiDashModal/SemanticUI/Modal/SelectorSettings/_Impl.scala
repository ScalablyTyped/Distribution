package typings.semanticDashUiDashModal.SemanticUI.Modal.SelectorSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Impl extends js.Object {
  /**
    * @default '.actions .positive, .actions .approve, .actions .ok'
    */
  var approve: String
  /**
    * @default '.close, .actions .button'
    */
  var close: String
  /**
    * @default '.actions .negative, .actions .deny, .actions .cancel'
    */
  var deny: String
}

object _Impl {
  @scala.inline
  def apply(approve: String, close: String, deny: String): _Impl = {
    val __obj = js.Dynamic.literal(approve = approve, close = close, deny = deny)
  
    __obj.asInstanceOf[_Impl]
  }
}


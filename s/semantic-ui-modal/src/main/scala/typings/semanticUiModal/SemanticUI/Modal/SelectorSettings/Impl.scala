package typings.semanticUiModal.SemanticUI.Modal.SelectorSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Impl extends js.Object {
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

object Impl {
  @scala.inline
  def apply(approve: String, close: String, deny: String): Impl = {
    val __obj = js.Dynamic.literal(approve = approve.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], deny = deny.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Impl]
  }
}


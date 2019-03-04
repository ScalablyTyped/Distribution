package typings
package semanticDashUiDashModalLib.SemanticUINs.ModalNs.SelectorSettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Impl extends js.Object {
  /**
    * @default '.actions .positive, .actions .approve, .actions .ok'
    */
  var approve: java.lang.String
  /**
    * @default '.close, .actions .button'
    */
  var close: java.lang.String
  /**
    * @default '.actions .negative, .actions .deny, .actions .cancel'
    */
  var deny: java.lang.String
}

object _Impl {
  @scala.inline
  def apply(approve: java.lang.String, close: java.lang.String, deny: java.lang.String): _Impl = {
    val __obj = js.Dynamic.literal(approve = approve, close = close, deny = deny)
  
    __obj.asInstanceOf[_Impl]
  }
}


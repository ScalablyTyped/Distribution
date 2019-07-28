package typings.semanticDashUiDashTransition.SemanticUINs.TransitionNs.ErrorSettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Impl extends js.Object {
  /**
    * @default 'The method you called is not defined'
    */
  var method: String
  /**
    * @default 'There is no CSS animation matching the one you specified.'
    */
  var noAnimation: String
}

object _Impl {
  @scala.inline
  def apply(method: String, noAnimation: String): _Impl = {
    val __obj = js.Dynamic.literal(method = method, noAnimation = noAnimation)
  
    __obj.asInstanceOf[_Impl]
  }
}


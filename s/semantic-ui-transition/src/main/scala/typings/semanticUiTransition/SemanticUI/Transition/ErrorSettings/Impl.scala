package typings.semanticUiTransition.SemanticUI.Transition.ErrorSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Impl extends js.Object {
  /**
    * @default 'The method you called is not defined'
    */
  var method: String
  /**
    * @default 'There is no CSS animation matching the one you specified.'
    */
  var noAnimation: String
}

object Impl {
  @scala.inline
  def apply(method: String, noAnimation: String): Impl = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], noAnimation = noAnimation.asInstanceOf[js.Any])
    __obj.asInstanceOf[Impl]
  }
}


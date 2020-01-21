package typings.semanticUiShape.SemanticUI.Shape.ErrorSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Impl extends js.Object {
  /**
    * @default 'The method you called is not defined'
    */
  var method: String
  /**
    * @default 'You tried to switch to a side that does not exist.'
    */
  var side: String
}

object Impl {
  @scala.inline
  def apply(method: String, side: String): Impl = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], side = side.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Impl]
  }
}


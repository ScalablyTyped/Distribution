package typings.semanticDashUiDashShape.SemanticUI.Shape.ErrorSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Impl extends js.Object {
  /**
    * @default 'The method you called is not defined'
    */
  var method: String
  /**
    * @default 'You tried to switch to a side that does not exist.'
    */
  var side: String
}

object _Impl {
  @scala.inline
  def apply(method: String, side: String): _Impl = {
    val __obj = js.Dynamic.literal(method = method, side = side)
  
    __obj.asInstanceOf[_Impl]
  }
}


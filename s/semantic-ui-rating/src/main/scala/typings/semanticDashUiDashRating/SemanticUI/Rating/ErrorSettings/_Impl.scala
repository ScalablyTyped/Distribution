package typings.semanticDashUiDashRating.SemanticUI.Rating.ErrorSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Impl extends js.Object {
  /**
    * @default 'You called a rating action that was not defined'
    */
  var action: String
}

object _Impl {
  @scala.inline
  def apply(action: String): _Impl = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_Impl]
  }
}


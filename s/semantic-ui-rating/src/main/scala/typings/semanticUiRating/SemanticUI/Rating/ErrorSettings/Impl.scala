package typings.semanticUiRating.SemanticUI.Rating.ErrorSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Impl extends js.Object {
  /**
    * @default 'You called a rating action that was not defined'
    */
  var action: String
}

object Impl {
  @scala.inline
  def apply(action: String): Impl = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.asInstanceOf[Impl]
  }
}


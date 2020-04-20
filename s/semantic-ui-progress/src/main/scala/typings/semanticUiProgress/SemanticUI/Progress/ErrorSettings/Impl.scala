package typings.semanticUiProgress.SemanticUI.Progress.ErrorSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Impl extends js.Object {
  /**
    * @default 'The method you called is not defined.'
    */
  var method: String
  /**
    * @default 'Progress value is non numeric'
    */
  var nonNumeric: String
}

object Impl {
  @scala.inline
  def apply(method: String, nonNumeric: String): Impl = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], nonNumeric = nonNumeric.asInstanceOf[js.Any])
    __obj.asInstanceOf[Impl]
  }
}


package typings.semanticUiProgress.SemanticUI.Progress.RegExpSettings

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Impl extends js.Object {
  /**
    * @default /\{\$*[A-z0-9]+\}/g
    */
  var variable: RegExp
}

object Impl {
  @scala.inline
  def apply(variable: RegExp): Impl = {
    val __obj = js.Dynamic.literal(variable = variable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Impl]
  }
}


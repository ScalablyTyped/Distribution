package typings.semanticDashUiDashProgress.SemanticUI.Progress.RegExpSettings

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Impl extends js.Object {
  /**
    * @default /\{\$*[A-z0-9]+\}/g
    */
  var variable: RegExp
}

object _Impl {
  @scala.inline
  def apply(variable: RegExp): _Impl = {
    val __obj = js.Dynamic.literal(variable = variable)
  
    __obj.asInstanceOf[_Impl]
  }
}


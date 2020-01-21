package typings.semanticUiNag.SemanticUI.Nag.ClassNameSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Impl extends js.Object {
  /**
    * @default 'bottom'
    */
  var bottom: String
  /**
    * @default 'fixed'
    */
  var fixed: String
}

object Impl {
  @scala.inline
  def apply(bottom: String, fixed: String): Impl = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], fixed = fixed.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Impl]
  }
}


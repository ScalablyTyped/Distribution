package typings.semanticUiModal.SemanticUI.Modal.ClassNameSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Impl extends js.Object {
  /**
    * @default 'active'
    */
  var active: String
  /**
    * @default 'scrolling'
    */
  var scrolling: String
}

object Impl {
  @scala.inline
  def apply(active: String, scrolling: String): Impl = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], scrolling = scrolling.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Impl]
  }
}


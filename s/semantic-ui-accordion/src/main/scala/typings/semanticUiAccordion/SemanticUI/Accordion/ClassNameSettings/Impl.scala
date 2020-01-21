package typings.semanticUiAccordion.SemanticUI.Accordion.ClassNameSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Impl extends js.Object {
  /**
    * @default 'active'
    */
  var active: String
  /**
    * @default 'animating'
    */
  var animating: String
}

object Impl {
  @scala.inline
  def apply(active: String, animating: String): Impl = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], animating = animating.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Impl]
  }
}


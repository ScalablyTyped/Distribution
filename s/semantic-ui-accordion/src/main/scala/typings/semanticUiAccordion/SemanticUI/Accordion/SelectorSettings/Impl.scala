package typings.semanticUiAccordion.SemanticUI.Accordion.SelectorSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Impl extends js.Object {
  /**
    * @default '.accordion'
    */
  var accordion: String
  /**
    * @default '.content'
    */
  var content: String
  /**
    * @default '.title'
    */
  var title: String
  /**
    * @default '.title'
    */
  var trigger: String
}

object Impl {
  @scala.inline
  def apply(accordion: String, content: String, title: String, trigger: String): Impl = {
    val __obj = js.Dynamic.literal(accordion = accordion.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], trigger = trigger.asInstanceOf[js.Any])
    __obj.asInstanceOf[Impl]
  }
}


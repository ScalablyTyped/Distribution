package typings.semanticDashUiDashAccordion.SemanticUI.Accordion.SelectorSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Impl extends js.Object {
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

object _Impl {
  @scala.inline
  def apply(accordion: String, content: String, title: String, trigger: String): _Impl = {
    val __obj = js.Dynamic.literal(accordion = accordion, content = content, title = title, trigger = trigger)
  
    __obj.asInstanceOf[_Impl]
  }
}


package typings.semanticUiTab.SemanticUI.Tab.SelectorSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Impl extends js.Object {
  /**
    * @default '.ui:not(.menu)'
    */
  var parent: String
  /**
    * @default '.ui.tab'
    */
  var tabs: String
}

object Impl {
  @scala.inline
  def apply(parent: String, tabs: String): Impl = {
    val __obj = js.Dynamic.literal(parent = parent.asInstanceOf[js.Any], tabs = tabs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Impl]
  }
}


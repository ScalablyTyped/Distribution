package typings.semanticDashUiDashTab.SemanticUI.Tab.SelectorSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Impl extends js.Object {
  /**
    * @default '.ui:not(.menu)'
    */
  var parent: String
  /**
    * @default '.ui.tab'
    */
  var tabs: String
}

object _Impl {
  @scala.inline
  def apply(parent: String, tabs: String): _Impl = {
    val __obj = js.Dynamic.literal(parent = parent.asInstanceOf[js.Any], tabs = tabs.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_Impl]
  }
}


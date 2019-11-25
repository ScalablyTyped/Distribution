package typings.semanticDashUiDashSidebar.SemanticUI.Sidebar.SelectorSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Impl extends js.Object {
  /**
    * @default '.fixed'
    */
  var fixed: String
  /**
    * @default 'script, link, style, .ui.modal, .ui.dimmer, .ui.nag, .ui.fixed'
    */
  var omitted: String
  /**
    * @default '.pusher'
    */
  var pusher: String
  /**
    * @default '.ui.sidebar'
    */
  var sidebar: String
}

object _Impl {
  @scala.inline
  def apply(fixed: String, omitted: String, pusher: String, sidebar: String): _Impl = {
    val __obj = js.Dynamic.literal(fixed = fixed.asInstanceOf[js.Any], omitted = omitted.asInstanceOf[js.Any], pusher = pusher.asInstanceOf[js.Any], sidebar = sidebar.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_Impl]
  }
}


package typings.semanticUiSidebar.SemanticUI.Sidebar.SelectorSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Impl extends js.Object {
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

object Impl {
  @scala.inline
  def apply(fixed: String, omitted: String, pusher: String, sidebar: String): Impl = {
    val __obj = js.Dynamic.literal(fixed = fixed.asInstanceOf[js.Any], omitted = omitted.asInstanceOf[js.Any], pusher = pusher.asInstanceOf[js.Any], sidebar = sidebar.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Impl]
  }
}


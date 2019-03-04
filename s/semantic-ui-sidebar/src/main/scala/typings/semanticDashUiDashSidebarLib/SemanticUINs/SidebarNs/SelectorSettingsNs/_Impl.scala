package typings
package semanticDashUiDashSidebarLib.SemanticUINs.SidebarNs.SelectorSettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Impl extends js.Object {
  /**
    * @default '.fixed'
    */
  var fixed: java.lang.String
  /**
    * @default 'script, link, style, .ui.modal, .ui.dimmer, .ui.nag, .ui.fixed'
    */
  var omitted: java.lang.String
  /**
    * @default '.pusher'
    */
  var pusher: java.lang.String
  /**
    * @default '.ui.sidebar'
    */
  var sidebar: java.lang.String
}

object _Impl {
  @scala.inline
  def apply(
    fixed: java.lang.String,
    omitted: java.lang.String,
    pusher: java.lang.String,
    sidebar: java.lang.String
  ): _Impl = {
    val __obj = js.Dynamic.literal(fixed = fixed, omitted = omitted, pusher = pusher, sidebar = sidebar)
  
    __obj.asInstanceOf[_Impl]
  }
}


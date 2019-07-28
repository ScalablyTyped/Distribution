package typings.semanticDashUiDashSidebar.SemanticUINs.SidebarNs.DefaultTransitionSettingsNs.ComputerSettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Impl extends js.Object {
  /**
    * @default 'overlay'
    */
  var bottom: String
  /**
    * @default 'uncover'
    */
  var left: String
  /**
    * @default 'uncover'
    */
  var right: String
  /**
    * @default 'overlay'
    */
  var top: String
}

object _Impl {
  @scala.inline
  def apply(bottom: String, left: String, right: String, top: String): _Impl = {
    val __obj = js.Dynamic.literal(bottom = bottom, left = left, right = right, top = top)
  
    __obj.asInstanceOf[_Impl]
  }
}


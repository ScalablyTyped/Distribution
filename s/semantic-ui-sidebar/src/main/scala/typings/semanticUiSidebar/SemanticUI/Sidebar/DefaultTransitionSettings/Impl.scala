package typings.semanticUiSidebar.SemanticUI.Sidebar.DefaultTransitionSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Impl extends js.Object {
  var computer: ComputerSettings
  var mobile: MobileSettings
}

object Impl {
  @scala.inline
  def apply(computer: ComputerSettings, mobile: MobileSettings): Impl = {
    val __obj = js.Dynamic.literal(computer = computer.asInstanceOf[js.Any], mobile = mobile.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Impl]
  }
}


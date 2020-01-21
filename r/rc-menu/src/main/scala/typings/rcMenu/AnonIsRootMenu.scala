package typings.rcMenu

import typings.react.mod.ReactInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIsRootMenu extends js.Object {
  var isRootMenu: Boolean
  var subMenuInstance: ReactInstance
}

object AnonIsRootMenu {
  @scala.inline
  def apply(isRootMenu: Boolean, subMenuInstance: ReactInstance): AnonIsRootMenu = {
    val __obj = js.Dynamic.literal(isRootMenu = isRootMenu.asInstanceOf[js.Any], subMenuInstance = subMenuInstance.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonIsRootMenu]
  }
}


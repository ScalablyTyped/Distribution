package typings.rcDashMenu

import typings.react.reactMod.ReactInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IsRootMenu extends js.Object {
  var isRootMenu: Boolean
  var subMenuInstance: ReactInstance
}

object Anon_IsRootMenu {
  @scala.inline
  def apply(isRootMenu: Boolean, subMenuInstance: ReactInstance): Anon_IsRootMenu = {
    val __obj = js.Dynamic.literal(isRootMenu = isRootMenu, subMenuInstance = subMenuInstance.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_IsRootMenu]
  }
}


package typings.rcMenu

import typings.rcMenu.subPopupMenuMod.SubPopupMenu
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGetWrappedInstance extends js.Object {
  def getWrappedInstance(): SubPopupMenu
}

object AnonGetWrappedInstance {
  @scala.inline
  def apply(getWrappedInstance: () => SubPopupMenu): AnonGetWrappedInstance = {
    val __obj = js.Dynamic.literal(getWrappedInstance = js.Any.fromFunction0(getWrappedInstance))
  
    __obj.asInstanceOf[AnonGetWrappedInstance]
  }
}


package typings
package reactDashSelectLib.libComponentsMenuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PortalStyleArgs extends js.Object {
  var offset: scala.Double
  var position: reactDashSelectLib.libTypesMod.MenuPosition
  var rect: reactDashSelectLib.libUtilsMod.RectType
}

object PortalStyleArgs {
  @scala.inline
  def apply(
    offset: scala.Double,
    position: reactDashSelectLib.libTypesMod.MenuPosition,
    rect: reactDashSelectLib.libUtilsMod.RectType
  ): PortalStyleArgs = {
    val __obj = js.Dynamic.literal(offset = offset, position = position, rect = rect)
  
    __obj.asInstanceOf[PortalStyleArgs]
  }
}


package typings
package reactDashSelectLib.srcComponentsMenuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PortalStyleArgs extends js.Object {
  var offset: scala.Double
  var position: reactDashSelectLib.srcTypesMod.MenuPosition
  var rect: reactDashSelectLib.srcUtilsMod.RectType
}

object PortalStyleArgs {
  @scala.inline
  def apply(
    offset: scala.Double,
    position: reactDashSelectLib.srcTypesMod.MenuPosition,
    rect: reactDashSelectLib.srcUtilsMod.RectType
  ): PortalStyleArgs = {
    val __obj = js.Dynamic.literal(offset = offset, position = position, rect = rect)
  
    __obj.asInstanceOf[PortalStyleArgs]
  }
}


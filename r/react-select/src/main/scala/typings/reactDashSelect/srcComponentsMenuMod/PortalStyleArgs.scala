package typings.reactDashSelect.srcComponentsMenuMod

import typings.reactDashSelect.srcTypesMod.MenuPosition
import typings.reactDashSelect.srcUtilsMod.RectType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PortalStyleArgs extends js.Object {
  var offset: Double
  var position: MenuPosition
  var rect: RectType
}

object PortalStyleArgs {
  @scala.inline
  def apply(offset: Double, position: MenuPosition, rect: RectType): PortalStyleArgs = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], rect = rect.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PortalStyleArgs]
  }
}


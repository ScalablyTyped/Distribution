package typings
package reactDashSelectLib.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThemeSpacing extends js.Object {
  var baseUnit: scala.Double
  var controlHeight: scala.Double
  var menuGutter: scala.Double
}

object ThemeSpacing {
  @scala.inline
  def apply(baseUnit: scala.Double, controlHeight: scala.Double, menuGutter: scala.Double): ThemeSpacing = {
    val __obj = js.Dynamic.literal(baseUnit = baseUnit, controlHeight = controlHeight, menuGutter = menuGutter)
  
    __obj.asInstanceOf[ThemeSpacing]
  }
}


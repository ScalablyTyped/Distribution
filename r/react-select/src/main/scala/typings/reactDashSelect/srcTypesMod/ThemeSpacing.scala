package typings.reactDashSelect.srcTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThemeSpacing extends js.Object {
  var baseUnit: Double
  var controlHeight: Double
  var menuGutter: Double
}

object ThemeSpacing {
  @scala.inline
  def apply(baseUnit: Double, controlHeight: Double, menuGutter: Double): ThemeSpacing = {
    val __obj = js.Dynamic.literal(baseUnit = baseUnit.asInstanceOf[js.Any], controlHeight = controlHeight.asInstanceOf[js.Any], menuGutter = menuGutter.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ThemeSpacing]
  }
}


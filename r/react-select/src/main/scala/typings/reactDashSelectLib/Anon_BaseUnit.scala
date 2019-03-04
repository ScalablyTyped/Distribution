package typings
package reactDashSelectLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BaseUnit extends js.Object {
  /* Used to calculate consistent margin/padding on elements */
  var baseUnit: scala.Double
  /* The minimum height of the control */
  var controlHeight: scala.Double
  /* The amount of space between the control and menu */
  var menuGutter: scala.Double
}

object Anon_BaseUnit {
  @scala.inline
  def apply(baseUnit: scala.Double, controlHeight: scala.Double, menuGutter: scala.Double): Anon_BaseUnit = {
    val __obj = js.Dynamic.literal(baseUnit = baseUnit, controlHeight = controlHeight, menuGutter = menuGutter)
  
    __obj.asInstanceOf[Anon_BaseUnit]
  }
}


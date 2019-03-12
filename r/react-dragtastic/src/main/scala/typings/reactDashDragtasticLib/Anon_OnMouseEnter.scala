package typings
package reactDashDragtasticLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OnMouseEnter extends js.Object {
  def onMouseEnter(): scala.Unit
  def onMouseLeave(): scala.Unit
  def onMouseUp(): scala.Unit
}

object Anon_OnMouseEnter {
  @scala.inline
  def apply(onMouseEnter: () => scala.Unit, onMouseLeave: () => scala.Unit, onMouseUp: () => scala.Unit): Anon_OnMouseEnter = {
    val __obj = js.Dynamic.literal(onMouseEnter = js.Any.fromFunction0(onMouseEnter), onMouseLeave = js.Any.fromFunction0(onMouseLeave), onMouseUp = js.Any.fromFunction0(onMouseUp))
  
    __obj.asInstanceOf[Anon_OnMouseEnter]
  }
}


package typings
package reactDashMovableLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Canceled extends js.Object {
  def canceled(position: scala.Double): java.lang.String
  def dropped(from: scala.Double, to: scala.Double): java.lang.String
  def item(position: scala.Double): java.lang.String
  def lifted(position: scala.Double): java.lang.String
  def moved(position: scala.Double, up: scala.Boolean): java.lang.String
}

object Anon_Canceled {
  @scala.inline
  def apply(
    canceled: scala.Double => java.lang.String,
    dropped: (scala.Double, scala.Double) => java.lang.String,
    item: scala.Double => java.lang.String,
    lifted: scala.Double => java.lang.String,
    moved: (scala.Double, scala.Boolean) => java.lang.String
  ): Anon_Canceled = {
    val __obj = js.Dynamic.literal(canceled = js.Any.fromFunction1(canceled), dropped = js.Any.fromFunction2(dropped), item = js.Any.fromFunction1(item), lifted = js.Any.fromFunction1(lifted), moved = js.Any.fromFunction2(moved))
  
    __obj.asInstanceOf[Anon_Canceled]
  }
}


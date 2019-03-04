package typings
package reactDashBroadcastLib.reactDashBroadcastMod.BroadcastNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultProps[T] extends js.Object {
  def compareValues(prevValue: T, nextValue: T): scala.Boolean
}

object DefaultProps {
  @scala.inline
  def apply[T](compareValues: js.Function2[T, T, scala.Boolean]): DefaultProps[T] = {
    val __obj = js.Dynamic.literal(compareValues = compareValues)
  
    __obj.asInstanceOf[DefaultProps[T]]
  }
}


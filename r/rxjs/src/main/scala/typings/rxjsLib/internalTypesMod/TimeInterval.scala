package typings
package rxjsLib.internalTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeInterval[T] extends js.Object {
  var interval: scala.Double
  var value: T
}

object TimeInterval {
  @scala.inline
  def apply[T](interval: scala.Double, value: T): TimeInterval[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("interval")(interval)
    __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeInterval[T]]
  }
}


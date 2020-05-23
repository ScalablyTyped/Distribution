package typings.rxLiteTesting.Rx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Recorded extends js.Object {
  var time: Double
  var value: js.Any
  def equals(other: Recorded): Boolean
}

object Recorded {
  @scala.inline
  def apply(equals: Recorded => Boolean, time: Double, value: js.Any): Recorded = {
    val __obj = js.Dynamic.literal(equals = js.Any.fromFunction1(equals), time = time.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Recorded]
  }
}


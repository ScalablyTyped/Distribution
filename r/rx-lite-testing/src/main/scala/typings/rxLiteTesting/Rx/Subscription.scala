package typings.rxLiteTesting.Rx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Subscription extends js.Object {
  def equals(other: Subscription): Boolean
}

object Subscription {
  @scala.inline
  def apply(equals: Subscription => Boolean): Subscription = {
    val __obj = js.Dynamic.literal(equals = js.Any.fromFunction1(equals))
    __obj.asInstanceOf[Subscription]
  }
}


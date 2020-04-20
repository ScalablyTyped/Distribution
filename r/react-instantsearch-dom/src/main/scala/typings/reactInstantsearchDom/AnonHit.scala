package typings.reactInstantsearchDom

import typings.reactInstantsearchCore.mod.Hit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHit[T] extends js.Object {
  var hit: Hit[T]
}

object AnonHit {
  @scala.inline
  def apply[T](hit: Hit[T]): AnonHit[T] = {
    val __obj = js.Dynamic.literal(hit = hit.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHit[T]]
  }
}


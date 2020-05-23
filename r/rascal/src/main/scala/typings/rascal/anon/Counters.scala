package typings.rascal.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Counters extends js.Object {
  var counters: InMemory
}

object Counters {
  @scala.inline
  def apply(counters: InMemory): Counters = {
    val __obj = js.Dynamic.literal(counters = counters.asInstanceOf[js.Any])
    __obj.asInstanceOf[Counters]
  }
}


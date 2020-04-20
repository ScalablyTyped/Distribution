package typings.semanticUiReactEventStack

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPool extends js.Object {
  var pool: String
  var target: String
}

object AnonPool {
  @scala.inline
  def apply(pool: String, target: String): AnonPool = {
    val __obj = js.Dynamic.literal(pool = pool.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPool]
  }
}


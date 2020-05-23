package typings.semanticUiReactEventStack.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pool extends js.Object {
  var pool: String
  var target: String
}

object Pool {
  @scala.inline
  def apply(pool: String, target: String): Pool = {
    val __obj = js.Dynamic.literal(pool = pool.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pool]
  }
}


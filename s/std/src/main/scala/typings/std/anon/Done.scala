package typings.std.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Done[Arr] extends js.Object {
  var done: Arr
  var recur: Arr
}

object Done {
  @scala.inline
  def apply[Arr](done: Arr, recur: Arr): Done[Arr] = {
    val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any], recur = recur.asInstanceOf[js.Any])
    __obj.asInstanceOf[Done[Arr]]
  }
}


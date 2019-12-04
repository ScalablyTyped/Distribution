package typings.atPulumiPulumi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Done[T] extends js.Object {
  var done: Boolean
  var value: js.UndefOr[T] = js.undefined
}

object Anon_Done {
  @scala.inline
  def apply[T](done: Boolean, value: T = null): Anon_Done[T] = {
    val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Done[T]]
  }
}


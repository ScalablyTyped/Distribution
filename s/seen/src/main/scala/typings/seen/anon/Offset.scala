package typings.seen.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Offset extends js.Object {
  var offset: js.Array[Double]
  var offsetRelative: js.Array[Double]
}

object Offset {
  @scala.inline
  def apply(offset: js.Array[Double], offsetRelative: js.Array[Double]): Offset = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], offsetRelative = offsetRelative.asInstanceOf[js.Any])
    __obj.asInstanceOf[Offset]
  }
}


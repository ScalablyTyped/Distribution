package typings.seen

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Offset extends js.Object {
  var offset: js.Array[Double]
  var offsetRelative: js.Array[Double]
}

object Anon_Offset {
  @scala.inline
  def apply(offset: js.Array[Double], offsetRelative: js.Array[Double]): Anon_Offset = {
    val __obj = js.Dynamic.literal(offset = offset, offsetRelative = offsetRelative)
  
    __obj.asInstanceOf[Anon_Offset]
  }
}


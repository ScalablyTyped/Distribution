package typings.ranjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Accepted extends js.Object {
  var accepted: Boolean
  var x: js.Array[Double]
}

object Accepted {
  @scala.inline
  def apply(accepted: Boolean, x: js.Array[Double]): Accepted = {
    val __obj = js.Dynamic.literal(accepted = accepted.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any])
    __obj.asInstanceOf[Accepted]
  }
}


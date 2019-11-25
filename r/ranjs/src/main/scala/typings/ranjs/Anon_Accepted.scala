package typings.ranjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Accepted extends js.Object {
  var accepted: Boolean
  var x: js.Array[Double]
}

object Anon_Accepted {
  @scala.inline
  def apply(accepted: Boolean, x: js.Array[Double]): Anon_Accepted = {
    val __obj = js.Dynamic.literal(accepted = accepted.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Accepted]
  }
}


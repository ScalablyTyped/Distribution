package typings.sentiment.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Apply extends js.Object {
  @JSName("apply")
  def apply(tokens: js.Array[String], cursor: Double, tokenScore: Double): Double
}

object Apply {
  @scala.inline
  def apply(apply: (js.Array[String], Double, Double) => Double): Apply = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction3(apply))
    __obj.asInstanceOf[Apply]
  }
}


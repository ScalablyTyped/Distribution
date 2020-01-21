package typings.seen

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonF extends js.Object {
  def f(f: js.Any): js.Any
  def v(v: js.Any): js.Any
}

object AnonF {
  @scala.inline
  def apply(f: js.Any => js.Any, v: js.Any => js.Any): AnonF = {
    val __obj = js.Dynamic.literal(f = js.Any.fromFunction1(f), v = js.Any.fromFunction1(v))
  
    __obj.asInstanceOf[AnonF]
  }
}


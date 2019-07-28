package typings.reduxDashTestkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Flush extends js.Object {
  def flush(): Unit
  def reset(): Unit
}

object Anon_Flush {
  @scala.inline
  def apply(flush: () => Unit, reset: () => Unit): Anon_Flush = {
    val __obj = js.Dynamic.literal(flush = js.Any.fromFunction0(flush), reset = js.Any.fromFunction0(reset))
  
    __obj.asInstanceOf[Anon_Flush]
  }
}


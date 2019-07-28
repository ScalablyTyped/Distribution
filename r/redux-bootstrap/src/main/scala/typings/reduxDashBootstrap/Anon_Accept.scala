package typings.reduxDashBootstrap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Accept extends js.Object {
  def accept(path: String, cb: js.Function0[Unit]): Unit
}

object Anon_Accept {
  @scala.inline
  def apply(accept: (String, js.Function0[Unit]) => Unit): Anon_Accept = {
    val __obj = js.Dynamic.literal(accept = js.Any.fromFunction2(accept))
  
    __obj.asInstanceOf[Anon_Accept]
  }
}


package typings.atStorybookClientDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClearUnused extends js.Object {
  def clearUnused(): Unit
  def markAllAsUnused(): Unit
  def register(subscribe: js.Function0[Unit]): Unit
}

object Anon_ClearUnused {
  @scala.inline
  def apply(clearUnused: () => Unit, markAllAsUnused: () => Unit, register: js.Function0[Unit] => Unit): Anon_ClearUnused = {
    val __obj = js.Dynamic.literal(clearUnused = js.Any.fromFunction0(clearUnused), markAllAsUnused = js.Any.fromFunction0(markAllAsUnused), register = js.Any.fromFunction1(register))
  
    __obj.asInstanceOf[Anon_ClearUnused]
  }
}


package typings.shipitDashCli.shipitDashCliMod

import typings.shipitDashCli.Typeofshipit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Task extends js.Object {
  var blocking: Boolean
  var dep: js.Array[String]
  var name: String
  def fn(): Unit
}

object Task {
  @scala.inline
  def apply(blocking: Boolean, dep: js.Array[String], fn: () => Unit, name: String): Task = {
    val __obj = js.Dynamic.literal(blocking = blocking, dep = dep, fn = js.Any.fromFunction0(fn), name = name)
  
    __obj.asInstanceOf[Task]
  }
}

@JSImport("shipit-cli", "task")
@js.native
object task extends js.Object {
  def apply(name: String, depsOrFn: js.Array[String]): Typeofshipit = js.native
  def apply(name: String, depsOrFn: js.Array[String], fn: js.Function0[Unit]): Typeofshipit = js.native
  def apply(name: String, depsOrFn: EmptyCallback): Typeofshipit = js.native
  def apply(name: String, depsOrFn: EmptyCallback, fn: js.Function0[Unit]): Typeofshipit = js.native
}


package typings.shipitCli.mod

import typings.shipitCli.Typeofshipit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("shipit-cli", "task")
@js.native
object task extends js.Object {
  def apply(name: String, depsOrFn: js.Array[String]): Typeofshipit = js.native
  def apply(name: String, depsOrFn: js.Array[String], fn: js.Function0[Unit]): Typeofshipit = js.native
  def apply(name: String, depsOrFn: EmptyCallback): Typeofshipit = js.native
  def apply(name: String, depsOrFn: EmptyCallback, fn: js.Function0[Unit]): Typeofshipit = js.native
}


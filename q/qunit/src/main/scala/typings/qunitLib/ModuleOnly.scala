package typings
package qunitLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModuleOnly extends js.Object {
  @JSName("only")
  var only_Original: moduleFunc1 with moduleFunc2 = js.native
  def only(name: java.lang.String): scala.Unit = js.native
  def only(name: java.lang.String, hooks: Hooks): scala.Unit = js.native
  def only(name: java.lang.String, hooks: Hooks, nested: js.Function1[/* hooks */ NestedHooks, scala.Unit]): scala.Unit = js.native
  def only(name: java.lang.String, nested: js.Function1[/* hooks */ NestedHooks, scala.Unit]): scala.Unit = js.native
}


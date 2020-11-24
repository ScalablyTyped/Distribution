package typings.qunit.mod.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModuleOnly extends js.Object {
  
  def only(name: String): Unit = js.native
  def only(
    name: String,
    hooks: js.UndefOr[scala.Nothing],
    nested: js.Function1[/* hooks */ NestedHooks, Unit]
  ): Unit = js.native
  def only(name: String, hooks: Hooks): Unit = js.native
  def only(name: String, hooks: Hooks, nested: js.Function1[/* hooks */ NestedHooks, Unit]): Unit = js.native
  def only(name: String, nested: js.Function1[/* hooks */ NestedHooks, Unit]): Unit = js.native
  @JSName("only")
  var only_Original: moduleFunc1 with moduleFunc2 = js.native
}

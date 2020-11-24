package typings.select2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Select2Require extends js.Object {
  
  def apply(module: String): js.Any = js.native
  def apply(modules: js.Array[String]): Unit = js.native
  def apply(modules: js.Array[String], ready: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  def apply(
    modules: js.Array[String],
    ready: js.Function1[/* repeated */ js.Any, Unit],
    errback: js.Function1[/* err */ js.Any, Unit]
  ): Unit = js.native
  
  def config(config: Select2RequireConfig): Select2Require = js.native
}

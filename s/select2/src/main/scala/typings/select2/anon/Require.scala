package typings.select2.anon

import typings.select2.mod.Select2Require
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Require extends js.Object {
  
  def require(module: String): js.Any = js.native
  def require(modules: js.Array[String]): Unit = js.native
  def require(modules: js.Array[String], ready: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  def require(
    modules: js.Array[String],
    ready: js.Function1[/* repeated */ js.Any, Unit],
    errback: js.Function1[/* err */ js.Any, Unit]
  ): Unit = js.native
  @JSName("require")
  var require_Original: Select2Require = js.native
}

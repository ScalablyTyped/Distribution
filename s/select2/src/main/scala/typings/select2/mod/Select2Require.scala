package typings.select2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Select2Require extends StObject {
  
  def apply(module: String): Any = js.native
  def apply(modules: js.Array[String]): Unit = js.native
  def apply(modules: js.Array[String], ready: js.Function1[/* repeated */ Any, Unit]): Unit = js.native
  def apply(
    modules: js.Array[String],
    ready: js.Function1[/* repeated */ Any, Unit],
    errback: js.Function1[/* err */ Any, Unit]
  ): Unit = js.native
  
  def config(config: Select2RequireConfig): Select2Require = js.native
}

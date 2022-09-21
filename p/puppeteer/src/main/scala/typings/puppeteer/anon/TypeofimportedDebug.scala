package typings.puppeteer.anon

import typings.debug.mod.Debug
import typings.debug.mod.Debugger
import typings.debug.mod.Formatters
import typings.ms.anon.Long
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofimportedDebug extends StObject {
  
  def apply(namespace: String): Debugger = js.native
  
  def default(namespace: String): Debugger = js.native
  
  def coerce(`val`: Any): Any = js.native
  
  def debug(namespace: String): Debugger = js.native
  @JSName("debug")
  var debug_Original: Debug = js.native
  
  @JSName("default")
  var default_Original: Debug = js.native
  
  def disable(): String = js.native
  
  def enable(namespaces: String): Unit = js.native
  
  def enabled(namespaces: String): Boolean = js.native
  
  def formatArgs(args: js.Array[Any]): Unit = js.native
  
  var formatters: Formatters = js.native
  
  def humanize(value: String): Double = js.native
  def humanize(value: Double): String = js.native
  def humanize(value: Double, options: Long): String = js.native
  @JSName("humanize")
  var humanize_Original: typings.debug.anon.FnCall = js.native
  
  def log(args: Any*): Any = js.native
  
  var names: js.Array[js.RegExp] = js.native
  
  def selectColor(namespace: String): String | Double = js.native
  
  var skips: js.Array[js.RegExp] = js.native
}

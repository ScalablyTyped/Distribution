package typings
package simplecrawlerLib.vmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vm", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def createContext(): Context = js.native
  def createContext(sandbox: Context): Context = js.native
  def isContext(sandbox: Context): scala.Boolean = js.native
  def runInContext(code: java.lang.String, contextifiedSandbox: Context): js.Any = js.native
  def runInContext(code: java.lang.String, contextifiedSandbox: Context, options: RunningScriptOptions): js.Any = js.native
  def runInDebugContext(code: java.lang.String): js.Any = js.native
  def runInNewContext(code: java.lang.String): js.Any = js.native
  def runInNewContext(code: java.lang.String, sandbox: Context): js.Any = js.native
  def runInNewContext(code: java.lang.String, sandbox: Context, options: RunningScriptOptions): js.Any = js.native
  def runInThisContext(code: java.lang.String): js.Any = js.native
  def runInThisContext(code: java.lang.String, options: RunningScriptOptions): js.Any = js.native
}


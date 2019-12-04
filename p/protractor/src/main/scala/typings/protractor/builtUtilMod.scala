package typings.protractor

import typings.q.qMod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protractor/built/util", JSImport.Namespace)
@js.native
object builtUtilMod extends js.Object {
  def falseIfMissing(error: js.Any): Boolean = js.native
  def filterStackTrace(text: String): String = js.native
  def joinTestLogs(log1: js.Any, log2: js.Any): js.Any = js.native
  def passBoolean(value: Boolean): Boolean = js.native
  def runFilenameOrFn_(configDir: String, filenameOrFn: js.Any): Promise[_] = js.native
  def runFilenameOrFn_(configDir: String, filenameOrFn: js.Any, args: js.Array[_]): Promise[_] = js.native
}


package typings.protractor

import typings.q.mod.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilMod {
  
  @JSImport("protractor/built/util", "falseIfMissing")
  @js.native
  def falseIfMissing(error: js.Any): Boolean = js.native
  
  @JSImport("protractor/built/util", "filterStackTrace")
  @js.native
  def filterStackTrace(text: String): String = js.native
  
  @JSImport("protractor/built/util", "joinTestLogs")
  @js.native
  def joinTestLogs(log1: js.Any, log2: js.Any): js.Any = js.native
  
  @JSImport("protractor/built/util", "passBoolean")
  @js.native
  def passBoolean(value: Boolean): Boolean = js.native
  
  @JSImport("protractor/built/util", "runFilenameOrFn_")
  @js.native
  def runFilenameOrFn(configDir: String, filenameOrFn: js.Any): Promise[_] = js.native
  @JSImport("protractor/built/util", "runFilenameOrFn_")
  @js.native
  def runFilenameOrFn(configDir: String, filenameOrFn: js.Any, args: js.Array[_]): Promise[_] = js.native
}

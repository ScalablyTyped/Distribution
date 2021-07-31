package typings.protractor

import typings.q.mod.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilMod {
  
  @JSImport("protractor/built/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def falseIfMissing(error: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("falseIfMissing")(error.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def filterStackTrace(text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("filterStackTrace")(text.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def joinTestLogs(log1: js.Any, log2: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("joinTestLogs")(log1.asInstanceOf[js.Any], log2.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def passBoolean(value: Boolean): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("passBoolean")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def runFilenameOrFn(configDir: String, filenameOrFn: js.Any): Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("runFilenameOrFn_")(configDir.asInstanceOf[js.Any], filenameOrFn.asInstanceOf[js.Any])).asInstanceOf[Promise[js.Any]]
  @scala.inline
  def runFilenameOrFn(configDir: String, filenameOrFn: js.Any, args: js.Array[js.Any]): Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("runFilenameOrFn_")(configDir.asInstanceOf[js.Any], filenameOrFn.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Promise[js.Any]]
}

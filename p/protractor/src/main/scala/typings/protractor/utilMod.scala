package typings.protractor

import typings.q.mod.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilMod {
  
  @JSImport("protractor/built/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def falseIfMissing(error: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("falseIfMissing")(error.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def filterStackTrace(text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("filterStackTrace")(text.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def joinTestLogs(log1: Any, log2: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("joinTestLogs")(log1.asInstanceOf[js.Any], log2.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def passBoolean(value: Boolean): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("passBoolean")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def runFilenameOrFn(configDir: String, filenameOrFn: Any): Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("runFilenameOrFn_")(configDir.asInstanceOf[js.Any], filenameOrFn.asInstanceOf[js.Any])).asInstanceOf[Promise[Any]]
  inline def runFilenameOrFn(configDir: String, filenameOrFn: Any, args: js.Array[Any]): Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("runFilenameOrFn_")(configDir.asInstanceOf[js.Any], filenameOrFn.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Promise[Any]]
}

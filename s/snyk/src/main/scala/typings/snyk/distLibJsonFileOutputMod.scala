package typings.snyk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibJsonFileOutputMod {
  
  @JSImport("snyk/dist/lib/json-file-output", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("snyk/dist/lib/json-file-output", "MIN_VERSION_FOR_MKDIR_RECURSIVE")
  @js.native
  val MIN_VERSION_FOR_MKDIR_RECURSIVE: /* "10.12.0" */ String = js.native
  
  inline def createDirectory(newDirectoryFullPath: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("createDirectory")(newDirectoryFullPath.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def saveJsonToFileCreatingDirectoryIfRequired(jsonOutputFile: String, contents: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("saveJsonToFileCreatingDirectoryIfRequired")(jsonOutputFile.asInstanceOf[js.Any], contents.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def writeContentsToFileSwallowingErrors(jsonOutputFile: String, contents: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeContentsToFileSwallowingErrors")(jsonOutputFile.asInstanceOf[js.Any], contents.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}

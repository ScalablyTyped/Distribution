package typings.snyk

import typings.std.Generator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCliCommandsTestIacLocalExecutionDirectoryLoaderMod {
  
  @JSImport("snyk/dist/cli/commands/test/iac/local-execution/directory-loader", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getAllDirectoriesForPath(pathToScan: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllDirectoriesForPath")(pathToScan.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def getAllDirectoriesForPath(pathToScan: String, maxDepth: Double): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAllDirectoriesForPath")(pathToScan.asInstanceOf[js.Any], maxDepth.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def getFileType(pathToScan: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getFileType")(pathToScan.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getFilesForDirectory(pathToScan: String, currentDirectory: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFilesForDirectory")(pathToScan.asInstanceOf[js.Any], currentDirectory.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def getFilesForDirectoryGenerator(pathToScan: String): Generator[String, Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFilesForDirectoryGenerator")(pathToScan.asInstanceOf[js.Any]).asInstanceOf[Generator[String, Any, Any]]
  
  inline def shouldBeParsed(pathToScan: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("shouldBeParsed")(pathToScan.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}

package typings.snyk

import typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.IacFileData
import typings.snyk.distLibErrorsMod.CustomError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCliCommandsTestIacLocalExecutionFileLoaderMod {
  
  @JSImport("snyk/dist/cli/commands/test/iac/local-execution/file-loader", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("snyk/dist/cli/commands/test/iac/local-execution/file-loader", "FailedToLoadFileError")
  @js.native
  open class FailedToLoadFileError protected () extends CustomError {
    def this(filename: String) = this()
    
    var filename: String = js.native
  }
  
  @JSImport("snyk/dist/cli/commands/test/iac/local-execution/file-loader", "NoFilesToScanError")
  @js.native
  open class NoFilesToScanError () extends CustomError {
    def this(message: String) = this()
  }
  
  inline def loadContentForFiles(filePaths: js.Array[String]): js.Promise[js.Array[IacFileData]] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadContentForFiles")(filePaths.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[IacFileData]]]
  
  inline def tryLoadFileData(pathToScan: String): js.Promise[IacFileData] = ^.asInstanceOf[js.Dynamic].applyDynamic("tryLoadFileData")(pathToScan.asInstanceOf[js.Any]).asInstanceOf[js.Promise[IacFileData]]
}

package typings.snyk

import typings.snyk.anon.FailedScans
import typings.snyk.anon.InvalidIssues
import typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.IacFileParsed
import typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.IacFileScanResult
import typings.snyk.distLibErrorsMod.CustomError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCliCommandsTestIacLocalExecutionFileScannerMod {
  
  @JSImport("snyk/dist/cli/commands/test/iac/local-execution/file-scanner", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("snyk/dist/cli/commands/test/iac/local-execution/file-scanner", "FailedToBuildPolicyEngine")
  @js.native
  open class FailedToBuildPolicyEngine () extends CustomError {
    def this(message: String) = this()
  }
  
  @JSImport("snyk/dist/cli/commands/test/iac/local-execution/file-scanner", "FailedToExecutePolicyEngine")
  @js.native
  open class FailedToExecutePolicyEngine () extends CustomError {
    def this(message: String) = this()
  }
  
  inline def clearPolicyEngineCache(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearPolicyEngineCache")().asInstanceOf[Unit]
  
  inline def scanFiles(parsedFiles: js.Array[IacFileParsed]): js.Promise[FailedScans] = ^.asInstanceOf[js.Dynamic].applyDynamic("scanFiles")(parsedFiles.asInstanceOf[js.Any]).asInstanceOf[js.Promise[FailedScans]]
  
  inline def validateResultFromCustomRules(result: IacFileScanResult): InvalidIssues = ^.asInstanceOf[js.Dynamic].applyDynamic("validateResultFromCustomRules")(result.asInstanceOf[js.Any]).asInstanceOf[InvalidIssues]
}

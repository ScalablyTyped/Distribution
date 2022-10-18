package typings.snyk

import typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.IacFileScanResult
import typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.IacShareResultsFormat
import typings.snyk.distLibTypesMod.IacOutputMeta
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCliCommandsTestIacLocalExecutionProcessResultsShareResultsFormatterMod {
  
  @JSImport("snyk/dist/cli/commands/test/iac/local-execution/process-results/share-results-formatter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def formatShareResults(projectRoot: String, scanResults: js.Array[IacFileScanResult], meta: IacOutputMeta): js.Array[IacShareResultsFormat] = (^.asInstanceOf[js.Dynamic].applyDynamic("formatShareResults")(projectRoot.asInstanceOf[js.Any], scanResults.asInstanceOf[js.Any], meta.asInstanceOf[js.Any])).asInstanceOf[js.Array[IacShareResultsFormat]]
}

package typings.snyk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCliCommandsTestIacLocalExecutionProcessResultsExtractLineNumberMod {
  
  @JSImport("snyk/dist/cli/commands/test/iac/local-execution/process-results/extract-line-number", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def extractLineNumber(
    cloudConfigPath: js.Array[String],
    fileType: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CloudConfigFileTypes */ Any,
    treeByDocId: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MapsDocIdToTree */ Any
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("extractLineNumber")(cloudConfigPath.asInstanceOf[js.Any], fileType.asInstanceOf[js.Any], treeByDocId.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getFileTypeForParser(fileType: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getFileTypeForParser")(fileType.asInstanceOf[js.Any]).asInstanceOf[Any]
}

package typings.snyk

import typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.FormattedResult
import typings.snyk.distLibFormattersIacOutputTextTypesMod.IacTestData
import typings.snyk.distLibTypesMod.IacOutputMeta
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibFormattersIacOutputTextFormattersMod {
  
  @JSImport("snyk/dist/lib/formatters/iac-output/text/formatters", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def formatSnykIacTestTestData(
    snykIacTestScanResult: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Results */ Any,
    projectName: String,
    orgName: String
  ): IacTestData = (^.asInstanceOf[js.Dynamic].applyDynamic("formatSnykIacTestTestData")(snykIacTestScanResult.asInstanceOf[js.Any], projectName.asInstanceOf[js.Any], orgName.asInstanceOf[js.Any])).asInstanceOf[IacTestData]
  inline def formatSnykIacTestTestData(snykIacTestScanResult: Unit, projectName: String, orgName: String): IacTestData = (^.asInstanceOf[js.Dynamic].applyDynamic("formatSnykIacTestTestData")(snykIacTestScanResult.asInstanceOf[js.Any], projectName.asInstanceOf[js.Any], orgName.asInstanceOf[js.Any])).asInstanceOf[IacTestData]
  
  inline def formatTestData(param0: FormatTestDataParams): IacTestData = ^.asInstanceOf[js.Dynamic].applyDynamic("formatTestData")(param0.asInstanceOf[js.Any]).asInstanceOf[IacTestData]
  
  trait FormatTestDataParams extends StObject {
    
    var iacOutputMeta: js.UndefOr[IacOutputMeta] = js.undefined
    
    var ignoresCount: Double
    
    var oldFormattedResults: js.Array[FormattedResult]
  }
  object FormatTestDataParams {
    
    inline def apply(ignoresCount: Double, oldFormattedResults: js.Array[FormattedResult]): FormatTestDataParams = {
      val __obj = js.Dynamic.literal(ignoresCount = ignoresCount.asInstanceOf[js.Any], oldFormattedResults = oldFormattedResults.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormatTestDataParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FormatTestDataParams] (val x: Self) extends AnyVal {
      
      inline def setIacOutputMeta(value: IacOutputMeta): Self = StObject.set(x, "iacOutputMeta", value.asInstanceOf[js.Any])
      
      inline def setIacOutputMetaUndefined: Self = StObject.set(x, "iacOutputMeta", js.undefined)
      
      inline def setIgnoresCount(value: Double): Self = StObject.set(x, "ignoresCount", value.asInstanceOf[js.Any])
      
      inline def setOldFormattedResults(value: js.Array[FormattedResult]): Self = StObject.set(x, "oldFormattedResults", value.asInstanceOf[js.Any])
      
      inline def setOldFormattedResultsVarargs(value: FormattedResult*): Self = StObject.set(x, "oldFormattedResults", js.Array(value*))
    }
  }
}

package typings.snyk.anon

import typings.ora.mod.Ora
import typings.snyk.distLibTypesMod.IacFileInDirectory
import typings.snyk.distLibTypesMod.TestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IacIgnoredIssuesCount extends StObject {
  
  var iacIgnoredIssuesCount: Double
  
  var iacOutputMeta: typings.snyk.distLibTypesMod.IacOutputMeta
  
  var iacScanFailures: js.Array[IacFileInDirectory]
  
  var isIacCustomRulesEntitlementEnabled: Boolean
  
  var isIacShareCliResultsCustomRulesSupported: Boolean
  
  var options: typings.snyk.distLibTypesMod.Options & TestOptions
  
  var results: js.Array[Any]
  
  var testSpinner: js.UndefOr[Ora] = js.undefined
}
object IacIgnoredIssuesCount {
  
  inline def apply(
    iacIgnoredIssuesCount: Double,
    iacOutputMeta: typings.snyk.distLibTypesMod.IacOutputMeta,
    iacScanFailures: js.Array[IacFileInDirectory],
    isIacCustomRulesEntitlementEnabled: Boolean,
    isIacShareCliResultsCustomRulesSupported: Boolean,
    options: typings.snyk.distLibTypesMod.Options & TestOptions,
    results: js.Array[Any]
  ): IacIgnoredIssuesCount = {
    val __obj = js.Dynamic.literal(iacIgnoredIssuesCount = iacIgnoredIssuesCount.asInstanceOf[js.Any], iacOutputMeta = iacOutputMeta.asInstanceOf[js.Any], iacScanFailures = iacScanFailures.asInstanceOf[js.Any], isIacCustomRulesEntitlementEnabled = isIacCustomRulesEntitlementEnabled.asInstanceOf[js.Any], isIacShareCliResultsCustomRulesSupported = isIacShareCliResultsCustomRulesSupported.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any])
    __obj.asInstanceOf[IacIgnoredIssuesCount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IacIgnoredIssuesCount] (val x: Self) extends AnyVal {
    
    inline def setIacIgnoredIssuesCount(value: Double): Self = StObject.set(x, "iacIgnoredIssuesCount", value.asInstanceOf[js.Any])
    
    inline def setIacOutputMeta(value: typings.snyk.distLibTypesMod.IacOutputMeta): Self = StObject.set(x, "iacOutputMeta", value.asInstanceOf[js.Any])
    
    inline def setIacScanFailures(value: js.Array[IacFileInDirectory]): Self = StObject.set(x, "iacScanFailures", value.asInstanceOf[js.Any])
    
    inline def setIacScanFailuresVarargs(value: IacFileInDirectory*): Self = StObject.set(x, "iacScanFailures", js.Array(value*))
    
    inline def setIsIacCustomRulesEntitlementEnabled(value: Boolean): Self = StObject.set(x, "isIacCustomRulesEntitlementEnabled", value.asInstanceOf[js.Any])
    
    inline def setIsIacShareCliResultsCustomRulesSupported(value: Boolean): Self = StObject.set(x, "isIacShareCliResultsCustomRulesSupported", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: typings.snyk.distLibTypesMod.Options & TestOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setResults(value: js.Array[Any]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setResultsVarargs(value: Any*): Self = StObject.set(x, "results", js.Array(value*))
    
    inline def setTestSpinner(value: Ora): Self = StObject.set(x, "testSpinner", value.asInstanceOf[js.Any])
    
    inline def setTestSpinnerUndefined: Self = StObject.set(x, "testSpinner", js.undefined)
  }
}

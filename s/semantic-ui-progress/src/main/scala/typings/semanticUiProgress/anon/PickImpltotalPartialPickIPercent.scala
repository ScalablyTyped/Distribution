package typings.semanticUiProgress.anon

import typings.semanticUiProgress.SemanticUI.Progress.MetadataSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-progress.SemanticUI.Progress.MetadataSettings._Impl, 'total'> & std.Partial<std.Pick<semantic-ui-progress.SemanticUI.Progress.MetadataSettings._Impl, keyof semantic-ui-progress.SemanticUI.Progress.MetadataSettings._Impl>> */
trait PickImpltotalPartialPickIPercent
  extends StObject
     with Param {
  
  var percent: js.UndefOr[String] = js.undefined
  
  var total: String & js.UndefOr[String]
  
  var value: js.UndefOr[String] = js.undefined
}
object PickImpltotalPartialPickIPercent {
  
  inline def apply(total: String & js.UndefOr[String]): PickImpltotalPartialPickIPercent = {
    val __obj = js.Dynamic.literal(total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpltotalPartialPickIPercent]
  }
  
  extension [Self <: PickImpltotalPartialPickIPercent](x: Self) {
    
    inline def setPercent(value: String): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
    
    inline def setPercentUndefined: Self = StObject.set(x, "percent", js.undefined)
    
    inline def setTotal(value: String & js.UndefOr[String]): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}

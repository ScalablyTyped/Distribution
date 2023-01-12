package typings.semanticUiProgress.anon

import typings.semanticUiProgress.SemanticUI.Progress.MetadataSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-progress.SemanticUI.Progress.MetadataSettings._Impl, 'value'> & std.Partial<std.Pick<semantic-ui-progress.SemanticUI.Progress.MetadataSettings._Impl, keyof semantic-ui-progress.SemanticUI.Progress.MetadataSettings._Impl>> */
trait PickImplvaluePartialPickIPercent
  extends StObject
     with Param {
  
  var percent: js.UndefOr[String] = js.undefined
  
  var total: js.UndefOr[String] = js.undefined
  
  var value: String
}
object PickImplvaluePartialPickIPercent {
  
  inline def apply(value: String): PickImplvaluePartialPickIPercent = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplvaluePartialPickIPercent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PickImplvaluePartialPickIPercent] (val x: Self) extends AnyVal {
    
    inline def setPercent(value: String): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
    
    inline def setPercentUndefined: Self = StObject.set(x, "percent", js.undefined)
    
    inline def setTotal(value: String): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    inline def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}

package typings.redisTimeSeries.commandsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MRangeWithLabelsOptions
  extends StObject
     with MRangeOptions {
  
  var SELECTED_LABELS: js.UndefOr[SelectedLabels] = js.undefined
}
object MRangeWithLabelsOptions {
  
  inline def apply(): MRangeWithLabelsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MRangeWithLabelsOptions]
  }
  
  extension [Self <: MRangeWithLabelsOptions](x: Self) {
    
    inline def setSELECTED_LABELS(value: SelectedLabels): Self = StObject.set(x, "SELECTED_LABELS", value.asInstanceOf[js.Any])
    
    inline def setSELECTED_LABELSUndefined: Self = StObject.set(x, "SELECTED_LABELS", js.undefined)
    
    inline def setSELECTED_LABELSVarargs(value: String*): Self = StObject.set(x, "SELECTED_LABELS", js.Array(value*))
  }
}

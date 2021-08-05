package typings.reactIntl.anon

import typings.formatjsEcma402Abstract.typesRelativeTimeMod.RelativeTimeUnit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<react-intl.react-intl/src/components/relative.State> */
trait PartialStateCurrentValueInSeconds extends StObject {
  
  var currentValueInSeconds: js.UndefOr[Double] = js.undefined
  
  var prevUnit: js.UndefOr[RelativeTimeUnit] = js.undefined
  
  var prevValue: js.UndefOr[Double] = js.undefined
}
object PartialStateCurrentValueInSeconds {
  
  inline def apply(): PartialStateCurrentValueInSeconds = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStateCurrentValueInSeconds]
  }
  
  extension [Self <: PartialStateCurrentValueInSeconds](x: Self) {
    
    inline def setCurrentValueInSeconds(value: Double): Self = StObject.set(x, "currentValueInSeconds", value.asInstanceOf[js.Any])
    
    inline def setCurrentValueInSecondsUndefined: Self = StObject.set(x, "currentValueInSeconds", js.undefined)
    
    inline def setPrevUnit(value: RelativeTimeUnit): Self = StObject.set(x, "prevUnit", value.asInstanceOf[js.Any])
    
    inline def setPrevUnitUndefined: Self = StObject.set(x, "prevUnit", js.undefined)
    
    inline def setPrevValue(value: Double): Self = StObject.set(x, "prevValue", value.asInstanceOf[js.Any])
    
    inline def setPrevValueUndefined: Self = StObject.set(x, "prevValue", js.undefined)
  }
}

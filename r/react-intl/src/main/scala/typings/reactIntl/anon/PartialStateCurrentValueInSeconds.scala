package typings.reactIntl.anon

import typings.formatjsEcma402Abstract.typesRelativeTimeMod.RelativeTimeUnit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<react-intl.react-intl/src/components/relative.State> */
@js.native
trait PartialStateCurrentValueInSeconds extends StObject {
  
  var currentValueInSeconds: js.UndefOr[Double] = js.native
  
  var prevUnit: js.UndefOr[RelativeTimeUnit] = js.native
  
  var prevValue: js.UndefOr[Double] = js.native
}
object PartialStateCurrentValueInSeconds {
  
  @scala.inline
  def apply(): PartialStateCurrentValueInSeconds = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStateCurrentValueInSeconds]
  }
  
  @scala.inline
  implicit class PartialStateCurrentValueInSecondsMutableBuilder[Self <: PartialStateCurrentValueInSeconds] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrentValueInSeconds(value: Double): Self = StObject.set(x, "currentValueInSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentValueInSecondsUndefined: Self = StObject.set(x, "currentValueInSeconds", js.undefined)
    
    @scala.inline
    def setPrevUnit(value: RelativeTimeUnit): Self = StObject.set(x, "prevUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrevUnitUndefined: Self = StObject.set(x, "prevUnit", js.undefined)
    
    @scala.inline
    def setPrevValue(value: Double): Self = StObject.set(x, "prevValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrevValueUndefined: Self = StObject.set(x, "prevValue", js.undefined)
  }
}

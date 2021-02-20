package typings.stellarSdk.horizonApiMod.Horizon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PriceR extends StObject {
  
  var denominator: Double = js.native
  
  var numerator: Double = js.native
}
object PriceR {
  
  @scala.inline
  def apply(denominator: Double, numerator: Double): PriceR = {
    val __obj = js.Dynamic.literal(denominator = denominator.asInstanceOf[js.Any], numerator = numerator.asInstanceOf[js.Any])
    __obj.asInstanceOf[PriceR]
  }
  
  @scala.inline
  implicit class PriceRMutableBuilder[Self <: PriceR] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDenominator(value: Double): Self = StObject.set(x, "denominator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumerator(value: Double): Self = StObject.set(x, "numerator", value.asInstanceOf[js.Any])
  }
}

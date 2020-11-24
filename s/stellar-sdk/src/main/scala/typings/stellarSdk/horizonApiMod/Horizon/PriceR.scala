package typings.stellarSdk.horizonApiMod.Horizon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PriceR extends js.Object {
  
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
  implicit class PriceROps[Self <: PriceR] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDenominator(value: Double): Self = this.set("denominator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumerator(value: Double): Self = this.set("numerator", value.asInstanceOf[js.Any])
  }
}

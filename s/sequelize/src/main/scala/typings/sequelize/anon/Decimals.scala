package typings.sequelize.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Decimals extends StObject {
  
  var decimals: js.UndefOr[Double] = js.undefined
  
  var length: Double
}
object Decimals {
  
  @scala.inline
  def apply(length: Double): Decimals = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
    __obj.asInstanceOf[Decimals]
  }
  
  @scala.inline
  implicit class DecimalsMutableBuilder[Self <: Decimals] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDecimals(value: Double): Self = StObject.set(x, "decimals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecimalsUndefined: Self = StObject.set(x, "decimals", js.undefined)
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
  }
}

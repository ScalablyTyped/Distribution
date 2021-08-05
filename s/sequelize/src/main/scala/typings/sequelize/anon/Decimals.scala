package typings.sequelize.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Decimals extends StObject {
  
  var decimals: js.UndefOr[Double] = js.undefined
  
  var length: Double
}
object Decimals {
  
  inline def apply(length: Double): Decimals = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
    __obj.asInstanceOf[Decimals]
  }
  
  extension [Self <: Decimals](x: Self) {
    
    inline def setDecimals(value: Double): Self = StObject.set(x, "decimals", value.asInstanceOf[js.Any])
    
    inline def setDecimalsUndefined: Self = StObject.set(x, "decimals", js.undefined)
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
  }
}

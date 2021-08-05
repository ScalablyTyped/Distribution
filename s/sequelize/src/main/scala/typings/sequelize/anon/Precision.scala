package typings.sequelize.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Precision extends StObject {
  
  var precision: Double
  
  var scale: js.UndefOr[Double] = js.undefined
}
object Precision {
  
  inline def apply(precision: Double): Precision = {
    val __obj = js.Dynamic.literal(precision = precision.asInstanceOf[js.Any])
    __obj.asInstanceOf[Precision]
  }
  
  extension [Self <: Precision](x: Self) {
    
    inline def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
    
    inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
  }
}

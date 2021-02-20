package typings.sequelize.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Precision extends StObject {
  
  var precision: Double = js.native
  
  var scale: js.UndefOr[Double] = js.native
}
object Precision {
  
  @scala.inline
  def apply(precision: Double): Precision = {
    val __obj = js.Dynamic.literal(precision = precision.asInstanceOf[js.Any])
    __obj.asInstanceOf[Precision]
  }
  
  @scala.inline
  implicit class PrecisionMutableBuilder[Self <: Precision] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
  }
}

package typings.recharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReferenceDotAxisConfiguration extends StObject {
  
  var scale: ScaleCalculator
}
object ReferenceDotAxisConfiguration {
  
  inline def apply(scale: /* x */ Double | String => Double): ReferenceDotAxisConfiguration = {
    val __obj = js.Dynamic.literal(scale = js.Any.fromFunction1(scale))
    __obj.asInstanceOf[ReferenceDotAxisConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReferenceDotAxisConfiguration] (val x: Self) extends AnyVal {
    
    inline def setScale(value: /* x */ Double | String => Double): Self = StObject.set(x, "scale", js.Any.fromFunction1(value))
  }
}

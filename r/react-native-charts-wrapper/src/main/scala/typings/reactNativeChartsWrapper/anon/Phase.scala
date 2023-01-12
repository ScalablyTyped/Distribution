package typings.reactNativeChartsWrapper.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Phase extends StObject {
  
  var lineLength: Double
  
  var phase: js.UndefOr[Double] = js.undefined
  
  var spaceLength: Double
}
object Phase {
  
  inline def apply(lineLength: Double, spaceLength: Double): Phase = {
    val __obj = js.Dynamic.literal(lineLength = lineLength.asInstanceOf[js.Any], spaceLength = spaceLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[Phase]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Phase] (val x: Self) extends AnyVal {
    
    inline def setLineLength(value: Double): Self = StObject.set(x, "lineLength", value.asInstanceOf[js.Any])
    
    inline def setPhase(value: Double): Self = StObject.set(x, "phase", value.asInstanceOf[js.Any])
    
    inline def setPhaseUndefined: Self = StObject.set(x, "phase", js.undefined)
    
    inline def setSpaceLength(value: Double): Self = StObject.set(x, "spaceLength", value.asInstanceOf[js.Any])
  }
}

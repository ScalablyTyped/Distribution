package typings.reactNativeChartsWrapper.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Phase extends StObject {
  
  var lineLength: Double = js.native
  
  var phase: js.UndefOr[Double] = js.native
  
  var spaceLength: Double = js.native
}
object Phase {
  
  @scala.inline
  def apply(lineLength: Double, spaceLength: Double): Phase = {
    val __obj = js.Dynamic.literal(lineLength = lineLength.asInstanceOf[js.Any], spaceLength = spaceLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[Phase]
  }
  
  @scala.inline
  implicit class PhaseMutableBuilder[Self <: Phase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLineLength(value: Double): Self = StObject.set(x, "lineLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhase(value: Double): Self = StObject.set(x, "phase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhaseUndefined: Self = StObject.set(x, "phase", js.undefined)
    
    @scala.inline
    def setSpaceLength(value: Double): Self = StObject.set(x, "spaceLength", value.asInstanceOf[js.Any])
  }
}

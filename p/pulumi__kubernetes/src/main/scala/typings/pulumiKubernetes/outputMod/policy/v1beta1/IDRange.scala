package typings.pulumiKubernetes.outputMod.policy.v1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * IDRange provides a min/max of an allowed range of IDs.
  */
@js.native
trait IDRange extends StObject {
  
  /**
    * max is the end of the range, inclusive.
    */
  var max: Double = js.native
  
  /**
    * min is the start of the range, inclusive.
    */
  var min: Double = js.native
}
object IDRange {
  
  @scala.inline
  def apply(max: Double, min: Double): IDRange = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDRange]
  }
  
  @scala.inline
  implicit class IDRangeMutableBuilder[Self <: IDRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
  }
}

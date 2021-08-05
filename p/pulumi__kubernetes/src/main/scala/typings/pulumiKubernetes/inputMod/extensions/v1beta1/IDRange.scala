package typings.pulumiKubernetes.inputMod.extensions.v1beta1

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * IDRange provides a min/max of an allowed range of IDs. Deprecated: use IDRange from policy API Group instead.
  */
trait IDRange extends StObject {
  
  /**
    * max is the end of the range, inclusive.
    */
  var max: Input[Double]
  
  /**
    * min is the start of the range, inclusive.
    */
  var min: Input[Double]
}
object IDRange {
  
  inline def apply(max: Input[Double], min: Input[Double]): IDRange = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDRange]
  }
  
  extension [Self <: IDRange](x: Self) {
    
    inline def setMax(value: Input[Double]): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMin(value: Input[Double]): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
  }
}

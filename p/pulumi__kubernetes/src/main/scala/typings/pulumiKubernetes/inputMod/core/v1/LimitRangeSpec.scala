package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * LimitRangeSpec defines a min/max usage limit for resources that match on kind.
  */
trait LimitRangeSpec extends StObject {
  
  /**
    * Limits is the list of LimitRangeItem objects that are enforced.
    */
  var limits: Input[js.Array[Input[LimitRangeItem]]]
}
object LimitRangeSpec {
  
  inline def apply(limits: Input[js.Array[Input[LimitRangeItem]]]): LimitRangeSpec = {
    val __obj = js.Dynamic.literal(limits = limits.asInstanceOf[js.Any])
    __obj.asInstanceOf[LimitRangeSpec]
  }
  
  extension [Self <: LimitRangeSpec](x: Self) {
    
    inline def setLimits(value: Input[js.Array[Input[LimitRangeItem]]]): Self = StObject.set(x, "limits", value.asInstanceOf[js.Any])
    
    inline def setLimitsVarargs(value: Input[LimitRangeItem]*): Self = StObject.set(x, "limits", js.Array(value :_*))
  }
}

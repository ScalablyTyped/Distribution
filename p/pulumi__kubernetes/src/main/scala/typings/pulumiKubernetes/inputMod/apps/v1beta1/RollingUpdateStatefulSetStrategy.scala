package typings.pulumiKubernetes.inputMod.apps.v1beta1

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * RollingUpdateStatefulSetStrategy is used to communicate parameter for RollingUpdateStatefulSetStrategyType.
  */
trait RollingUpdateStatefulSetStrategy extends StObject {
  
  /**
    * Partition indicates the ordinal at which the StatefulSet should be partitioned.
    */
  var partition: js.UndefOr[Input[Double]] = js.undefined
}
object RollingUpdateStatefulSetStrategy {
  
  inline def apply(): RollingUpdateStatefulSetStrategy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RollingUpdateStatefulSetStrategy]
  }
  
  extension [Self <: RollingUpdateStatefulSetStrategy](x: Self) {
    
    inline def setPartition(value: Input[Double]): Self = StObject.set(x, "partition", value.asInstanceOf[js.Any])
    
    inline def setPartitionUndefined: Self = StObject.set(x, "partition", js.undefined)
  }
}

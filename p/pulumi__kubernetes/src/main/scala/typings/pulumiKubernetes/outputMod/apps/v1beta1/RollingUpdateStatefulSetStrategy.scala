package typings.pulumiKubernetes.outputMod.apps.v1beta1

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
  var partition: Double
}
object RollingUpdateStatefulSetStrategy {
  
  inline def apply(partition: Double): RollingUpdateStatefulSetStrategy = {
    val __obj = js.Dynamic.literal(partition = partition.asInstanceOf[js.Any])
    __obj.asInstanceOf[RollingUpdateStatefulSetStrategy]
  }
  
  extension [Self <: RollingUpdateStatefulSetStrategy](x: Self) {
    
    inline def setPartition(value: Double): Self = StObject.set(x, "partition", value.asInstanceOf[js.Any])
  }
}

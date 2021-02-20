package typings.pulumiKubernetes.outputMod.apps.v1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * RollingUpdateStatefulSetStrategy is used to communicate parameter for RollingUpdateStatefulSetStrategyType.
  */
@js.native
trait RollingUpdateStatefulSetStrategy extends StObject {
  
  /**
    * Partition indicates the ordinal at which the StatefulSet should be partitioned. Default value is 0.
    */
  var partition: Double = js.native
}
object RollingUpdateStatefulSetStrategy {
  
  @scala.inline
  def apply(partition: Double): RollingUpdateStatefulSetStrategy = {
    val __obj = js.Dynamic.literal(partition = partition.asInstanceOf[js.Any])
    __obj.asInstanceOf[RollingUpdateStatefulSetStrategy]
  }
  
  @scala.inline
  implicit class RollingUpdateStatefulSetStrategyMutableBuilder[Self <: RollingUpdateStatefulSetStrategy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPartition(value: Double): Self = StObject.set(x, "partition", value.asInstanceOf[js.Any])
  }
}

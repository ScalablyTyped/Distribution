package typings.pulumiKubernetes.inputMod.apps.v1

import typings.pulumiPulumi.outputMod.Input
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
  var partition: js.UndefOr[Input[Double]] = js.native
}
object RollingUpdateStatefulSetStrategy {
  
  @scala.inline
  def apply(): RollingUpdateStatefulSetStrategy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RollingUpdateStatefulSetStrategy]
  }
  
  @scala.inline
  implicit class RollingUpdateStatefulSetStrategyMutableBuilder[Self <: RollingUpdateStatefulSetStrategy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPartition(value: Input[Double]): Self = StObject.set(x, "partition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartitionUndefined: Self = StObject.set(x, "partition", js.undefined)
  }
}

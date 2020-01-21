package typings.pulumiKubernetes.outputMod.apps.v1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * RollingUpdateStatefulSetStrategy is used to communicate parameter for
  * RollingUpdateStatefulSetStrategyType.
  */
trait RollingUpdateStatefulSetStrategy extends js.Object {
  /**
    * Partition indicates the ordinal at which the StatefulSet should be partitioned. Default
    * value is 0.
    */
  val partition: Double
}

object RollingUpdateStatefulSetStrategy {
  @scala.inline
  def apply(partition: Double): RollingUpdateStatefulSetStrategy = {
    val __obj = js.Dynamic.literal(partition = partition.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RollingUpdateStatefulSetStrategy]
  }
}


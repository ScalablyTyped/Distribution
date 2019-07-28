package typings.atPulumiKubernetes.typesOutputMod.appsNs.v1beta1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * RollingUpdateStatefulSetStrategy is used to communicate parameter for
  * RollingUpdateStatefulSetStrategyType.
  */
trait RollingUpdateStatefulSetStrategy extends js.Object {
  /**
    * Partition indicates the ordinal at which the StatefulSet should be partitioned.
    */
  val partition: Double
}

object RollingUpdateStatefulSetStrategy {
  @scala.inline
  def apply(partition: Double): RollingUpdateStatefulSetStrategy = {
    val __obj = js.Dynamic.literal(partition = partition)
  
    __obj.asInstanceOf[RollingUpdateStatefulSetStrategy]
  }
}


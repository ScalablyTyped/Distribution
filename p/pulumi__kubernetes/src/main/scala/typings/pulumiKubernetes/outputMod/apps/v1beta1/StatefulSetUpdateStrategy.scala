package typings.pulumiKubernetes.outputMod.apps.v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * StatefulSetUpdateStrategy indicates the strategy that the StatefulSet controller will use to
  * perform updates. It includes any additional parameters necessary to perform the update for
  * the indicated strategy.
  */
trait StatefulSetUpdateStrategy extends js.Object {
  /**
    * RollingUpdate is used to communicate parameters when Type is
    * RollingUpdateStatefulSetStrategyType.
    */
  val rollingUpdate: RollingUpdateStatefulSetStrategy
  /**
    * Type indicates the type of the StatefulSetUpdateStrategy.
    */
  val `type`: String
}

object StatefulSetUpdateStrategy {
  @scala.inline
  def apply(rollingUpdate: RollingUpdateStatefulSetStrategy, `type`: String): StatefulSetUpdateStrategy = {
    val __obj = js.Dynamic.literal(rollingUpdate = rollingUpdate.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatefulSetUpdateStrategy]
  }
}


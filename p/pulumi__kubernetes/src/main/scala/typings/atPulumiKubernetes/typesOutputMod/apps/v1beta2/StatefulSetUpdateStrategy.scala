package typings.atPulumiKubernetes.typesOutputMod.apps.v1beta2

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
    * Type indicates the type of the StatefulSetUpdateStrategy. Default is RollingUpdate.
    */
  val `type`: String
}

object StatefulSetUpdateStrategy {
  @scala.inline
  def apply(rollingUpdate: RollingUpdateStatefulSetStrategy, `type`: String): StatefulSetUpdateStrategy = {
    val __obj = js.Dynamic.literal(rollingUpdate = rollingUpdate)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[StatefulSetUpdateStrategy]
  }
}


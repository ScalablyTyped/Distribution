package typings
package atPulumiKubernetesLib.typesOutputMod.appsNs.v1beta2Ns

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
  val `type`: java.lang.String
}

object StatefulSetUpdateStrategy {
  @scala.inline
  def apply(rollingUpdate: RollingUpdateStatefulSetStrategy, `type`: java.lang.String): StatefulSetUpdateStrategy = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("rollingUpdate")(rollingUpdate)
    __obj.asInstanceOf[StatefulSetUpdateStrategy]
  }
}


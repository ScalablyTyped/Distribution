package typings.atPulumiKubernetes.typesInputMod.apps.v1beta2

import typings.atPulumiPulumi.outputMod.Input
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
  var rollingUpdate: js.UndefOr[Input[RollingUpdateStatefulSetStrategy]] = js.undefined
  /**
    * Type indicates the type of the StatefulSetUpdateStrategy. Default is RollingUpdate.
    */
  var `type`: js.UndefOr[Input[String]] = js.undefined
}

object StatefulSetUpdateStrategy {
  @scala.inline
  def apply(rollingUpdate: Input[RollingUpdateStatefulSetStrategy] = null, `type`: Input[String] = null): StatefulSetUpdateStrategy = {
    val __obj = js.Dynamic.literal()
    if (rollingUpdate != null) __obj.updateDynamic("rollingUpdate")(rollingUpdate.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatefulSetUpdateStrategy]
  }
}


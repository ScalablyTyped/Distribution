package typings
package atPulumiKubernetesLib.typesOutputMod.appsNs.v1beta1Ns

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
  val `type`: java.lang.String
}


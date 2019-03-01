package typings
package atPulumiKubernetesLib.typesOutputMod.autoscalingNs.v1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ScaleStatus represents the current status of a scale subresource.
  */
trait ScaleStatus extends js.Object {
  /**
    * actual number of observed instances of the scaled object.
    */
  val replicas: scala.Double
  /**
    * label query over pods that should match the replicas count. This is same as the label
    * selector but in the string format to avoid introspection by clients. The string will be in
    * the same format as the query-param syntax. More info about label selectors:
    * http://kubernetes.io/docs/user-guide/labels#label-selectors
    */
  val selector: java.lang.String
}

object ScaleStatus {
  @scala.inline
  def apply(replicas: scala.Double, selector: java.lang.String): ScaleStatus = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("replicas")(replicas)
    __obj.updateDynamic("selector")(selector)
    __obj.asInstanceOf[ScaleStatus]
  }
}


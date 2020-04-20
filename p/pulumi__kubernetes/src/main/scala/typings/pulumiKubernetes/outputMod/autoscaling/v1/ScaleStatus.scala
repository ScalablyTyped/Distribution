package typings.pulumiKubernetes.outputMod.autoscaling.v1

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
  val replicas: Double
  /**
    * label query over pods that should match the replicas count. This is same as the label
    * selector but in the string format to avoid introspection by clients. The string will be in
    * the same format as the query-param syntax. More info about label selectors:
    * http://kubernetes.io/docs/user-guide/labels#label-selectors
    */
  val selector: String
}

object ScaleStatus {
  @scala.inline
  def apply(replicas: Double, selector: String): ScaleStatus = {
    val __obj = js.Dynamic.literal(replicas = replicas.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScaleStatus]
  }
}


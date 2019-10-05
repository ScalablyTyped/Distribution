package typings.atPulumiKubernetes.typesInputMod.autoscaling.v1

import typings.atPulumiPulumi.outputMod.Input
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
  var replicas: Input[Double]
  /**
    * label query over pods that should match the replicas count. This is same as the label
    * selector but in the string format to avoid introspection by clients. The string will be in
    * the same format as the query-param syntax. More info about label selectors:
    * http://kubernetes.io/docs/user-guide/labels#label-selectors
    */
  var selector: js.UndefOr[Input[String]] = js.undefined
}

object ScaleStatus {
  @scala.inline
  def apply(replicas: Input[Double], selector: Input[String] = null): ScaleStatus = {
    val __obj = js.Dynamic.literal(replicas = replicas.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScaleStatus]
  }
}


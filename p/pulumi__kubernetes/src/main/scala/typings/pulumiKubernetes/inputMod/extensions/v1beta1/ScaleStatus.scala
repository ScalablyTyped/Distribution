package typings.pulumiKubernetes.inputMod.extensions.v1beta1

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents the current status of a scale subresource.
  */
trait ScaleStatus extends js.Object {
  /**
    * actual number of observed instances of the scaled object.
    */
  var replicas: Input[Double]
  /**
    * label query over pods that should match the replicas count. More info:
    * http://kubernetes.io/docs/user-guide/labels#label-selectors
    */
  var selector: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  /**
    * label selector for pods that should match the replicas count. This is a serializated
    * version of both map-based and more expressive set-based selectors. This is done to avoid
    * introspection in the clients. The string will be in the same format as the query-param
    * syntax. If the target type only supports map-based selectors, both this field and map-based
    * selector field are populated. More info:
    * https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
    */
  var targetSelector: js.UndefOr[Input[String]] = js.undefined
}

object ScaleStatus {
  @scala.inline
  def apply(
    replicas: Input[Double],
    selector: Input[StringDictionary[Input[String]]] = null,
    targetSelector: Input[String] = null
  ): ScaleStatus = {
    val __obj = js.Dynamic.literal(replicas = replicas.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    if (targetSelector != null) __obj.updateDynamic("targetSelector")(targetSelector.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScaleStatus]
  }
}

